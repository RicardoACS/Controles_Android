package com.example.layout;

import android.app.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener
{

	TextView tv1;
	TextView tvEdad;
	Button btnEnviar;
	EditText et1;
	String edad = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicialización de TextView
        tv1 = (TextView) findViewById(R.id.tvTitulo);
        //Seteo del Texto
        tv1.setText("Tú Edad");
        //Seteo del tamaño del Texto
        tv1.setTextSize(20);
        //Setep del color del Texto
        tv1.setTextColor(Color.RED);
        
        //Inicialización de EditText
        et1 = (EditText) findViewById(R.id.et1);
        //Se guarda lo que se escribió en el EditText
        edad = et1.getText().toString();
        
        //Inicialización del Button
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        
        //Agregar Listen al Button 
        btnEnviar.setOnClickListener(this);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) 
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public void onClick(View v) 
	{
		//Muestra la edad
        tvEdad = (TextView) findViewById(R.id.tvEdad);
        switch (v.getId())
        {
		case R.id.btnEnviar:
			 //Se guarda lo que se escribió en el EditText
	        edad = et1.getText().toString();
	        tvEdad.setTextSize(20);
	        tvEdad.setTextColor(Color.BLACK);
	        tvEdad.setText("Tú edad es: " + edad);
			break;

		default:
			break;
		}
       
		
	}


}
