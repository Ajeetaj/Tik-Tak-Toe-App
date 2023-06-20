package com.example.tiktaktoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.concurrent.timer

class GamePlayActivity : AppCompatActivity() {
    lateinit var bt1:Button
    lateinit var player1:TextView
    lateinit var player2:TextView
    lateinit var bt2:Button
    lateinit var bt3:Button
    lateinit var bt4:Button
    lateinit var bt5:Button
    lateinit var bt6:Button
    lateinit var bt7:Button
    lateinit var bt8:Button
    lateinit var bt9:Button
    var flag=0
    var count=0
    var xwin=0
    var owin=0
    var startingFlag=0
    lateinit var b1:String
    lateinit var b2:String
    lateinit var b3:String
    lateinit var b4:String
    lateinit var b5:String
    lateinit var b6:String
    lateinit var b7:String
    lateinit var b8:String
    lateinit var b9:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_play)
        initialize()

    }

    private fun initialize() {
        bt1=findViewById(R.id.btn1);
        bt2=findViewById(R.id.btn2);
        bt3=findViewById(R.id.btn3);
        bt4=findViewById(R.id.btn4);
        bt5=findViewById(R.id.btn5);
        bt6=findViewById(R.id.btn6);
        bt7=findViewById(R.id.btn7);
        bt8=findViewById(R.id.btn8);
        bt9=findViewById(R.id.btn9);
        player1=findViewById(R.id.player1)
        player2=findViewById(R.id.player2)
    }
    public fun buttonClicked(view:View){
        var currentBtn =view as Button
        if(currentBtn.getText().toString().equals("")){
            count++

        if (flag==0){
            currentBtn.setTextColor(Color.WHITE)
            currentBtn.setText("X")
            flag=1
        }
        else{
            currentBtn.setTextColor(Color.CYAN)
            currentBtn.setText("O")
            flag=0
        }

        if(count>4){
            b1=bt1.getText().toString()
            b2=bt2.getText().toString()
            b3=bt3.getText().toString()
            b4=bt4.getText().toString()
            b5=bt5.getText().toString()
            b6=bt6.getText().toString()
            b7=bt7.getText().toString()
            b8=bt8.getText().toString()
            b9=bt9.getText().toString()
            if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                Toast.makeText(this,"Player "+b1+" is Winner",Toast.LENGTH_LONG).show()
                if(b1.equals("X")){
                    xwin=xwin+1
                    player1.setText("Player1:X: "+ xwin)
                }
                else{
                    owin=owin+1
                    player2.setText("Player2:O: "+ owin)
                }
                normalReset()
            }
            else if(b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
                Toast.makeText(this,"Player "+b4+" is Winner",Toast.LENGTH_LONG).show()
                if(b4.equals("X")){
                    xwin=xwin+1
                    player1.setText("Player1:X: "+ xwin)
                }
                else {
                    owin=owin+1
                    player2.setText("Player2:O: "+ owin)
                }
                normalReset()
            }
            else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
                Toast.makeText(this,"Player "+b7+" is Winner",Toast.LENGTH_LONG).show()
                if(b7.equals("X")){
                    xwin=xwin+1
                    player1.setText("Player1:X: "+ xwin)
                }
                else {
                    owin=owin+1
                    player2.setText("Player2:O: "+ owin)
                }
                normalReset()
            }
            else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                Toast.makeText(this,"Player "+b1+" is Winner",Toast.LENGTH_LONG).show()
                if(b1.equals("X")){
                    xwin=xwin+1
                    player1.setText("Player1:X: "+ xwin)
                }
                else {
                    owin=owin+1
                    player2.setText("Player2:O: "+ owin)
                }
                normalReset()
            }
            else if(b2.equals(b5) && b5.equals(b8) && !b2.equals("")){
                Toast.makeText(this,"Player "+b2+" is Winner",Toast.LENGTH_LONG).show()
                if(b2.equals("X")){
                    xwin=xwin+1
                    player1.setText("Player1:X: "+ xwin)
                }
                else {
                    owin=owin+1
                    player2.setText("Player2:O: "+ owin)
                }
                normalReset()
            }
            else if(b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
                Toast.makeText(this,"Player "+b3+" is Winner",Toast.LENGTH_LONG).show()
                if(b3.equals("X")){
                    xwin=xwin+1
                    player1.setText("Player1:X: "+ xwin)
                }
                else {
                    owin=owin+1
                    player2.setText("Player2:O: "+ owin)
                }
                normalReset()
            }
            else if(b1.equals(b5) && b5.equals(b9) && !b1.equals("")){
                Toast.makeText(this,"Player "+b1+" is Winner",Toast.LENGTH_LONG).show()
                if(b1.equals("X")){
                    xwin=xwin+1
                    player1.setText("Player1:X: "+ xwin)
                }
                else {
                    owin=owin+1
                    player2.setText("Player2:O: "+ owin)
                }
                normalReset()
            }
            else if(b3.equals(b5) && b5.equals(b7) && !b3.equals("")){
                Toast.makeText(this,"Player "+b3+" is Winner",Toast.LENGTH_LONG).show()
                if(b3.equals("X")){
                    xwin=xwin+1
                    player1.setText("Player1:X: "+ xwin)
                }
                else {
                    owin=owin+1
                    player2.setText("Player2:O: "+ owin)
                }
                normalReset()
            }
            else if(count==9){
                Toast.makeText(this,"Match Draw",Toast.LENGTH_LONG).show()
                normalReset()
            }
        }
        }
    }
    public fun normalReset(){
        bt1.setText("")
        bt2.setText("")
        bt3.setText("")
        bt4.setText("")
        bt5.setText("")
        bt6.setText("")
        bt7.setText("")
        bt8.setText("")
        bt9.setText("")
        count = 0
        if(startingFlag==0){
            startingFlag=1
            flag=startingFlag
        }
        else{
            startingFlag=0
            flag=startingFlag
        }
    }
    public fun resetValue(view: View?){
            bt1.setText("")
            bt2.setText("")
            bt3.setText("")
            bt4.setText("")
            bt5.setText("")
            bt6.setText("")
            bt7.setText("")
            bt8.setText("")
            bt9.setText("")
            count = 0
            owin = 0
            xwin = 0
        player1.setText("Player1:X: "+0)
        player2.setText("Player2:O: "+0)
    }
}