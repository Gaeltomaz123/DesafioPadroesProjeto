import java.util.List;

public class VisualizadorDeMedia implements Observer {
    private List<Integer> valores;

    public VisualizadorDeMedia(List<Integer> valores){
        this.valores = valores;
    }

    @Override
    public void notifica(List<Integer> l){
        this.valores = l;
        exibeMedia();
    }
 
    public void exibeMedia(){
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: "+media+", quantidade de elementos analisados: "+valores.size());
    }

}
