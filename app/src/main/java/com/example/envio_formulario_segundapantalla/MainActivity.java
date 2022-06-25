package com.example.envio_formulario_segundapantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtnombre,txtapellido,txtedad,txtcorreo;
    Button envia;
    Intent extraer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre=(EditText) findViewById(R.id.nombre);
        txtapellido=(EditText) findViewById(R.id.apellido);
        txtedad=(EditText) findViewById(R.id.edad);
        txtcorreo=(EditText) findViewById(R.id.correo);
        envia=(Button) findViewById(R.id.enviar);
        envia.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                                extraer=new Intent(getApplicationContext(),MainActivity2.class);
                                extraer.putExtra("nombre",txtnombre.getText().toString());
                                extraer.putExtra("apellido",txtapellido.getText().toString());
                                extraer.putExtra("edad",txtedad.getText().toString());
                                extraer.putExtra("correo",txtcorreo.getText().toString());
                                startActivity(extraer);
                            }

        });
    }
}