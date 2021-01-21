
package br.com.pm.vo;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Agendamento implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String descricao;
    @Temporal(TemporalType.DATE)
    private Date dataMarcada;
    @Temporal(TemporalType.TIME)
    private Date horaChegada;
    @Temporal(TemporalType.TIME)
    private Date horaSaida;
    @ManyToOne
    private Aluno aluno;

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

    public Date getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(Date horaChegada) {
        this.horaChegada = horaChegada;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + Objects.hashCode(this.dataMarcada);
        hash = 97 * hash + Objects.hashCode(this.horaChegada);
        hash = 97 * hash + Objects.hashCode(this.horaSaida);
        hash = 97 * hash + Objects.hashCode(this.aluno);
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
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
        
    }

    
    
    
    

