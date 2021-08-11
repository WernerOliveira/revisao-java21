/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poggers;

/**
 *
 * @author trame
 */
public class PogGers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tabuada = 85;
        
        for(int i = 0; i <= 10;  i++) {
            System.out.println(tabuada + " x " +  i  + " = " + (tabuada *  i) );
        }
        
        //WHILE = enquanto
        int contador = 0;
        
        while(contador < 100 ) {
            System.out.println("Contador é menor que 100 ( " + contador + " ) ");
            contador += 3; //contador = contador + 1
        }
        System.out.println("Terminou o while");

//        DO WHILE -> verificar um contador
        do {
            System.out.println("DO contador é maior que 100 ( " + contador + " )");
            contador += 3;
        } while (contador < 100);
        System.out.println("TERMINOU O DO WHILE");
        
        //Criar uma função de soma
        
        double a = 10.4;
        double b = 6;
        soma (a, b);
        
//        int[] valores = new int[3];
//        valores[0] = 5;
//        valores[1] = 7;
//        valores[2] = 2;
//        System.out.println("posição 0 = " + valores[1]);
//        
//        double retorno_media = media(valores);
//        System.out.println("MÉDIA = " + retorno_media);
    }
    
    private static void soma (double num1, double num2){
        System.out.println("SOMA = " + (num1 + num2));
    }
    
//    private static double media(int [] nums){
//        double res_media = 0;
//        
//        System.out.println("TAMANHO DO ARRAY = " + nums.length);
//        
//        for(int i = 0; i < nums.length;  i++){
////            System.out.println(i);
//            res_media += nums[i];
//        }
//        
//        res_media = res_media / nums.length;
//        
//        return res_media;
//    }
    
}
