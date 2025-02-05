/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exestacionamento;

/**
 *
 * @author 0040482311010
 */
public abstract class Carro
{
    protected String placaCarro, anoFabricacao, modeloCarro;
    protected String Vendedor;
    
    public abstract boolean Disponivel();
    
    public abstract void ImprimeDados();
    
    public abstract boolean Oferta();
}
