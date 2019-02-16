package com.example.aguirresabino.dagger2example;

import android.app.Application;
import android.util.Log;
import android.widget.TabHost;
import android.widget.Toast;

import com.example.aguirresabino.dagger2example.dagger.components.DaggerUsuarioComponent;
import com.example.aguirresabino.dagger2example.dagger.components.UsuarioComponent;

public class DaggerApplication extends Application {

    private static UsuarioComponent usuarioComponent;
    private static final String TAG = "Dagger2";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "Iniciando DaggerApplication");
        initDagger();
        Log.i(TAG, "Finalizando método onCreate() de DaggerApplication");
    }

    private void initDagger() {
        usuarioComponent = DaggerUsuarioComponent.builder().build();
    }

    public static UsuarioComponent getUsuarioComponent() {
        return usuarioComponent;
    }
}
