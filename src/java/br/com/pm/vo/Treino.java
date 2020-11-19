
package br.com.pm.vo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Treino implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String exercicio;
    private int repeticoes;
    private String fichatreino;
    @ManyToOne
    private Personaltrainer personaltrainer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public String getFichatreino() {
        return fichatreino;
    }

    public void setFichatreino(String fichatreino) {
        this.fichatreino = fichatreino;
    }

    public Personaltrainer getPersonaltrainer() {
        return personaltrainer;
    }

    public void setPersonaltrainer(Personaltrainer personaltrainer) {
        this.personaltrainer = personaltrainer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.exercicio);
        hash = 29 * hash + this.repeticoes;
        hash = 29 * hash + Objects.hashCode(this.fichatreino);
        hash = 29 * hash + Objects.hashCode(this.personaltrainer);
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
        final Treino other = (Treino) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.repeticoes != other.repeticoes) {
            return false;
        }
        if (!Objects.equals(this.exercicio, other.exercicio)) {
            return false;
        }
        if (!Objects.equals(this.fichatreino, other.fichatreino)) {
            return false;
        }
        if (!Objects.equals(this.personaltrainer, other.personaltrainer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Treino{" + "id=" + id + ", exercicio=" + exercicio + ", fichatreino=" + fichatreino + ", personaltrainer=" + personaltrainer + '}';
    }
    
    
    
}
