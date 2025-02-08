/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisaop2;

/**
 *
 * @author 0040482311010
 */
public class Revisaop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        ListaPedido lista = new ListaPedido(3);
        
        Pedido p1 = new Pedido(1, 101, 201, 500.0, false, false);
        Pedido p2 = new Pedido(2, 102, 202, 1000.0, true, true);
        Pedido p3 = new Pedido(1, 103, 203, 2000.0, false, true);
        
        lista.cadastrarPedido(p1);
        lista.cadastrarPedido(p2);
        lista.cadastrarPedido(p3);
    }
    
}
