package Processador;
import Processador.Registradores;

public class OutrasInstrucoes {
    public static void setRegistrador(String reg,int valor){
        switch(reg){
            case "eax": Registradores.eax=valor;break;
            case "ebx": Registradores.ebx=valor;break;
            case "ecx": Registradores.eax=valor;break;
            case "edx": Registradores.edx=valor;break;
        }
    }
    public static void addRegistrador(String reg,int valor){
        switch(reg){
            case "eax": Registradores.eax=Registradores.eax+valor;break;
            case "ebx": Registradores.ebx=Registradores.ebx+valor;break;
            case "ecx": Registradores.ecx=Registradores.ecx+valor;break;
            case "edx": Registradores.edx=Registradores.edx+valor;break;
        }
    }
        public static void decRegistrador(String reg){
        switch(reg){
            case "eax": Registradores.eax--;break;
            case "ebx": Registradores.ebx--;break;
            case "ecx": Registradores.ecx--;break;
            case "edx": Registradores.edx--;break;
        }
    }
}
