package br.com.etecia.appgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    public void sairSistema(View view){
        Toast.makeText(Login_Activity.this,"sairSistema em contrução",Toast.LENGTH_SHORT).show();
    }

    public void entrarSistema(View view) {
        Toast.makeText(Login_Activity.this,"entrarSistema em contrução",Toast.LENGTH_SHORT).show();
    }
}
