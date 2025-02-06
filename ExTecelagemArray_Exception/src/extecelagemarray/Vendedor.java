/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagemarray;

/**
 *
 * @author 0040482311010
 */
public class Vendedor extends Funcionario
{
    public double valorVenda;
    public double totVendas;

    public double getTotVendas() {
        return totVendas;
    }

    public void setTotVendas(double totVendas) {
        this.totVendas = totVendas;
    }

    public Vendedor(double valorVenda, String nome, String rg, double salario_base, int codigo) {
        super(nome, rg, salario_base, codigo);
        valorVenda = 0;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    @Override
    public double salarioLiquido()
    {
        return super.getSalario_base() + (valorVenda * 0.03);
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Vendas acumuladas: " + valorVenda + "\n");
    }
    
    @Override
    public void novoMes()
    {
        //setValorVenda(0);
        valorVenda = 0;
    }
    
    public void registrarVenda(double valor)
    {
        valorVenda += valor;
    }
}
