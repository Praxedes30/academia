
package br.com.pm.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Fichatreino implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String aluno;
    private String instrutor;
    @Temporal(TemporalType.DATE)
    private Date dataFeita;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public Date getDataFeita() {
        return dataFeita;
    }

    public void setDataFeita(Date dataFeita) {
        this.dataFeita = dataFeita;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.aluno);
        hash = 53 * hash + Objects.hashCode(this.instrutor);
        hash = 53 * hash + Objects.hashCode(this.dataFeita);
        hash = 53 * hash + Objects.hashCode(this.descricao);
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
        final Fichatreino other = (Fichatreino) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        if (!Objects.equals(this.instrutor, other.instrutor)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.dataFeita, other.dataFeita)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fichatreino{" + "id=" + id + ", aluno=" + aluno + ", instrutor=" + instrutor + '}';
    }
    
    
}