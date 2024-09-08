import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<Observer> observers;

    public FonteDeDados(){
        this.lst = new LinkedList<>();
        this.observers = new ArrayList<>();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        this.notificaObservers();
    }

    public void registraObserver(Observer obs){
        this.observers.add(obs);
        this.notificaObservers();
    }

    public void notificaObservers(){
        this.observers.forEach(obs -> obs.notifica(this.lst));
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}