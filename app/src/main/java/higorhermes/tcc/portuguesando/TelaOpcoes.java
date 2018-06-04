package higorhermes.tcc.portuguesando;

import higorhermes.tcc.portuguesando.*;
import higorhermes.tcc.portuguesando.JogoPerguntas.View.TelaEscolherAssunto;
import higorhermes.tcc.portuguesando.JogoSemelhancas.View.JogoSemelhancas;
import higorhermes.tcc.portuguesando.View.JogoForca.JogoForca1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaOpcoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_opcoes);
        Button button_jogar = (Button) findViewById(R.id.button_jogoperguntas);
        Button button_jogarforca = (Button) findViewById(R.id.button_jogoforca);
        Button button_jogarsemelhancas = (Button) findViewById(R.id.button_jogosemelhancas);
        button_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOpcoes.this, TelaEscolherAssunto.class);
                startActivity(intent);
            }
        });
        button_jogarforca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOpcoes.this, JogoForca1.class);
                startActivity(intent);
            }
        });
        button_jogarsemelhancas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOpcoes.this, JogoSemelhancas.class);
                startActivity(intent);
            }
        });
    }
}

