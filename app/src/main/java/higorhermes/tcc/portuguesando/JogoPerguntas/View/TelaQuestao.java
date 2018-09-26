package higorhermes.tcc.portuguesando.JogoPerguntas.View;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

import higorhermes.tcc.portuguesando.Crase01;
import higorhermes.tcc.portuguesando.Model.Questao;
import higorhermes.tcc.portuguesando.Model.Usuario;
import higorhermes.tcc.portuguesando.R;
import io.realm.Realm;

public class TelaQuestao extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_questao);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int id_questao = bundle.getInt("id_questao");
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();

        final Questao questao = realm.where(Questao.class)
                .equalTo("id_questao", id_questao).findFirst();
        TextView tv_texto = (TextView) findViewById(R.id.tv_texto);
        final RadioButton  rb_alternativa1 = (RadioButton) findViewById(R.id.rb_alternativa1);
        final RadioButton  rb_alternativa2 = (RadioButton) findViewById(R.id.rb_alternativa2);
        final RadioButton  rb_alternativa3 = (RadioButton) findViewById(R.id.rb_alternativa3);
        final RadioButton  rb_alternativa4 = (RadioButton) findViewById(R.id.rb_alternativa4);
        final RadioButton  rb_alternativa5 = (RadioButton) findViewById(R.id.rb_alternativa5);
        tv_texto.setText(questao.getTexto());
        rb_alternativa1.setText(questao.getAlternativa_a());
        rb_alternativa2.setText(questao.getAlternativa_b());
        rb_alternativa3.setText(questao.getAlternativa_c());
        rb_alternativa4.setText(questao.getAlternativa_d());
        rb_alternativa5.setText(questao.getAlternativa_e());
        Button bt = (Button) findViewById(R.id.button_responder1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaQuestao.this, TelaRespostaCerta.class);
                startActivity(intent);
            }
        });
        Button button_ajuda = (Button) findViewById(R.id.button_ajuda1);
        button_ajuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if ((questao.getAjuda1() == 1) || (questao.getAjuda2()==1)  || (questao.getAjuda3()==1)){
                   rb_alternativa1.setText("Alternativa Errada");
               }
                if ((questao.getAjuda1() == 2) || (questao.getAjuda2()==2)  || (questao.getAjuda3()==2)){
                    rb_alternativa2.setText("Alternativa Errada");
                }
                if ((questao.getAjuda1() == 3) || (questao.getAjuda2()==3)  || (questao.getAjuda3()==3)){
                    rb_alternativa3.setText("Alternativa Errada");
                }
                if ((questao.getAjuda1() == 4) || (questao.getAjuda2()==4)  || (questao.getAjuda3()==4)){
                    rb_alternativa4.setText("Alternativa Errada");
                }
                if ((questao.getAjuda1() == 5) || (questao.getAjuda2()==5)  || (questao.getAjuda3()==5)){
                    rb_alternativa5.setText("Alternativa Errada");
                }
            }
        });
    }

}


