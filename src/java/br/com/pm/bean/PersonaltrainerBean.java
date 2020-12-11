
package br.com.pm.bean;

import br.com.pm.dao.PersonaltrainerDAO;
import br.com.pm.vo.Personaltrainer;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PersonaltrainerBean {
    
    private Personaltrainer personaltrainer;
  
  public PersonaltrainerBean(){
      personaltrainer = new Personaltrainer();
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

}
