public class Email extends Tipo {
    public Email(String valor) {
        this.valor = valor;
        int posA = valor.indexOf('@');
        int posPt = valor.indexOf('.');
        if (posA <= 0 || posPt <= 0) {
            t_f = false;
        } else {
            t_f = true;
        }
    }
    
    @Override
    public String toString() {
        if (t_f){
            return (valor+" é um email válido!");
        }else{
            return (valor+" não é um email válido!");
        }
    }
    
}
