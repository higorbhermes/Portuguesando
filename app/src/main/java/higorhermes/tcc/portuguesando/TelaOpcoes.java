package higorhermes.tcc.portuguesando;

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
        button_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOpcoes.this, TelaQuestoes.class);
                startActivity(intent);
            }
        });
    }
}

