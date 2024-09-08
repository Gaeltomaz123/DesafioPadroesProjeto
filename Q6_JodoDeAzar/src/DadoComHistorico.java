import java.util.List;
import java.util.ArrayList;

public class DadoComHistorico implements Idado {
   private Idado dado;
   private List<Integer> historico;

   public DadoComHistorico(Idado dado) {
      this.dado = dado;
      this.historico = new ArrayList<>();
   }

   @Override
   public void rolar() {
      dado.rolar();
      historico.add(dado.getValor());
   }

   @Override
   public int getValor() {
      return dado.getValor();
   }

   public List<Integer> getHistorico() {
      return historico;
   }
}

