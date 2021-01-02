
import br.com.pm.dao.AlunoDAO;
import br.com.pm.dao.HibernateUtil;
import br.com.pm.vo.Aluno;


public class Teste {
    
    public static void main (String [] args){
        
     Aluno d = new Aluno();
        d.setNome("aaaa");
        d.setCpf("zzzz");
        d.setIdade(18);
        d.setTelefone("11");
        d.setEndereco("az");
        new AlunoDAO().salvar(d);
        
        for (Aluno a : new AlunoDAO().listarTudo()) {
            System.out.println(a);
}
    }
}