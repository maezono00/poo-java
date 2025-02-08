/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaop2;

/**
 *
 * @author 0040482311010
 */
public class ListaPedido
{
    private Pedido lista[];
    private int count;

    public ListaPedido(int capMax) {
        lista = new Pedido[capMax];
        count = 0;
    }
    
    public Pedido buscarPedido(int numPed)
    {
        for (int i = 0; i < count; i ++)
        {
            if (lista[i].getNumPedido() == numPed)
            {
                return lista[i];
            }
        }
        
        return null;
    }
    
    public void cadastrarPedido(Pedido p) throws Exception
    {
        if (buscarPedido(p.getNumPedido()) != null)
        {
            throw new Exception("O código já existe!!!");
        }
        
        if (count >= lista.length)
        {
            throw new Exception("A lista já está cheia!!!");
        }
        
        lista[count] = p;
        count ++;
    }
    
    public void atenderPedido(int numPed) throws PedidoNaoEncontradoException
    {
        Pedido p = buscarPedido(numPed);
        
        if (p == null)
        {
            throw new PedidoNaoEncontradoException();
        }
        
        p.setAtendido(true);
    }
    
    public void relatorioCliente(int codCli, boolean todos, boolean atendidos)
    {
        double valorTotal = 0;
        
        for (int i = 0; i < count; i ++)
        {
            Pedido p = lista[i];
            if (p.getCodCliente() == codCli)
            {
                if (todos || (atendidos && p.isAtendido()) || (!atendidos && !p.isAtendido()))
                {
                    System.out.println("Pedido: " + p.getNumPedido());
                    System.out.println("Valor: " + p.getValor());
                    
                    valorTotal += p.getValor();
                }
            }
            
            System.out.println("Valor total: " + valorTotal);
        }
    }
    
    public void pagarVendedor(int codVenda, double porcent)
    {
        double valorTotal = 0;
        for (int i = 0; i < count; i ++)
        {
            Pedido p = lista[i];
            if (p.getCodVendedor() == codVenda && !p.isPago())
            {
                p.setPago(true);
                valorTotal += p.getValor();
            }
        }
        
        double comissao = valorTotal * (porcent / 100);
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Comissão: " + comissao);
    }
    
}
