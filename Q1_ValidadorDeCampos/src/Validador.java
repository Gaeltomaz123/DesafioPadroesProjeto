public class Validador{

    private Validador() {
    }

    public enum Tipo_ { EMAIL, INTEIRO, MATRICULA }

    public static Tipo valida(Tipo_ tipo,String valor){
        switch(tipo){
            case INTEIRO:
                return new Inteiro(valor);
            case MATRICULA:
                return new Matricula(valor);
            case EMAIL:
                return new Email(valor);
            default:
                return new Tipo();
        }
    }
}