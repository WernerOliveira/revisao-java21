/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poggers;

public class ParImpar {

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
}
