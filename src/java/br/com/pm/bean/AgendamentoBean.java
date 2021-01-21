
package br.com.pm.bean;

import br.com.pm.dao.AgendamentoDAO;
import br.com.pm.vo.Agendamento;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class AgendamentoBean {
    
    private Agendamento agendamento;
    private Agendamento agendamentoSelecionado;
    private List<Agendamento> lista;
    private List<Agendamento> listaFiltrada;
    public AgendamentoBean(){
      agendamento = new Agendamento();
      lista= new AgendamentoDAO().listarTudo();
      listaFiltrada= new ArrayList<Agendamento>();
  }

    public Agendamento getAgendamentoSelecionado() {
        return agendamentoSelecionado;
    }

    public void setAgendamentoSelecionado(Agendamento agendamentoSelecionado) {
        this.agendamentoSelecionado = agendamentoSelecionado;
    }
    

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public List<Agendamento> getLista() {
        lista= new AgendamentoDAO().listarTudo();
        return lista;
    }

    public void setLista(List<Agendamento> lista) {
        this.lista = lista;
    }

    public List<Agendamento> getListaFiltrada() {
        return listaFiltrada;
    }

    public void setListaFiltrada(List<Agendamento> listaFiltrada) {
        this.listaFiltrada = listaFiltrada;
    }
    
    public String salvar(){   
        new AgendamentoDAO().salvar(this.agendamento);
        return "index.xhtml";
    }
    
    public List<Agendamento> listar(){
     return  new AgendamentoDAO().listarTudo();
        
    }
    
    public void remover() {
        new AgendamentoDAO().remover(agendamentoSelecionado);
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Removido com sucesso", "O agendamento"+agendamentoSelecionado.getNome()+"foi removido.");
        FacesContext.getCurrentInstance().addMessage(null, message);
        lista=new AgendamentoDAO().listarTudo();
    }
    
}
