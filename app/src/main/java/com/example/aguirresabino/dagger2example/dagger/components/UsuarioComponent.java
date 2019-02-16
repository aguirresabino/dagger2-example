package com.example.aguirresabino.dagger2example.dagger.components;

import com.example.aguirresabino.dagger2example.activities.MainActivity;
import com.example.aguirresabino.dagger2example.dagger.modules.UsuarioModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
// A anotação @Component recebe os módulos que ela pode acessar.
@Component( modules = {UsuarioModule.class})
public interface UsuarioComponent {
    // Definindo quem pode utilizar os módulos deste Component
    void inject(MainActivity mainActivity);
}

// Este Component deve ser disponibilizado na classe Application do projeto, permitindo que
// todos possam acessá-lo.
