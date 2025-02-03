/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_faculdade;

/**
 *
 * @author 0040482311010
 */
public class Pessoa {
    protected String nome, rg;
    protected int qtdfilho;
    
    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public int getQtdfilho() {
        return qtdfilho;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setQtdfilho(int qtdfilho) {
        this.qtdfilho = qtdfilho;
    }   
}
