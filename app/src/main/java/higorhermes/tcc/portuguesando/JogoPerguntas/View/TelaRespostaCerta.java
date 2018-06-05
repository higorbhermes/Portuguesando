package higorhermes.tcc.portuguesando.JogoPerguntas.View;
import higorhermes.tcc.portuguesando.*;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TelaRespostaCerta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resposta_certa);
        this.playSound();
    }
    private void playSound() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.respostacerta);
        mediaPlayer.start();
    }
}
