package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnRegresar = findViewById(R.id.btnRegresar);
        TextView txtCanal = findViewById(R.id.canalValue);
        TextView txtPrograma = findViewById(R.id.programaValue);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        if(getIntent() != null){
            Bundle extras = getIntent().getExtras();

            if(extras != null){
                String canal = extras.getString("canal");
                String programa = extras.getString("programa");

                Toast.makeText(DatosActivity.this, "El valor era " + canal + " - " + programa, Toast.LENGTH_LONG).show();

                // Seteando valores
                // txtCanal.setText(canal);
                // txtPrograma.setText(programa);
            }
        }
    }
}