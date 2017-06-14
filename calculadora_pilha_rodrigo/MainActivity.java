package com.example.alunos.amancio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Stack pilha = new Stack<Double>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.exibir();
    }

    protected void empilhar(View num){
        TextView view1 = (TextView) findViewById(R.id.editNum);
        if(view1.getText().toString().compareTo(".") != 0) {
            if (view1.getText().toString().compareTo("") != 0) {
                double numero = Double.parseDouble(view1.getText().toString());
                pilha.push(numero);
            }
            this.exibir();
        }
        view1.setText("");
    }

    protected void desempilhar(View num){
        if(pilha.size() > 0)
        pilha.pop();
        this.exibir();
    }

    protected void limpar(View num){
        if(pilha.size() > 0)
            pilha.removeAllElements();
        this.exibir();
    }

    protected void somar(View num){
        if(pilha.size() > 1) {
            double x = (double) pilha.pop();
            double y = (double) pilha.pop();
            double z = x + y;
            pilha.push(z);
            this.exibir();
        }
    }

    protected void subtrair(View num){
        if(pilha.size() > 1) {
            double x = (double) pilha.pop();
            double y = (double) pilha.pop();
            double z = x - y;
            pilha.push(z);
            this.exibir();
        }
    }

    protected void multiplicar(View num){
        if(pilha.size() > 1) {
            double x = (double) pilha.pop();
            double y = (double) pilha.pop();
            double z = x * y;
            pilha.push(z);
            this.exibir();
        }
    }

    protected void dividir(View num) {
        if(pilha.size() > 1) {
            double x = (double) pilha.pop();
            double y = (double) pilha.pop();
            if(y == 0) {
                pilha.push(y);
                pilha.push(x);
            }
            else {
                double z = x / y;
                pilha.push(z);
                this.exibir();
            }
        }
    }

    protected void exibir(){
        TextView view2 = (TextView) findViewById(R.id.outputStack);
        view2.setText(pilha.toString());
    }

}
