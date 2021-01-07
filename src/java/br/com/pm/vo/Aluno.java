
package br.com.pm.vo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno implements Serializable{
   
 @Id
 @GeneratedValue
 private int id;
 private String cpf;
 private String nome;
 private int datadenascimeto;
 private String endereco; 
 private String telefone ;

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public int getDatadenascimeto() {
        return datadenascimeto;
    }

    public void setDatadenascimeto(int datadenascimeto) {
        this.datadenascimeto = datadenascimeto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.cpf);
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + this.datadenascimeto;
        hash = 47 * hash + Objects.hashCode(this.endereco);
        hash = 47 * hash + Objects.hashCode(this.telefone);
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
        final Aluno other = (Aluno) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.datadenascimeto != other.datadenascimeto) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nome  ;
    }

}
