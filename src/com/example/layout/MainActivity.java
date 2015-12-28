package com.example.layout;

import android.app.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener, OnLongClickListener, OnTouchListener
{

	TextView tv1, tvEdad, tvTocame;
	Button btnEnviar, btnEnviarLento;
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
        btnEnviar = (Button) findViewById(R.id.btnEnviarRapido);
        
        //Agregar Listen al Button 
        btnEnviar.setOnClickListener(this);
        
        //Inicialización Btn Lento
        btnEnviarLento = (Button) findViewById(R.id.btnEnviarLento);
        
        //Agregar Listen
        btnEnviarLento.setOnLongClickListener(this);
        
        //TouchEvent
        tvTocame = (TextView) findViewById(R.id.tvT);
        
        tvTocame.setTextSize(20);
        
        tvTocame.setOnTouchListener(this);
        
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
		case R.id.btnEnviarRapido:
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

	@Override
	public boolean onLongClick(View v) 
	{
		//Muestra la edad
        tvEdad = (TextView) findViewById(R.id.tvEdad);
        switch (v.getId())
        {
		case R.id.btnEnviarLento:
			 //Se guarda lo que se escribió en el EditText
	        edad = et1.getText().toString();
	        tvEdad.setTextSize(20);
	        tvEdad.setTextColor(Color.BLACK);
	        tvEdad.setText("Tú edad es: " + edad);
			break;

		default:
			break;
		}
		return false;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		
		if(event.getAction() == MotionEvent.ACTION_DOWN)
		{
			tvTocame.setText("!Deja de Tocarme!");
		}
		if(event.getAction() == MotionEvent.ACTION_MOVE)
		{
			tvTocame.setText("!Dejame Quieto!");
		}
		if(event.getAction() == MotionEvent.ACTION_UP)
		{
			tvTocame.setText("!Por fin me hiciste caso!");
		}
			
		return true;
	}


}
