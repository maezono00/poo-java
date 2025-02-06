/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartesiano;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 040069
 */
public class Cartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Poligono p1= new Poligono();
        
        try
        {
            p1.addVertex(new Ponto(1, 2));
            p1.addVertex(new Ponto(3, 4));
            p1.addVertex(new Ponto(5, 6));
            p1.addVertex(new Ponto(7, 8));
            p1.addVertex(new Ponto(7, 8));
        }
        catch (Exception e)
        {
            System.out.println("Erro: " + e.getMessage());
        }
        /*catch (Exception ex) {
            Logger.getLogger(Cartesiano.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        p1.print();
        
        //System.out.println("Perimetro: " + p1.perimeter());
        
        Poligono p2 = new Poligono();
        
        try
        {
            p2.addVertex(new Ponto(2, 1));
            p2.addVertex(new Ponto(4, 3));
            p2.addVertex(new Ponto(6, 5));
            p2.addVertex(new Ponto(8, 7));
            p2.addVertex(new Ponto(10, 9));
            p2.addVertex(new Ponto(12, 11));
        }
        catch(Exception exc){
            System.out.println("Erro: " + exc.getMessage());
        }
        
        p2.print();
        
        /*
        p2.desloc(10, 0);
        p2.print();
        
        System.out.println("Distancia p1-p2: " + p1.distance(p2));*/
    }
    
}
