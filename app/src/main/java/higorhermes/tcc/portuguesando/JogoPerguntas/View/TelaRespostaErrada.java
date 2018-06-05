package higorhermes.tcc.portuguesando.JogoPerguntas.View;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import higorhermes.tcc.portuguesando.MainActivity;
import higorhermes.tcc.portuguesando.R;
import higorhermes.tcc.portuguesando.tela_menu;

public class TelaRespostaErrada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resposta_errada);
        this.playSound();
    }
    private void playSound() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.respostaerrada);
        mediaPlayer.start();
    }
}
