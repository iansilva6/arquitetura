package Processador;

public class ULA {
    public static String executaOperacaoMatematica(String instrucao,int operando1,int operando2){
        String retorno = null;
            switch(instrucao){
                case "add":retorno = Integer.toString(operando1+operando2);break;
                case "sub":retorno = Integer.toString(operando1-operando2);break;
                case "mul":retorno = Integer.toString(operando1*operando2);break;
                case "div":if(operando2==0){
                    retorno ="erro div 0";
                }else{
                    retorno =Integer.toString(operando1/operando2);break;}
                 case "fdiv":if(operando2==0){
                    retorno ="erro div 0";
                }else{
                    float resultado;
                    resultado=(float) operando1/(float)operando2;
                    retorno = Float.toString(resultado);
                 }
            }
        return retorno;
    }
 public static void main(String Args[]){
     System.out.println(executaOperacaoMatematica("add",5,7));
     System.out.println(executaOperacaoMatematica("fdiv",7,5));
 }
}
