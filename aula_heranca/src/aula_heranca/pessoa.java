/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_heranca;

/**
 *
 * @author 0040482311010
 */
public class pessoa {
    private String nome, sobrenome, rg;

    //GETTER
    
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getRg() {
        return rg;
    }

    // SETTER
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    //outros
    public String nomeCompleto()
    {
        return nome + " " + sobrenome;
    }
    
    public void printPessoa()
    {
        System.out.println("Nome: " + nomeCompleto() + "\n" + "RG: " + rg);
    }
            
}
