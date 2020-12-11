
package br.com.pm.bean;

import br.com.pm.dao.FichatreinoDAO;
import br.com.pm.vo.Fichatreino;


public class FichatreinoBean {
    
    private Fichatreino fichatreino;
    
    public FichatreinoBean(){
      fichatreino = new Fichatreino();
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

}
