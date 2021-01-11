
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
public class Aluno implements Serializable{
   
 @Id
 @GeneratedValue
 private int id;
 private String cpf;
 private String nome;
 @Temporal(TemporalType.DATE)
 private Date datadenascimento;
 private String endereco; 
 private String telefone ;
 private String nomeCE;
 private String enderecoCE;
 private String telefoneCE;

 

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
    
      public Date getDatadenascimento() {
        return datadenascimento;
    
    }
     
     public void setDatadenascimento(Date datadenascimento) {
        this.datadenascimento = datadenascimento;

    }
  

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeCE() {
        return nomeCE;
    }

    public void setNomeCE(String nomeCE) {
        this.nomeCE = nomeCE;
    }

    public String getEnderecoCE() {
        return enderecoCE;
    }

    public void setEnderecoCE(String enderecoCE) {
        this.enderecoCE = enderecoCE;
    }

    public String getTelefoneCE() {
        return telefoneCE;
    }

    public void setTelefoneCE(String telefoneCE) {
        this.telefoneCE = telefoneCE;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.cpf);
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.datadenascimento);
        hash = 47 * hash + Objects.hashCode(this.endereco);
        hash = 47 * hash + Objects.hashCode(this.telefone);
        hash = 47 * hash + Objects.hashCode(this.nomeCE);
        hash = 47 * hash + Objects.hashCode(this.enderecoCE);
        hash = 47 * hash + Objects.hashCode(this.telefoneCE);
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
        if (this.datadenascimento != other.datadenascimento) {
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
        if (!Objects.equals(this.nomeCE, other.nomeCE)) {
            return false;
        }
        if (!Objects.equals(this.enderecoCE, other.enderecoCE)) {
            return false;
        }
        if (!Objects.equals(this.telefoneCE, other.telefoneCE)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nome  ;
    }

}
