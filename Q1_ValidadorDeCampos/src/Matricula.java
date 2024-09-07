public class Matricula extends Tipo{

    public Matricula(String valor) {
        this.valor = valor;
        Tipo validaint = new Inteiro(valor);
        if (!validaint.t_f){
            t_f = false;
        }else{
            int sum = 0;
            for(int i=0;i<valor.length()-1;i++){
                sum += Character.getNumericValue(valor.charAt(i));
            }
            int verificador = sum%10;
            if (verificador == Character.getNumericValue(valor.charAt(valor.length()-1))){
                t_f = true;
            }
        }

    }
    
    @Override
    public String toString() {
        if (t_f){
            return (valor+" é uma matrícula válida!");
        }else{
            return (valor+" não é uma matrícula válida!");
        }
    }
}
