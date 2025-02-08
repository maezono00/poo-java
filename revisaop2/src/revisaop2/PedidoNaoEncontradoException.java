/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaop2;

/**
 *
 * @author 0040482311010
 */
public class PedidoNaoEncontradoException extends Exception
{
    @Override
    public String toString()
    {
        return "O pedido não consta na lista!!!";
    }
}
