
import br.com.pm.dao.AlunoDAO;
import br.com.pm.dao.HibernateUtil;
import br.com.pm.vo.Aluno;


public class Teste {
    
    public static void main (String [] args){
        
     Aluno d = new Aluno();
        d.setNome("aaaa");
        d.setCpf("zzzz");
        d.setIdade(18);
        d.setAltura(0.0);
        d.setCidade("bbb");
        d.setSexo("M");
        d.setTelefone("11");
        d.setTipoFisico("a");
        d.setPeso(0.0);
        d.setIndiceGorduraCorporal(0.0);
        new AlunoDAO().salvar(d);
        
        for (Aluno a : new AlunoDAO().listarTudo()) {
            System.out.println(a);
}
    }
}