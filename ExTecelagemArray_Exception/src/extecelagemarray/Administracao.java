/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagemarray;

/**
 *
 * @author 0040482311010
 */
public class Administracao extends Funcionario
{
    public double salarioFixo = super.getSalario_base();
    public int qtdFaltas;

    public Administracao(int qtdFaltas, String nome, String rg, double salario_base, int codigo) {
        super(nome, rg, salario_base, codigo);
        qtdFaltas = 0;
    }



    public int getQtd_faltas() {
        return qtdFaltas;
    }

    public void setQtd_faltas(int qtd_faltas) {
        this.qtdFaltas = qtdFaltas;
    }
    
    public void registrarFalta()
    {
        qtdFaltas ++;
    }
    
    @Override
    public double salarioLiquido()
    {
        return salarioFixo - ((salarioFixo / 30) * qtdFaltas);
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Quantidade de faltas: " + qtdFaltas);
        System.out.printf("Valor descontado: %.2f\n", ((salarioFixo / 30) * qtdFaltas));
        
    }
    
    @Override
    public void novoMes()
    {
        qtdFaltas = 0;
    }
}
