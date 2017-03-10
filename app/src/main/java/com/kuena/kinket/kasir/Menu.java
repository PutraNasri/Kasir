package com.kuena.kinket.kasir;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {
    private Button btnkasir;
    private Button btnpengeluaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnkasir = (Button) findViewById(R.id.kasir);
        btnpengeluaran = (Button) findViewById(R.id.pengeluaran);
        btnkasir.setBackgroundColor(Color.BLUE);
        btnkasir.setTextColor(Color.WHITE);
        btnpengeluaran.setBackgroundColor(Color.TRANSPARENT);
        btnpengeluaran.setTextColor(Color.BLACK);
    }
    public void pengeluaran(View v){
        Intent hasilIntent = new Intent(Menu.this, Pengeluaran.class);
        startActivity(hasilIntent);
        finish();
    }
}
