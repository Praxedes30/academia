
package br.com.pm.bean;

import br.com.pm.dao.TemporadaDAO;
import br.com.pm.vo.Temporada;


public class TemporadaBean {
    
    private Temporada temporada;

    public TemporadaBean(){
      temporada = new Temporada();
  }
    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }
    public String salvar(){
        
     new TemporadaDAO().salvar(this.temporada);
        return "index.xhtml";
    }
}
