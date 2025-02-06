/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulainterface_20241023;

/**
 *
 * @author 0040482311010
 */
public class Roupa implements ItemEstoqueInt
{
    String descricao;
    int tamanho;
    double preco;
    int qtdEstoque;

    public Roupa(String descricao, int tamanho, double preco, int qtdEstoque) {
        this.descricao = null;
        this.tamanho = 0;
        this.preco = 0;
        this.qtdEstoque = 0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    @Override
    public void incUnits(int qtd)
    {
        if (qtd > 0)
        {
            this.qtdEstoque ++;
        }
    }
    
    @Override
    public void decUnits(int qtd)
    {
        if (qtd > 0 && this.qtdEstoque > qtd)
        {
            this.qtdEstoque -= qtd;
        }
    }
    
    @Override
    public int getUnits()
    {
        return this.qtdEstoque;
    }
    
    @Override
    public float getPrice()
    {
        return (float) this.preco;
    }
    
    @Override
    public void print()
    {
        System.out.println("Descrição: " + descricao);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + qtdEstoque);
    }
}
