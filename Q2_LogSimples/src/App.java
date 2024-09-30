

public class App {
    public static void main(String[] args) throws Exception {
        LogSimples log = LogSimples.getInstance();
        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");

        LogSimples log2 = LogSimples.getInstance();
        log2.log("Finalmente o teste esta verificando o padrão SINGLETON!");


        for(String m:log){
            System.out.println(m);
        }

        System.out.println("As duas instancias sao do mesmo objeto? " + (log == log2));
    }
}
