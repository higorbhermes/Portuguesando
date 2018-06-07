package higorhermes.tcc.portuguesando;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import higorhermes.tcc.portuguesando.Model.Usuario;
import io.realm.Realm;

public class TelaAlterarDados extends AppCompatActivity {
   String cpf;
    Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_alterar_dados);
        Button button_salvar = (Button) findViewById(R.id.button_salvardadosalterados);
        final EditText et_cpfusuario = (EditText) findViewById(R.id.et_alterarcpf);
        final EditText et_nomeusuario = (EditText) findViewById(R.id.et_alterarnome);
        final EditText et_emailusuario = (EditText) findViewById(R.id.et_alteraremail);
        final EditText et_telefoneusuario = (EditText) findViewById(R.id.et_alterarTelefone);
        final EditText et_datanascimentousuario = (EditText) findViewById(R.id.et_datanascimento);
        final EditText et_senhausuario = (EditText) findViewById(R.id.et_alterarsenha);
        final EditText et_usuario_acesso = (EditText) findViewById(R.id.et_alterarnomeusuario);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        cpf = bundle.getString("cpf");
        Realm realm = Realm.getDefaultInstance();
        usuario = realm.where(Usuario.class)
                .equalTo("cpf", cpf).findFirst();
        realm.close();
        et_cpfusuario.setText(cpf);
        et_nomeusuario.setText(usuario.getNome());
        et_emailusuario.setText(usuario.getEmail());
        et_senhausuario.setText(usuario.getSenha());
        button_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Realm realm2 = Realm.getDefaultInstance();
                realm2.beginTransaction();
                usuario.setNome(et_nomeusuario.getText().toString());
                usuario.setCpf(et_cpfusuario.getText().toString());
                cpf = et_cpfusuario.getText().toString();
                usuario.setEmail(et_emailusuario.getText().toString());
                usuario.setSenha(et_senhausuario.getText().toString());
                realm2.copyToRealm(usuario);
                realm2.commitTransaction();
                realm2.close();
                Bundle bundle = new Bundle();
                bundle.putString("cpf", cpf);
                Intent intent = new Intent(TelaAlterarDados.this, TelaDadosUsuario.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    /*public void finish(){
        String msg1 = "Ação Não Permitida!";
        AlertDialog.Builder dlg1 = new AlertDialog.Builder(TelaAlterarDados.this);
        dlg1.setMessage(msg1);
        dlg1.setNeutralButton("OK", null);
        dlg1.show();
    }*/
}








