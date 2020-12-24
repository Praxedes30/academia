
package br.com.pm.bean;

import br.com.pm.dao.PersonaltrainerDAO;
import br.com.pm.vo.Personaltrainer;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PersonaltrainerBean {
    
    private Personaltrainer personaltrainer;
    private List<Personaltrainer> lista;
    private List<Personaltrainer> listaFiltrada;
  public PersonaltrainerBean(){
      personaltrainer = new Personaltrainer();
      lista= new PersonaltrainerDAO().listarTudo();
      listaFiltrada= new ArrayList<Personaltrainer>();
  }

    public List<Personaltrainer> getLista() {
        return lista;
    }

    public void setLista(List<Personaltrainer> lista) {
        this.lista = lista;
    }

    public List<Personaltrainer> getListaFiltrada() {
        return listaFiltrada;
    }

    public void setListaFiltrada(List<Personaltrainer> listaFiltrada) {
        this.listaFiltrada = listaFiltrada;
    }
   

    public Personaltrainer getPersonaltrainer() {
        return personaltrainer;
    }

    public void setPersonaltrainer(Personaltrainer personaltrainer) {
        this.personaltrainer = personaltrainer;
    }
    public String salvar(){
        
        new PersonaltrainerDAO().salvar(this.personaltrainer);
        return "index.xhtml";
    }
    public List<Personaltrainer> listar(){
     return  new PersonaltrainerDAO().listarTudo();

}
}