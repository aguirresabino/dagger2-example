package com.example.aguirresabino.dagger2example.models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    public String retornarString() {
        return "Usuário injetado!";
    }

    public List<Pedido> listarPedidos() {
        return new ArrayList<Pedido>();
    }
}
