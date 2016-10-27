
package Processador;
import Processador.Registradores;

public class Decodificador {
    public static String getInstrucao(String bitsIns){
        String retorno = null;
        switch(bitsIns){
            case "0000":retorno ="add";break;//add 4 bits instrução 14 do primeiro 14  segundo 
            case "0001":retorno ="sub";break;//idem
            case "0010":retorno = "mul";break;//idem
            case "0011":retorno ="div";break;//idem
            case "0100":retorno ="fdiv";break;// mesma coisa da div mas retorna float
            case "0101":retorno ="inz";break;// pula para o endereço informado até o registrador selecionado chegar a 0
            case "0111":retorno = "mov";break;// mov 4 bits de instrucao 10 com 0 4 de registrador 14 de valor
            case "1000":retorno = "adr";break;// adiciona o valor ao registrador
            case "1001":retorno = "arr";break;//adiciona o valor de dos registradores eax e ebx
            default: retorno ="erro";break;
    }
        return retorno;
    }
    public static int getOperador(String bitsOp){
        int retorno = 0;
        retorno = Integer.parseInt(bitsOp, 2);
        return retorno;
    }
    public static String getRegistrador(String bitsReg){
        String retorno = null;
        switch(bitsReg){
            case "0000":retorno="eax";break;
            case "0001":retorno="ebx";break;
            case "0010":retorno="ecx";break;
            case "0011":retorno="edx";break;
        }
        return retorno;
    }
    public static void main(String Args[]){
        System.out.println(getInstrucao("0001"));
        System.out.println(getOperador("1010101"));
        Registradores novo =new Registradores();
        novo.eax=54;
        Registradores nov =new Registradores();
        System.out.println(nov.eax);
    }
}
