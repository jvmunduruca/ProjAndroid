package br.com.etecia.appgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    EditText txtUsuario;
    EditText txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
    }

    public void sairSistema(View view){
        String usuario = txtUsuario.getText().toString();
        String senha = txtSenha.getText().toString();
        usuario = "";
        senha = "";
        Toast.makeText(Login_Activity.this,txtUsuario.getText()+"sairSistema em contrução",Toast.LENGTH_SHORT).show();
    }

    public void entrarSistema(View view) {
        String usuario = txtUsuario.getText().toString();
        String senha = txtSenha.getText().toString();

        if(usuario.equals("etecia") && senha.equals("etecia")){
            Toast.makeText(Login_Activity.this,txtUsuario.getText()+" Bem vindo ao Sistema",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(Login_Activity.this,"Senha  ou Usuário Invalidos",Toast.LENGTH_SHORT).show();
        }

    }
}
