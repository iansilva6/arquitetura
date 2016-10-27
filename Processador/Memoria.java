package Processador;

public class Memoria {
    public static String[] carregaPrograma(int num){
        String [] retorno = new String[4];
        if (num==1){
        //programa 1
        // explora as 4 operações matematicas
        retorno[0] = "00000000000011001000001100010101";//adiciona 50 + 789
       // retorno[1] = "00010000110001010100000000110010";//subtrai 789-50
        retorno[1] = "00010000000011001000001100010101";//subtrai 50-789
        retorno[2] = "00110000101001010000000000000101";//divide 660/5
        retorno[3] = "00100000000000010100011000001000";//multiplica 5*1544

        }
        if (num==2){
            //programa 2
            // explora a divisão, divisão de float,e divisão por 0
            retorno[0] = "00110000101001010000000000000101";//divide 660/5. mesma do programa 1
            retorno[1] = "01000000101001010000000000000111";//divide com float 660/7
            retorno[2] = "01000000000000010000000000000000";//divide 1/0, obrigatoriamente deve acusar erro
            retorno[3] = "01000000101001010000000000000101";//divide 660/5. mesma da posição 1 só que float
        }
        if(num==3){
            //programa 3
            //ffaz uso das instruções  movs
            retorno[0] = "01110000000000000000000000000001";//move 1 para eax
            retorno[1] = "01110000000000010000000000001111";//move 15 para ebx
            retorno[2] = "10000000000000000000000000011111"; // adciona 31 a eax
            retorno[3] = "10010000000000000000000000000001";//adiciona os valores de eax + ebx 
        }
        if(num==4){
            //programa 4
            // utiliza a instrução if not zero
            retorno[0] = "01110000000000000000000000000011"; //move 3 para eax
            retorno[1] = "10000000000000010000000000000101";//adiciona 5 ebx
            retorno[2] = "10000000000000010000000000000011";//adiciona 3 a ebx
            retorno[3] = "01010000000000000000000000000001";//if eax != 0 jump para 1
        }
       return retorno;
    }
    public static void main(String Args[]){
        String teste[] = carregaPrograma(1);
        for(int i=0;i<teste.length;i++){
            System.out.println(teste[i]);
        }
    }
}
