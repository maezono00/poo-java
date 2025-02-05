/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author 0040482311010
 */
public abstract class Pessoa
{
    private String nome, rg;
    private double salario_base;

    //Construtor
    public Pessoa(String nome, String rg, double salario_base) {
        this.nome = nome;
        this.rg = rg;
        this.salario_base = salario_base;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }
    
    // retorna o salário liquido do funcionário. 
    public abstract double salarioLiquido();
    
    /*
    imprime o hollerith do funcionário especificando seus dados, seu salário 
    base e tudo o que foi somado ou descontado do salário, finalizando com seu
    salário líquido.
    */
    public void hollerith()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("RG: " + this.rg);
        System.out.format("Salario base: %.2f\n", this.salario_base);
        System.out.printf("Salario liquido: %.2f\n", this.salarioLiquido());
    }
    
    /*
    zera as informações que são acumuladas durante o mês, iniciando o mês 
    seguinte*/
    public abstract void novoMes();
}
