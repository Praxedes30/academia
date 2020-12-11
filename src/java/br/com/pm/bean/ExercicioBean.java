
package br.com.pm.bean;

import br.com.pm.dao.ExercicioDAO;
import br.com.pm.vo.Exercicio;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ExercicioBean {
    
    private Exercicio exercicio;
    
    public ExercicioBean(){
      exercicio = new Exercicio();
    
}

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }
    
    public String salvar(){
        
        new ExercicioDAO().salvar(this.exercicio);
        return "index.xhtml";
    }
}