
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
 private double altura;
 private double peso;
 private int idade;
 private String sexo ;
 private String cidade; 
 private String telefone ;
 private double indiceGorduraCorporal;
 private String tipoFisico ;
 

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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getIndiceGorduraCorporal() {
        return indiceGorduraCorporal;
    }

    public void setIndiceGorduraCorporal(double indiceGorduraCorporal) {
        this.indiceGorduraCorporal = indiceGorduraCorporal;
    }

    public String getTipoFisico() {
        return tipoFisico;
    }

    public void setTipoFisico(String tipoFisico) {
        this.tipoFisico = tipoFisico;
    }



    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.cpf);
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.altura) ^ (Double.doubleToLongBits(this.altura) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 17 * hash + this.idade;
        hash = 17 * hash + Objects.hashCode(this.sexo);
        hash = 17 * hash + Objects.hashCode(this.cidade);
        hash = 17 * hash + Objects.hashCode(this.telefone);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.indiceGorduraCorporal) ^ (Double.doubleToLongBits(this.indiceGorduraCorporal) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.tipoFisico);
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
        if (Double.doubleToLongBits(this.altura) != Double.doubleToLongBits(other.altura)) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (this.idade != other.idade) {
            return false;
        }
        if (Double.doubleToLongBits(this.indiceGorduraCorporal) != Double.doubleToLongBits(other.indiceGorduraCorporal)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.tipoFisico, other.tipoFisico)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nome;
    }

   
    }

   
 
 

