
package br.com.pm.bean;

import br.com.pm.dao.AlunoDAO;
import br.com.pm.vo.Aluno;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AlunoBean{
    
  private Aluno aluno;
  
  public AlunoBean(){
      aluno = new Aluno();
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
     return   new AlunoDAO().listarTudo();
        
    }

}
