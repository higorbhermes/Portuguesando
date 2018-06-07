package higorhermes.tcc.portuguesando;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import higorhermes.tcc.portuguesando.JogoPerguntas.View.TelaEscolherAssunto;
import higorhermes.tcc.portuguesando.Model.Usuario;
import io.realm.Realm;

public class TelaCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        final EditText et_nome = (EditText) findViewById(R.id.et_nome);
        final EditText et_cpf = (EditText) findViewById(R.id.et_cpf);
        final EditText et_datanascimento = (EditText) findViewById(R.id.et_datanascimento);
        final EditText et_telefone = (EditText) findViewById(R.id.et_Telefone);
        final EditText et_email = (EditText) findViewById(R.id.et_email);
        final EditText et_usuario = (EditText) findViewById(R.id.et_usuario);
        final EditText et_senha = (EditText) findViewById(R.id.et_senha);
        final EditText et_confirmacaosenha = (EditText) findViewById(R.id.et_confirmacaosenha);
        Button button_salvar = (Button) findViewById(R.id.button_salvar);
        Button button_limpar = (Button) findViewById(R.id.button_limpar);
        button_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((et_cpf.getText().toString()).equals("")){
                    String msg = "Campo CPF é obrigatório!";
                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaCadastro.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                }
                else {
                    if ((et_nome.getText().toString()).equals("")){
                        String msg = "Campo Nome é obrigatório!";
                        AlertDialog.Builder dlg = new AlertDialog.Builder(TelaCadastro.this);
                        dlg.setMessage(msg);
                        dlg.setNeutralButton("OK", null);
                        dlg.show();
                    }
                    else{
                        if((et_usuario.getText().toString()).equals("")){
                            String msg = "Escolha um nome de Usuário!";
                            AlertDialog.Builder dlg = new AlertDialog.Builder(TelaCadastro.this);
                            dlg.setMessage(msg);
                            dlg.setNeutralButton("OK", null);
                            dlg.show();
                        }
                        else {
                            if ((et_senha.getText().toString()).equals("")) {
                                String msg = "Digite uma senha!";
                                AlertDialog.Builder dlg = new AlertDialog.Builder(TelaCadastro.this);
                                dlg.setMessage(msg);
                                dlg.setNeutralButton("OK", null);
                                dlg.show();
                            }
                            else{
                                if((et_email.getText().toString()).equals("")){
                                    String msg = "Campo Email é obrigatório!!";
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaCadastro.this);
                                    dlg.setMessage(msg);
                                    dlg.setNeutralButton("OK", null);
                                    dlg.show();
                                }
                                else{
                                    if ((et_senha.getText().toString()).equals(et_confirmacaosenha.getText().toString())){
                                        Realm realm = Realm.getDefaultInstance();
                                        String cpf = et_cpf.getText().toString();
                                        Usuario usuario = realm.where(Usuario.class)
                                                    .equalTo("cpf", cpf).findFirst();
                                        realm.close();
                                        if (usuario == null) {
                                                    Realm realm2 = Realm.getDefaultInstance();
                                                    realm2.beginTransaction();
                                                    Usuario usuario3 = new Usuario();
                                                    usuario3.setNome(et_nome.getText().toString());
                                                    usuario3.setData_nascimento(et_datanascimento.getText().toString());
                                                    usuario3.setCpf(et_cpf.getText().toString());
                                                    usuario3.setEmail(et_email.getText().toString());
                                                    usuario3.setSenha(et_senha.getText().toString());
                                                    usuario3.setTelefone(et_telefone.getText().toString());
                                                    usuario3.setSenha(et_senha.getText().toString());
                                                    realm2.copyToRealm(usuario3);
                                                    realm2.commitTransaction();
                                                    realm2.close();
                                                    String msg1 = "Cadastro Realizado com Sucesso!";
                                                    AlertDialog.Builder dlg1 = new AlertDialog.Builder(TelaCadastro.this);
                                                    dlg1.setMessage(msg1);
                                                    dlg1.setNeutralButton("OK", null);
                                                    dlg1.show();
                                                    Bundle bundle = new Bundle();
                                                    bundle.putString("cpf", usuario3.getCpf());
                                                    Intent intent = new Intent(TelaCadastro.this, tela_menu.class);
                                                    intent.putExtras(bundle);
                                                    startActivity(intent);
                                            }
                                            else{
                                            String msg = "Este CPF já está cadastrado!!";
                                            AlertDialog.Builder dlg = new AlertDialog.Builder(TelaCadastro.this);
                                            dlg.setMessage(msg);
                                            dlg.setNeutralButton("OK", null);
                                            dlg.show();
                                        }
                                    }
                                    else{
                                        String msg = "Digite novamente sua senha!";
                                        AlertDialog.Builder dlg = new AlertDialog.Builder(TelaCadastro.this);
                                        dlg.setMessage(msg);
                                        dlg.setNeutralButton("OK", null);
                                        dlg.show();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
        button_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            et_nome.setText("");
            et_cpf.setText("");
            et_telefone.setText("");
            et_email.setText("");
            et_datanascimento.setText("");
            et_usuario.setText("");
            et_senha.setText("");
            et_confirmacaosenha.setText("");
            }
        });
    }
}
