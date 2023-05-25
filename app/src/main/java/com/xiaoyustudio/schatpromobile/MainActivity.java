package com.xiaoyustudio.schatpromobile;

import static java.lang.System.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View v){
        String host = "127.0.0.1";
        int port = 19730;
        try {
            Socket Client = new Socket(host, port);
            Writer writer = new OutputStreamWriter(Client.getOutputStream());
            String Loginstr= "登录";
            String LoginStr = new String(Loginstr.getBytes("GBK"),"GBK");
            writer.write(LoginStr);
            writer.flush();
            writer.close();
            Client.close();
            out.println("登录☆★☆Xiaoxiaoyu");
        }catch (IOException e) {
            e.printStackTrace();}
    }
}
