package com.example.aguirresabino.dagger2example.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.aguirresabino.dagger2example.DaggerApplication;
import com.example.aguirresabino.dagger2example.R;
import com.example.aguirresabino.dagger2example.models.Usuario;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = "Dagger2";

    // Assim como em java se ou ee, utilizar a anotação @Inject para injetar uma dependência.
    @Inject
    Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Informando ao Dagger que esta activity irá utilizar um component para que a injeção possa ser feita
        DaggerApplication.getUsuarioComponent().inject(this);
        //
        Log.i(TAG, usuario.retornarString());
    }
}
