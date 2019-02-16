package com.example.aguirresabino.dagger2example.dagger.modules;

import android.util.Log;

import com.example.aguirresabino.dagger2example.models.Usuario;

import java.util.List;

import dagger.Module;
import dagger.Provides;

// A anotação @Module é utilizada para indicar classes que fornecem dependências.
@Module
public class UsuarioModule {

    public static final String TAG = "Dagger2";

    @Provides
    public Usuario provideUsuario() {
        Log.i(UsuarioModule.TAG, "Provendo Usuário");
        return new Usuario();
    }

}
