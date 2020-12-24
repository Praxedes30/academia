
package br.com.pm.bean;

import br.com.pm.dao.AvaliacaofisicaDAO;
import br.com.pm.vo.Avaliacaofisica;
import java.util.ArrayList;
import java.util.List;


public class AvaliacaofisicaBean {
    
    private Avaliacaofisica avaliacaofisica;
    private List<Avaliacaofisica> lista;
    private List<Avaliacaofisica> listaFiltrada;
    public AvaliacaofisicaBean(){
      avaliacaofisica = new Avaliacaofisica();
      lista= new AvaliacaofisicaDAO().listarTudo();
      listaFiltrada= new ArrayList<Avaliacaofisica>();
  }

    public List<Avaliacaofisica> getLista() {
        return lista;
    }

    public void setLista(List<Avaliacaofisica> lista) {
        this.lista = lista;
    }

    public List<Avaliacaofisica> getListaFiltrada() {
        return listaFiltrada;
    }

    public void setListaFiltrada(List<Avaliacaofisica> listaFiltrada) {
        this.listaFiltrada = listaFiltrada;
    }
    

    public Avaliacaofisica getAvaliacaofisica() {
        return avaliacaofisica;
    }

    public void setAvaliacaofisica(Avaliacaofisica avaliacaofisica) {
        this.avaliacaofisica = avaliacaofisica;
    }
    
    public String salvar(){
        
        new AvaliacaofisicaDAO().salvar(this.avaliacaofisica);
        return "index.xhtml";
    }
    public List<Avaliacaofisica> listar(){
     return  new AvaliacaofisicaDAO().listarTudo();
        
}
}