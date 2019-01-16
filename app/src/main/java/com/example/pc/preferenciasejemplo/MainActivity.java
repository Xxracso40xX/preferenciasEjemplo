package com.example.pc.preferenciasejemplo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button boton;
    TextView txt;
    SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.button);
        txt = findViewById(R.id.editText);
        prefs = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
        int variableTelefono = prefs.getInt("telefono", 0);
        if(variableTelefono !=0)
        {
            txt.setText(""+variableTelefono);
        }
        else
        {

        }
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("telefono", Integer.parseInt(txt.getText().toString()));
                editor.commit();
            }
        });
       // int edad=10;
       /*SharedPreferences prefs = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
         SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("edadUsuario", edad);
        editor.commit();

       Integer valorLeido;
        valorLeido = prefs.getInt("edadUsuario", 0);
        System.out.println(valorLeido);
        */
        /*SharedPreferences prefs = getSharedPreferences("valores", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("edadUsuario", edad);
        editor.putString("nombreUsuario", "Oscar");
        editor.putString("apellidos Usuario", "Esteban Morillo");
        editor.commit();
        */
        /*SharedPreferences prefs = getSharedPreferences("valores", Context.MODE_PRIVATE);
        Toast.makeText(this, "Mi edad es " + prefs.getInt("edadUsuario", 0), Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Mi nombre es " + prefs.getString("nombreUsuario", null), Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Mis apellidos son " + prefs.getString("apellidos Usuario", null), Toast.LENGTH_LONG).show();
        */
    }
}
