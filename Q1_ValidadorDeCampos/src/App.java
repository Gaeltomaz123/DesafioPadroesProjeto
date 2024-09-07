public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        Tipo validaemail = Validador.valida(Validador.Tipo_.EMAIL, email);
        System.out.println(validaemail);

        String inteiro = "1";
        Tipo validaint = Validador.valida(Validador.Tipo_.INTEIRO, inteiro);
        System.out.println(validaint);

        String matricula = "12345678";
        Tipo validamat = Validador.valida(Validador.Tipo_.MATRICULA, matricula);
        System.out.println(validamat);
    }
}
