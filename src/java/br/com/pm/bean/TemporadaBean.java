
package br.com.pm.bean;

import br.com.pm.dao.TemporadaDAO;
import br.com.pm.vo.Temporada;
import java.util.ArrayList;
import java.util.List;


public class TemporadaBean {
    
    private Temporada temporada;
    private List<Temporada> lista;
    private List<Temporada> listaFiltrada;

    public TemporadaBean(){
      temporada = new Temporada();
      lista= new TemporadaDAO().listarTudo();
      listaFiltrada= new ArrayList<Temporada>();
  }

    public List<Temporada> getLista() {
        return lista;
    }

    public void setLista(List<Temporada> lista) {
        this.lista = lista;
    }

    public List<Temporada> getListaFiltrada() {
        return listaFiltrada;
    }

    public void setListaFiltrada(List<Temporada> listaFiltrada) {
        this.listaFiltrada = listaFiltrada;
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
    public List<Temporada> listar(){
     return  new TemporadaDAO().listarTudo();
        
    }
}
