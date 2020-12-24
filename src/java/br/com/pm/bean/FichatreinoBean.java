
package br.com.pm.bean;

import br.com.pm.dao.FichatreinoDAO;
import br.com.pm.vo.Fichatreino;
import java.util.ArrayList;
import java.util.List;


public class FichatreinoBean {
    
    private Fichatreino fichatreino;
    private List<Fichatreino> lista;
    private List<Fichatreino> listaFiltrada;
    public FichatreinoBean(){
      fichatreino = new Fichatreino();
       lista= new FichatreinoDAO().listarTudo();
      listaFiltrada= new ArrayList<Fichatreino>();

  }

    public List<Fichatreino> getLista() {
        return lista;
    }

    public void setLista(List<Fichatreino> lista) {
        this.lista = lista;
    }

    public List<Fichatreino> getListaFiltrada() {
        return listaFiltrada;
    }

    public void setListaFiltrada(List<Fichatreino> listaFiltrada) {
        this.listaFiltrada = listaFiltrada;
    }
    

    public Fichatreino getFichatreino() {
        return fichatreino;
    }

    public void setFichatreino(Fichatreino fichatreino) {
        this.fichatreino = fichatreino;
    }
    
    public String salvar(){
        
        new FichatreinoDAO().salvar(this.fichatreino);
        return "index.xhtml";
    }
        public List<Fichatreino> listar(){
        return  new FichatreinoDAO().listarTudo();
        
    }

}
