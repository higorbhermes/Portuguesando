package higorhermes.tcc.portuguesando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tela_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);
        Button button_jogar = (Button) findViewById(R.id.button_jogar);
        Button button_caderno = (Button) findViewById(R.id.button_caderno);
        button_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela_menu.this, TelaOpcoes.class);
                startActivity(intent);
            }
        });
        button_caderno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tela_menu.this, Crase.class);
                startActivity(intent);
            }
        });
    }
}
