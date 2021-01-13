
package br.com.pm.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Mensalidade implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    private String tipoPagamento;
    private double valorPagamento;
    @ManyToOne
    private Aluno aluno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
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
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.dataVencimento);
        hash = 17 * hash + Objects.hashCode(this.dataPagamento);
        hash = 17 * hash + Objects.hashCode(this.tipoPagamento);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.valorPagamento) ^ (Double.doubleToLongBits(this.valorPagamento) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.aluno);
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
        final Mensalidade other = (Mensalidade) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorPagamento) != Double.doubleToLongBits(other.valorPagamento)) {
            return false;
        }
        if (!Objects.equals(this.tipoPagamento, other.tipoPagamento)) {
            return false;
        }
        if (!Objects.equals(this.dataVencimento, other.dataVencimento)) {
            return false;
        }
        if (!Objects.equals(this.dataPagamento, other.dataPagamento)) {
            return false;
        }
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Mensalidade{" + "id=" + id + ", dataVencimento=" + dataVencimento + ", dataPagamento=" + dataPagamento + '}';
    }

    
    
    
}
