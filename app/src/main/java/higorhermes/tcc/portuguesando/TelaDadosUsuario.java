package higorhermes.tcc.portuguesando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

import higorhermes.tcc.portuguesando.Model.Usuario;
import io.realm.Realm;

public class TelaDadosUsuario extends AppCompatActivity implements Serializable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dados_usuario);
        Button button_alterar = (Button) findViewById(R.id.button_alterarusuario);
        Button button_deletar = (Button) findViewById(R.id.button_deletarusuario);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        final String cpf = bundle.getString("cpf");
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        Usuario usuario = realm.where(Usuario.class)
                .equalTo("cpf",cpf).findFirst();
        TextView tv_cpfusuario = (TextView) findViewById(R.id.tv_cpfusuario);
        TextView tv_nomeusuario = (TextView) findViewById(R.id.tv_nomeusuario);
        TextView tv_emailusuario = (TextView) findViewById(R.id.tv_emailusuario);
        TextView tv_telefoneusuario = (TextView) findViewById(R.id.tv_telefoneusuario);
        TextView tv_datanascimentousuario = (TextView) findViewById(R.id.tv_datanascimentousuario);
        TextView tv_senhausuario = (TextView) findViewById(R.id.tv_senhausuario);
        TextView tv_usuario_acesso = (TextView) findViewById(R.id.tv_usuario_acesso);
        tv_cpfusuario.setText(cpf);
        tv_nomeusuario.setText(usuario.getNome());
        tv_emailusuario.setText(usuario.getEmail());
        tv_telefoneusuario.setText(usuario.getTelefone());
        tv_datanascimentousuario.setText(usuario.getData_nascimento());
        tv_senhausuario.setText(usuario.getSenha());
        tv_usuario_acesso.setText(usuario.getUser());
        button_alterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaDadosUsuario.this, TelaCadastro.class);
                startActivity(intent);
            }
        });
        button_deletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Realm realm = Realm.getDefaultInstance();
                Usuario usuario = realm.where(Usuario.class)
                        .equalTo("cpf", cpf).findFirst();
                realm.beginTransaction();
                usuario.deleteFromRealm();
                realm.commitTransaction();
                realm.close();
                Intent intent = new Intent(TelaDadosUsuario.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
