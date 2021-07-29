package com.example.covidarioandroid.model;

import java.util.Date;

public class Paciente {
    String nome;
    Date data;
    Date dataAtual;
    String lugares;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }

    public String getLugares() {
        return lugares;
    }

    public void setLugares(String luagres) {
        this.lugares = luagres;
    }
}

