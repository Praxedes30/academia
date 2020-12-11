
package br.com.pm.bean;

import br.com.pm.dao.AvaliacaofisicaDAO;
import br.com.pm.vo.Avaliacaofisica;


public class AvaliacaofisicaBean {
    
    private Avaliacaofisica avaliacaofisica;
    
    public AvaliacaofisicaBean(){
      avaliacaofisica = new Avaliacaofisica();
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
    
}
