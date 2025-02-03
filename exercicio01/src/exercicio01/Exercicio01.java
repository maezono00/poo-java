/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio01;

/*
    CRIAR UM PROGRAMA ONDE DEVE TER UM setNome, setSobrenome e GetNome;
*/

/**
 *
 * @author 0040482311010
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //a variável p vai armazenar uma variável de referência a um objeto, como se fosse um ponteiro;
        Pessoa p = new Pessoa("Pato", "Donald");
        
        p.print();
    }
    
}
