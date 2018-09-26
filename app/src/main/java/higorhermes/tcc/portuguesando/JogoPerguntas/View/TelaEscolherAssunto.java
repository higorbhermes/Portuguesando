package higorhermes.tcc.portuguesando.JogoPerguntas.View;

import  higorhermes.tcc.portuguesando.*;
import higorhermes.tcc.portuguesando.Model.Assunto;
import higorhermes.tcc.portuguesando.Model.Questao;
import io.realm.Realm;
import io.realm.RealmResults;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;

public class TelaEscolherAssunto extends AppCompatActivity implements Serializable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolher_assunto);
        adicionarAssunto();
        adicionarQuestoes();
        /*for (int i=0; i<2; i++){
            Realm realm2 = Realm.getDefaultInstance();
            Questao questao = realm.where(Questao.class)
                    .equalTo("id_questao", questoes[i].getId_questao()).findFirst();
            if(questao == null){
                realm.beginTransaction();
                realm.copyToRealm(questoes[i]);
                realm.commitTransaction();
            }
            realm2.close();
            i++;
        }
        */
        Button bt = (Button) findViewById(R.id.button_iniciarjogo);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("id_questao", 0);
                Intent intent = new Intent(TelaEscolherAssunto.this, TelaQuestao.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


    public void adicionarAssunto(){
        Assunto[] assuntos = new Assunto[200];
        assuntos[0] = new Assunto(1, "CRASE", "Regras de uso do acento grave");
        for (int i=0; i<200; i++){
            if(assuntos[i] != null){
                Realm realm = Realm.getDefaultInstance();
                Assunto assunto = realm.where(Assunto.class)
                        .equalTo("id",assuntos[i].getId()).findFirst();
                if(assunto == null){
                    realm.beginTransaction();
                    realm.copyToRealm(assuntos[i]);
                    realm.commitTransaction();
                }
                realm.close();
            }
            i++;
        }
    }


    public void adicionarQuestoes(){
        Questao[] questoes = new Questao[20000];
        Realm realm = Realm.getDefaultInstance();
        Assunto assunto1 = realm.where(Assunto.class)
                .equalTo("id", 1).findFirst();
        realm.close();
        questoes[0] = new Questao(0, "Assinale a alternativa na qual o emprego do sinal indicativo de crase está correto. (UFRPE, 2018)");
        questoes[0].setAlternativa_a("Acho que o reconhecimento deve ser extensivo às mulheres em geral.");
        questoes[0].setAlternativa_b("O respeito é devido à toda pessoa, seja mulher ou homem.");
        questoes[0].setAlternativa_c("Mulheres são extraordinárias, mas àquelas que são mães merecem aplausos especiais. ");
        questoes[0].setAlternativa_d("Temos mesmo que parabenizar à quem foi tão importante para a história de nosso país");
        questoes[0].setAlternativa_e("Tomara que “Extraordinárias mulheres” suscite em nós um novo olhar para às mulheres.");
        questoes[0].setAlternativa_correta(1);
        questoes[0].adicionarAjudas(2, 3, 4);
        questoes[0].setObjAssunto(assunto1);
        //questoes[0].setId_assunto(assunto1.getId());
        questoes[1] = new Questao(1, "O acento grave marca, na escrita, o fenômeno da crase, isto é, representa a fusão de dois a. Dessa forma, o acento indicativo da crase está corretamente empregado em: (CESGRANRIO, 2018)");
        questoes[1].setAlternativa_a("Meu sonho é conhecer à Paris dos romances.");
        questoes[1].setAlternativa_b("Todos deveriam sempre lembrar à quem agradecer.");
        questoes[1].setAlternativa_c("Restrinjo-me àquilo que ficou combinado na reunião.");
        questoes[1].setAlternativa_d("Ensinaram à ela muito sobre a história da psicanálise.");
        questoes[1].setAlternativa_e("Referimo-nos à toda raiva acumulada em nossos corações.");
        questoes[1].setAlternativa_correta(3);
        questoes[1].adicionarAjudas(2, 1, 4);
        questoes[1].setObjAssunto(assunto1);
        //questoes[1].setId_assunto(assunto1.getId());
        for (int i=0; i<20000; i++){
            if(questoes[i] != null){
                Realm realm2 = Realm.getDefaultInstance();
                Questao questao = realm.where(Questao.class)
                        .equalTo("id_questao", questoes[i].getId_questao()).findFirst();
                if(questao == null){
                    realm.beginTransaction();
                    realm.copyToRealm(questoes[i]);
                    realm.commitTransaction();
                }
                realm2.close();
            }
            i++;
        }
        realm.close();
    }
}
