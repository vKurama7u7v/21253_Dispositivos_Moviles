package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnCanal = findViewById(R.id.btnChange);
        EditText etCanal = findViewById(R.id.etCanal);
        TextView txtCanal = findViewById(R.id.txtCanal);
        TextView txtLegendCanal = findViewById(R.id.txtLegendCanal);
        Spinner mySpinner = findViewById(R.id.mySpinner);
        imageView = findViewById(R.id.img1);

        mySpinner.setOnItemSelectedListener(this);
        btnCanal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aqui va el codigo

                // Obtendremos el valor del EditText y lo asignamos al TextView inferior
                String text = etCanal.getText().toString();
                Toast.makeText(MainActivity.this, "El valor era " + text, Toast.LENGTH_LONG).show();

                txtLegendCanal.setText(text);
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obteniendo valores
                String canal = etCanal.getText().toString();
                String programa = mySpinner.getSelectedItem().toString();

                Intent i = new Intent(MainActivity.this, DatosActivity.class);
                i.putExtra("canal", canal);
                i.putExtra("programa", programa);
                startActivity(i);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String item = adapterView.getItemAtPosition(i).toString();
        Snackbar.make(adapterView, "Programa Seleccionado " + item, Snackbar.LENGTH_LONG).show();

        if (i == 0){
            imageView.setImageResource(R.drawable.img1);
        } else if (i == 1){
            imageView.setImageResource(R.drawable.img2);
        } else {
            imageView.setImageResource(R.drawable.img3);
        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}