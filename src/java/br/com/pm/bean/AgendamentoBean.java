/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pm.bean;

import br.com.pm.dao.AgendamentoDAO;
import br.com.pm.vo.Agendamento;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author valer
 */
@ManagedBean
@SessionScoped
public class AgendamentoBean {
    
    private Agendamento agendamento;
    private List<Agendamento> lista;
    private List<Agendamento> listaFiltrada;
    public AgendamentoBean(){
      agendamento = new Agendamento();
      lista= new AgendamentoDAO().listarTudo();
      listaFiltrada= new ArrayList<Agendamento>();
  }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public List<Agendamento> getLista() {
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
    
}
