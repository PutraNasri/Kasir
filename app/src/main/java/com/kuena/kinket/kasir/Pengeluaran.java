package com.kuena.kinket.kasir;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pengeluaran extends Activity {
private Button btnkasir;
private Button btnpengeluaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengeluaran);

        btnkasir = (Button) findViewById(R.id.kasir);
        btnpengeluaran = (Button) findViewById(R.id.pengeluaran);
        btnkasir.setBackgroundColor(Color.TRANSPARENT);
        btnkasir.setTextColor(Color.BLACK);
        btnpengeluaran.setBackgroundColor(Color.BLUE);
        btnpengeluaran.setTextColor(Color.WHITE);

    }
    public void kasir(View v){
        Intent hasilIntent = new Intent(Pengeluaran.this, Menu.class);
        startActivity(hasilIntent);
        finish();
    }
}
