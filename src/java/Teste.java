
import br.com.pm.dao.AlunoDAO;
import br.com.pm.vo.Aluno;
import java.util.Date;


public class Teste {
    
    public static void main (String [] args){
        
     Aluno d = new Aluno();
        d.setNome("aaaa");
        d.setCpf("zzzz");
        d.setDatadenascimento(new Date(12/12/1212));
        d.setTelefone("11");
        d.setEndereco("az");
        d.setNomeCE("bbb");
        d.setEnderecoCE("bababa");
        d.setTelefoneCE("1212");
        
        new AlunoDAO().salvar(d);
        
       for (Aluno a : new AlunoDAO().listarTudo()) {
            System.out.println(a);
}
    }
}