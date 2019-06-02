package jcv.com.micole.home.cursos.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jcv.com.micole.R;

public class CursoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);

        findElements();
        events();
    }

    private void findElements() {
    }

    private void events() {
    }
}
