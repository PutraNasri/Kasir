package com.kuena.kinket.kasir;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Login extends Activity {
private Button btnlogin;
    private ImageView imglogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnlogin=(Button)findViewById(R.id.login);
        imglogo=(ImageView)findViewById(R.id.logo);
        btnlogin.setBackgroundColor(Color.BLUE);
        btnlogin.setTextColor(Color.WHITE);
        imglogo.setImageResource(R.drawable.card);
    }
    public void login(View v){
        Intent hasilIntent = new Intent(Login.this, Menu.class);
        startActivity(hasilIntent);
        finish();
    }
}
