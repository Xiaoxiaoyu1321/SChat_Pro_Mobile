package com.xiaoyustudio.schatpromobile;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.Chat);
        

        SharedPreferences sharedPreferences;
        sharedPreferences = getSharedPreferences("root_preferences",Context.MODE_PRIVATE);
        textView.setText(sharedPreferences.getString("密码","nmsl"));

    }
    public void AddMessage(View view){
        TextView textView = findViewById(R.id.Chat);
        EditText editText = findViewById(R.id.SendThings);
        String aThing = textView.getText().toString();
        String bThing = editText.getText().toString();
        String cThing =  aThing  + "self:" + bThing+ "\n";
        textView.setText(cThing);
        editText.setText("");



    }
}