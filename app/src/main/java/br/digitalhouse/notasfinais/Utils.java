package br.digitalhouse.notasfinais;

import android.widget.EditText;

public class Utils {

    public float converteValor (EditText caixaDeTexto){
        float valorMedia = Float.parseFloat(caixaDeTexto.getText().toString());
        return valorMedia;
    }

    public float calcularMedia (EditText notaP, EditText notaS, EditText notaT, EditText notaQ,){
        float notaPConvertida = converteValor(notaP);
        float notaSConvertida = converteValor(notaS);
        float notaTConvertida = converteValor(notaT);
        float notaQConvertida = converteValor(notaQ);
        float notasSoma = notaPConvertida + notaSConvertida + notaTConvertida + notaQConvertida;
        float media = notasSoma / 4;
        return media;
    }
}
