
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
public class Personaltrainer implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String nomePersonal;
    private String senhaPersonal;
    private String cpfPersonal;
    @Temporal(TemporalType.DATE)
    private Date horarioPersonal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePersonal() {
        return nomePersonal;
    }

    public void setNomePersonal(String nomePersonal) {
        this.nomePersonal = nomePersonal;
    }

    public String getSenhaPersonal() {
        return senhaPersonal;
    }

    public void setSenhaPersonal(String senhaPersonal) {
        this.senhaPersonal = senhaPersonal;
    }

    public String getCpfPersonal() {
        return cpfPersonal;
    }

    public void setCpfPersonal(String cpfPersonal) {
        this.cpfPersonal = cpfPersonal;
    }

    public Date getHorarioPersonal() {
        return horarioPersonal;
    }

    public void setHorarioPersonal(Date horarioPersonal) {
        this.horarioPersonal = horarioPersonal;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.id;
        hash = 61 * hash + Objects.hashCode(this.nomePersonal);
        hash = 61 * hash + Objects.hashCode(this.senhaPersonal);
        hash = 61 * hash + Objects.hashCode(this.cpfPersonal);
        hash = 61 * hash + Objects.hashCode(this.horarioPersonal);
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
        final Personaltrainer other = (Personaltrainer) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nomePersonal, other.nomePersonal)) {
            return false;
        }
        if (!Objects.equals(this.senhaPersonal, other.senhaPersonal)) {
            return false;
        }
        if (!Objects.equals(this.cpfPersonal, other.cpfPersonal)) {
            return false;
        }
        if (!Objects.equals(this.horarioPersonal, other.horarioPersonal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Personaltrainer{" + "id=" + id + ", nomePersonal=" + nomePersonal + ", senhaPersonal=" + senhaPersonal + ", cpfPersonal=" + cpfPersonal + ", horarioPersonal=" + horarioPersonal + '}';
    }

   

    
}
