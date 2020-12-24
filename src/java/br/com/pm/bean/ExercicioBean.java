
package br.com.pm.bean;

import br.com.pm.dao.ExercicioDAO;
import br.com.pm.vo.Exercicio;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ExercicioBean {
    
    private Exercicio exercicio;
    private List<Exercicio> lista;
    private List<Exercicio> listaFiltrada;
    public ExercicioBean(){
      exercicio = new Exercicio();
      lista= new ExercicioDAO().listarTudo();
      listaFiltrada= new ArrayList<Exercicio>();
}

    public List<Exercicio> getLista() {
        return lista;
    }

    public void setLista(List<Exercicio> lista) {
        this.lista = lista;
    }

    public List<Exercicio> getListaFiltrada() {
        return listaFiltrada;
    }

    public void setListaFiltrada(List<Exercicio> listaFiltrada) {
        this.listaFiltrada = listaFiltrada;
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
    public List<Exercicio> listar(){
     return  new ExercicioDAO().listarTudo();
}
}