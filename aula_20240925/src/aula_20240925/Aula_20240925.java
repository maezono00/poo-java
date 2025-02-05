/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_20240925;

/**
 *
 * @author 0040482311010
 */
public class Aula_20240925 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //CRIAR UM ARRAY DE 100 POSIÇÕES QUE RETORNE NÚMEROS ALEATÓRIOS.
        //PARTE 2, CALCULAR MÉDIA;
        int vetor[] = new int[100];
        double somaMedia = 0;
        
        for (int i = 0; i < 100; i ++)
        {
            vetor[i] = (int)Math.round(Math.random() * 100);
            somaMedia += vetor[i];
        }
        
        for (int i = 0; i < 100; i ++)
        {
            System.out.println("Número na posição " + i + ": " + vetor[i]);
        }
        
        System.out.println("A média de todos os valores é: " + somaMedia / 100);
    }
    
}
