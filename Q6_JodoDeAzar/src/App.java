public class App {
    public static void main(String[] args) {

        Dado d6 = new Dado(6);
        Dado d20 = new Dado(20);

        DadoComHistorico dh6 = new DadoComHistorico(d6);
        DadoComHistorico dh20 = new DadoComHistorico(d20);

        dh6.rolar();
        dh6.rolar();
        dh6.rolar();
        dh6.rolar();
        
        dh20.rolar();
        dh20.rolar();
        dh20.rolar();
        dh20.rolar();

        System.out.println("Histórico de jogadas do dado com 6 lados: " + dh6.getHistorico());
        System.out.println("Histórico de jogadas do dado com 20 lados: " + dh20.getHistorico());
    }
}

