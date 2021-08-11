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
public class CalcularMedia {

    public static void main(String[] args){
        int[] valores = new int[3];
        valores[0] = 5;
        valores[1] = 7;
        valores[2] = 2;
        
//        Arredondamento objArred = new Arredondamento();
        
        double retorno_media = media(valores);
        double retorno_arrendondada = Arredondamento.arredondarValor(retorno_media);
        System.out.println("MÉDIA = " + retorno_arrendondada);
    }
    
    private static double media(int [] nums){
        double res_media = 0;
        
        System.out.println("TAMANHO DO ARRAY = " + nums.length);
        
        for(int i = 0; i < nums.length;  i++){
            res_media += nums[i];
        }
        
        res_media = res_media / nums.length;
        
        return res_media;
    }
}
