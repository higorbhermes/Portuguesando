package higorhermes.tcc.portuguesando;

import higorhermes.tcc.portuguesando.*;
import higorhermes.tcc.portuguesando.JogoPerguntas.View.TelaEscolherAssunto;
import higorhermes.tcc.portuguesando.JogoSemelhancas.View.JogoSemelhancas1;
import higorhermes.tcc.portuguesando.JogoSemelhancas.View.JogoSemelhancas2;
import higorhermes.tcc.portuguesando.JogoSemelhancas.View.JogoSemelhancas3;
import higorhermes.tcc.portuguesando.JogoSemelhancas.View.JogoSemelhancas4;
import higorhermes.tcc.portuguesando.View.JogoForca.JogoForca1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
                List<Integer> possiveis = new ArrayList<Integer>();
                //Inclui os 60 números possíveis
                for (int i = 2; i < 5; i++) {
                    possiveis.add(i);
                }
                //Embaralha a lista de números
                Collections.shuffle(possiveis);

                //Os sorteados agora são os 6 primeiros
                for (int i = 2; i < 5; i++) {
                    if (i==2){
                        Intent intent = new Intent(TelaOpcoes.this, JogoSemelhancas2.class);
                         startActivity(intent);
                    }
                    if (i==3){
                        Intent intent = new Intent(TelaOpcoes.this, JogoSemelhancas3.class);
                        startActivity(intent);
                    }
                    if (i==4){
                        Intent intent = new Intent(TelaOpcoes.this, JogoSemelhancas4.class);
                        startActivity(intent);
                    }
                }

            }
        });
    }
}

