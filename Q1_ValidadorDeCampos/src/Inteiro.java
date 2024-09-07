public class Inteiro extends Tipo{

    public Inteiro(String valor) {
        this.valor = valor;
        t_f = true;
        for(int i=0;i<valor.length();i++){
            if (!Character.isDigit(valor.charAt(i))){
                t_f = false;
                break;
            }
        }
       
    }
    
    @Override
    public String toString() {
        if (t_f){
            return (valor+" é um inteiro válido!");
        }else{
            return (valor+" não é um inteiro válido!");
        }
    }
}
