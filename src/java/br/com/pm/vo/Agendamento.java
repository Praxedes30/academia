/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pm.vo;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author valer
 */
public class Agendamento implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String descricao;
    @Temporal(TemporalType.DATE)
    private Date dataMarcada;
    @Temporal(TemporalType.TIME)
    private Time horaChegada;
    @Temporal(TemporalType.TIME)
    private Time horaSaida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataMarcada() {
        return dataMarcada;
    }

    public void setDataMarcada(Date dataMarcada) {
        this.dataMarcada = dataMarcada;
    }

    public Time getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(Time horaChegada) {
        this.horaChegada = horaChegada;
    }

    public Time getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Time horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.descricao);
        hash = 47 * hash + Objects.hashCode(this.dataMarcada);
        hash = 47 * hash + Objects.hashCode(this.horaChegada);
        hash = 47 * hash + Objects.hashCode(this.horaSaida);
        return hash;
        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agendamento other = (Agendamento) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.dataMarcada, other.dataMarcada)) {
            return false;
        }
        if (!Objects.equals(this.horaChegada, other.horaChegada)) {
            return false;
        }
        if (!Objects.equals(this.horaSaida, other.horaSaida)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
