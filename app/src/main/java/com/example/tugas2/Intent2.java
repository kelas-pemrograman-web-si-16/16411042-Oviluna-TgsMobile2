package com.example.tugas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Intent2 extends AppCompatActivity {
    TextView txtnama, txtnpm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);

        txtnama = (TextView) findViewById(R.id.txtPassingData1);
        txtnpm = (TextView) findViewById(R.id.txtPassingData2);

        Intent intent =getIntent();
        String nama = intent.getStringExtra("nama");
        txtnama.setText(nama);

        String npm =intent.getStringExtra("npm");
        txtnpm.setText(npm);
    }
}
