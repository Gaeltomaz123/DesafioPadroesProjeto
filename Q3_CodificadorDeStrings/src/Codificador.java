import java.util.HashMap;
import java.util.Map;

public class Codificador{
    public enum Tipo {SIMPLES,DESLOCA};


    public String codifica(CodificadorStrategy estrategia,String str){
        return estrategia.codifica(str);
    }

    public String deCodifica(CodificadorStrategy estrategia,String str){
        return estrategia.decodifica(str);
    }

}