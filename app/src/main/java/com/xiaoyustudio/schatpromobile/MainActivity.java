package com.xiaoyustudio.schatpromobile;

import static java.lang.System.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity {
    String host = "192.168.5.4";
    int port = 19730;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View v){

        try {
            Socket Client = new Socket(host, port);
            Writer writer = new OutputStreamWriter(Client.getOutputStream());
            String Loginstr= "登录";
            String LoginStr = new String(Loginstr.getBytes("GBK"),"GBK");
            writer.write(LoginStr);
            writer.flush();
            writer.close();
            Client.close();

        }catch (IOException e) {
            e.printStackTrace();}
    }
    public void setServerAddress(){

        
    }
    public void goSetting(View view){
        Intent intent= new Intent(this, SettingsActivity1.class);
        startActivity(intent);

    }
    public void goDe_Chatroom(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);

    }
}
