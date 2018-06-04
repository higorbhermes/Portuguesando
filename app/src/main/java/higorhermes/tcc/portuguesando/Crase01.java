package higorhermes.tcc.portuguesando;

import higorhermes.tcc.portuguesando.*;
import higorhermes.tcc.portuguesando.JogoPerguntas.View.TelaRespostaCerta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Crase01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crase01);
        Button bt = (Button) findViewById(R.id.button_responder1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Crase01.this, TelaRespostaCerta.class);
                startActivity(intent);
            }
        });
    }
}
