import java.util.List;

public class VisualizadorDeSomatorio implements Observer {
    private List<Integer> valores;

    public VisualizadorDeSomatorio(List<Integer> valores){
        this.valores = valores;
    }

    @Override
    public void notifica(List<Integer> l) {
       this.valores = l;
       exibeSomatorio();
    }

    public void exibeSomatorio(){
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: "+soma+", quantidade de elementos analisados: "+valores.size());
    }

    
}
