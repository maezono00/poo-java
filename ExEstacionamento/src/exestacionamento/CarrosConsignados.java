/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exestacionamento;

/**
 *
 * @author 0040482311010
 */
public class CarrosConsignados extends Carro
{
    public String nomeProprietario;
    public double valorDesejado;
    
    @Override
    public boolean Disponivel()
    {
        System.out.println("Nome do vendedor: " + Vendedor);
        return Disponivel();
    }
    
    @Override
    public void ImprimeDados()
    {
        System.out.println("Placa do Carro: " + placaCarro);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Modelo do Carro: " + modeloCarro);
        System.out.println("Nome do Proprietário: " + nomeProprietario);
        System.out.println("Valor desejado: " + valorDesejado);
        System.out.println("Disponível: " + Disponivel());
        System.out.println("Nome do Vendedor: " + Vendedor);
    }
    
}
