package higorhermes.tcc.portuguesando.JogoSemelhancas.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import higorhermes.tcc.portuguesando.JogoPerguntas.View.TelaRespostaCerta;
import higorhermes.tcc.portuguesando.JogoPerguntas.View.TelaRespostaErrada;
import higorhermes.tcc.portuguesando.R;

public class JogoSemelhancas4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_semelhancas4);
        Button button1 = (Button) findViewById(R.id.button_opcao1semelhanca4);
        Button button2 = (Button) findViewById(R.id.button_opcao2semelhanca4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JogoSemelhancas4.this, TelaRespostaErrada.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JogoSemelhancas4.this, TelaRespostaCerta.class);
                startActivity(intent);
            }
        });
    }
}

