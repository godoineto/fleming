package com.codenation.squad5.flemingapi.api.hospitais.dto;

import com.codenation.squad5.flemingapi.api.common.model.Endereco;
import com.codenation.squad5.flemingapi.api.leitos.model.Leito;

import java.util.ArrayList;
import java.util.List;

public class HospitalDTO {

    private String id;

    private String nome;

    private Endereco endereco;

    private List<Leito> leitos;

    public HospitalDTO() {
        leitos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Leito> getLeitos() {
        return leitos;
    }

    public void setLeitos(List<Leito> leitos) {
        this.leitos = leitos;
    }
}
