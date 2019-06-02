package jcv.com.micole;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import jcv.com.micole.home.cursos.Vistas.CursoActivity;

public class Inicio extends AppCompatActivity {

    private Button btnLogin;
    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppThemeLogin);
        setContentView(R.layout.activity_inicio);

        findElements();
        events();
    }

    private void findElements(){
        btnLogin = findViewById(R.id.btn_login);
        user = findViewById(R.id.txtEdtUser);
        pass = findViewById(R.id.txtEdtPass);
    }
    private void events() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(i);
            }
        });
    }
}
