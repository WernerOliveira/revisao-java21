/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poggers;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tools {

    public static void main(String args[]) {
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        
        funcao(numeros);
    }
    
    private static void funcao(int[] vetor){
        
        int pares = 0;
        int impares = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(i % 2 == 0){
                System.out.println(i + " é um número PAR");
            } else {
                System.out.println(i + " é um número IMPAR");
            }
        }
        
//        System.out.println(pares + " são pares");
//        System.out.println(impares + " são ímpares");
    }
    
    public static String formataValor(double valor, boolean sifrao){
        try {
            DecimalFormat format = new DecimalFormat("#,###,###,###.00");
            format.setRoundingMode(RoundingMode.DOWN);
            if (sifrao) {
                return "R$ " + format.format(valor);
            } else {
                return format.format(valor);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return "";
        }
    }
}
