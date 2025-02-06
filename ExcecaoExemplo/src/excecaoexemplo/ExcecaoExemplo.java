/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excecaoexemplo;

/**
 *
 * @author 0040482311010
 */

public class ExcecaoExemplo {

    /**
     * @param args the command line arguments
     */
    public static int div(int a, int b)
    {
        return a / b;
    }
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        int lista[];
        lista = new int[3];
        int a = 10;
        int b = 0;
        int r = 0;
        
        
        try
        {
            r = div(a,b);
            lista[0] = 10;
            lista[1] = 15;
            lista[3] = 20;
        }
        
        catch(ArrayIndexOutOfBoundsException exc)
        {
            System.out.println(exc.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        System.out.println("r = " + r);
    }
    
}
