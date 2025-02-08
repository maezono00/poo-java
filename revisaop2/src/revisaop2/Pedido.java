/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaop2;

/**
 *
 * @author 0040482311010
 */
public class Pedido
{
    private int numPedido;
    private int codCliente;
    private int codVendedor;
    private double valor;
    private boolean atendido;
    private boolean pago;

    public Pedido(int numPedido, int codCliente, int codVendedor, double valor, boolean atendido, boolean pago) {
        this.numPedido = numPedido;
        this.codCliente = codCliente;
        this.codVendedor = codVendedor;
        this.valor = valor;
        this.atendido = false;
        this.pago = false;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    
}
