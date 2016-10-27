package Processador;

public class RegistradorEstado {
    public static String geraEstado(int resultado){
       String retorno =null;
       int [] registrador = new int[4];
       if(resultado<0){
           registrador[2]=1; 
       }else{
           registrador[2]=0;
       }
        if(resultado==0){
           registrador[1]=1; 
       }else{
           registrador[1]=0;
       }
        registrador[0]=0;
        registrador[3]=0;
        
        retorno = Integer.toString(registrador[0])+Integer.toString(registrador[2])+Integer.toString(registrador[1])+Integer.toString(registrador[3]);
       return retorno;      
    }            
}
