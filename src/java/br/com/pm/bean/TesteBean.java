
package br.com.pm.bean;

import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ApplicationScoped
public class TesteBean implements Serializable{
    
    private String texto= "Praxedes";
    private int contador= 0;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void incrementarContador(){
        this.contador++;
        System.out.println(contador);
    }
}