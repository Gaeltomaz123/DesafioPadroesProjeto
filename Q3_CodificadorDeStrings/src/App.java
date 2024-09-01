public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new Codificador();
        CodificadorSimples cd_simples = new CodificadorSimples();
        CodificaDesloca cd_desloca = new CodificaDesloca();
        String aux = "Desafio Padrões de Projeto";

        System.out.println(aux);
        aux = cod.codifica(cd_simples, aux);
        System.out.println(aux);
        aux = cod.deCodifica(cd_simples, aux);
        System.out.println(aux);
        aux = cod.codifica(cd_desloca, aux);
        System.out.println(aux);
        aux = cod.deCodifica(cd_desloca, aux);
        System.out.println(aux);
    }
}
