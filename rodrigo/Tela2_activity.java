package com.example.alunos.rodrigo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2_activity);
        //it vem como parametro
        Intent it2 = getIntent();
        //Pega o bundle b como parametro
        Bundle b = it2.getExtras();
        //Pega a string da bundle por sua chave
        String a = b.getString("Nome");
        //atribui para o textview a tela2
        TextView txt1 = (TextView) findViewById(R.id.tela2View);
        txt1.setText(a);
    }
}
