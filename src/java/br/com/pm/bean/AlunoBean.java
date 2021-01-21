
package br.com.pm.bean;

import br.com.pm.dao.AlunoDAO;
import br.com.pm.vo.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class AlunoBean{
    
  private Aluno aluno;
  private Aluno alunoSelecionado;
  private List<Aluno> lista;
  private List<Aluno> listaFiltrada;
  public AlunoBean(){
      aluno = new Aluno();
      lista= new AlunoDAO().listarTudo();
      listaFiltrada= new ArrayList<Aluno>();
  }

    public Aluno getAlunoSelecionado() {
        return alunoSelecionado;
    }

    public void setAlunoSelecionado(Aluno alunoSelecionado) {
        this.alunoSelecionado = alunoSelecionado;
    }
   

    public List<Aluno> getLista() {
        lista= new AlunoDAO().listarTudo();
        return lista;
    }

    public void setLista(List<Aluno> lista) {
        this.lista = lista;
    }

    public List<Aluno> getListaFiltrada() {
        return listaFiltrada;
    }

    public void setListaFiltrada(List<Aluno> listaFiltrada) {
        this.listaFiltrada = listaFiltrada;
    }
    

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public String salvar(){   
        new AlunoDAO().salvar(this.aluno);
        return "index.xhtml";
    }
    
    public List<Aluno> listar(){
     return  new AlunoDAO().listarTudo();
        
    }
    
    public void remover() {
        new AlunoDAO().remover(alunoSelecionado);
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Removido com sucesso", "O aluno"+alunoSelecionado.getNome()+"foi removido.");
        FacesContext.getCurrentInstance().addMessage(null, message);
        lista=new AlunoDAO().listarTudo();
    }
}
