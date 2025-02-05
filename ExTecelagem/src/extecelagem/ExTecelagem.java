/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extecelagem;

/**
 *
 * @author 0040482311010
 */
public class ExTecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Administracao adm = new Administracao("Arthur", "CPF", 100000);
        adm.registrarFalta();
        adm.registrarFalta();
        adm.registrarFalta();
        adm.registrarFalta();
        adm.registrarFalta();
        adm.registrarFalta();
        adm.registrarFalta();
        adm.registrarFalta();
        adm.registrarFalta();
        adm.registrarFalta();
        adm.hollerith();
        adm.novoMes();
        adm.hollerith();
        
        Producao prod = new Producao("Heitor", "EU", 10);
        prod.registrarHorasDiurnas(100);
        prod.registrarHorasNoturnas(10);
        prod.hollerith();
        prod.novoMes();
        prod.hollerith();
        
        Vendedor vend = new Vendedor("Gustavo", "AAAAA", 1500);
        vend.registrarVenda(1000);
        vend.registrarVenda(50);
        vend.hollerith();
        vend.novoMes();
        vend.hollerith();       
    }   
}
