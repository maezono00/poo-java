/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extecelagemarray;

/**
 *
 * @author 0040482311010
 */
public class ExTecelagemArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Administracao a1= new Administracao(0, "Zé", "123-4", 10000, 1);
        a1.registrarFalta();
        a1.registrarFalta();
        a1.hollerith();
        
        Administracao a2= new Administracao(0, "Zé2", "123-4", 10000, 1);
        a2.registrarFalta();
        a2.registrarFalta();
        a2.hollerith();
        
        Producao p1= new Producao(0, 0, "Maria", "234-5", 50, 2);
        p1.registrarHorasDiurnas(100);
        p1.registrarHorasNoturnas(100);
        p1.hollerith();
        
        Vendedor v1= new Vendedor(0, "João", "345-6", 1000, 3);
        v1.registrarVenda(50000);
        v1.registrarVenda(50000);
        v1.hollerith();
        
        ListaFunc lf = new ListaFunc(10);
        try
        {
            lf.addFunc(v1);
            lf.addFunc(a1);
            lf.addFunc(a2);
            lf.addFunc(p1);
        }
        catch(CodigoJaExiste exc)
        {
            System.out.println(exc);
        }
    }
}
