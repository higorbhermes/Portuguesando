package higorhermes.tcc.portuguesando.JogoPerguntas.View;

import  higorhermes.tcc.portuguesando.*;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaEscolherAssunto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolher_assunto);
        Button bt = (Button) findViewById(R.id.button_iniciarjogo);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaEscolherAssunto.this, Crase01.class);
                startActivity(intent);
            }
        });
    }
}
