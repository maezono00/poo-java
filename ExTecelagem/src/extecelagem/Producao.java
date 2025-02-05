/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author 0040482311010
 */
public class Producao extends Pessoa
{
    public double valorHora = super.getSalario_base();
    public int qtdHoraDiurna;
    public int qtdHoraNoturna;

    public Producao(String nome, String rg, double salario_base) {
        super(nome, rg, salario_base);
        qtdHoraDiurna = 0;
        qtdHoraNoturna = 0;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQtdHoraDiurna() {
        return qtdHoraDiurna;
    }

    public void setQtdHoraDiurna(int qtdHoraDiurna) {
        this.qtdHoraDiurna = qtdHoraDiurna;
    }

    public int getQtdHoraNoturna() {
        return qtdHoraNoturna;
    }

    public void setQtdHoraNoturna(int qtdHoraNoturna) {
        this.qtdHoraNoturna = qtdHoraNoturna;
    }
    
    public void registrarHorasDiurnas(int horas)
    {
        qtdHoraDiurna += horas;
    }
    
    public void registrarHorasNoturnas(int horas)
    {
        qtdHoraNoturna += horas;
    }
    
    @Override
    public double salarioLiquido()
    {
        return valorHora * qtdHoraDiurna + valorHora * (qtdHoraNoturna * 1.3);
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Valor por hora trabalhada: " + valorHora);
        System.out.println("Horas Diurnas: " + qtdHoraDiurna);
        System.out.println("Horas Noturnas: " + qtdHoraNoturna);
        System.out.println("Horas Trabalhadas: " + (qtdHoraDiurna + qtdHoraNoturna) + "\n");
    }

    @Override
    public void novoMes()
    {
        setQtdHoraDiurna(0);
        setQtdHoraNoturna(0);
    }
    
}
