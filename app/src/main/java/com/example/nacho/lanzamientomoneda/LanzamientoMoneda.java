package com.example.nacho.lanzamientomoneda;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;


public class LanzamientoMoneda extends Activity implements View.OnClickListener{

    final static String TAG = "HechosCuriososActivity";
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanzamiento_moneda);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        Toast toast = Toast.makeText(this, "Hola mundo", Toast.LENGTH_LONG);
        toast.show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.lanzamiento_moneda, menu);
        return true;
    }

    public void apretarBoton(){
        Random random = new Random();
        String [] almacen={"cara","cruz"};
        String busca = almacen[random.nextInt(almacen.length)];
        Toast.makeText(this, busca, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    //cuando pulse boton
    public void onClick(View v) {
        apretarBoton();
    }
}
