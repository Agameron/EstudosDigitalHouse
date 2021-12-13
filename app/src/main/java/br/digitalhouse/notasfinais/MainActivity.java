package br.digitalhouse.notasfinais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mostrarMedia(View view){
        EditText eTB1 = (EditText) findViewById(R.id.eTB1);
        EditText eTB2 = (EditText) findViewById(R.id.eTB2);
        EditText eTB3 = (EditText) findViewById(R.id.eTB3);
        EditText eTB4 = (EditText) findViewById(R.id.eTB4);
        Button btnCalcular = (Button) findViewById(R.id.BtnCalcular);
        TextView tVresultado = (TextView) findViewById(R.id.tVresultado);
        Utils utils = new Utils();
        float mediaFinal = utils.calcularMedia(eTB1, eTB2, eTB3, eTB4);
        tVresultado.setText("A media fina é "+ mediaFinal);

    }

}