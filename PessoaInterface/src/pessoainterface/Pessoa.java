/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoainterface;

/**
 *
 * @author 0040482311010
 */
public class Pessoa implements NameFormatInterface
{
    private String nome, sobrenome, rg;
    
    //CONSTRUTOR
    public Pessoa(String nome, String sobrenome, String rg)
    {
        this.nome = nome;
        this. sobrenome = sobrenome;
        this.rg = rg;
    }
    
    //GETTER E SETTERS
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getSobrenome()
    {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }
    
    public String getRg()
    {
        return rg;
    }
    
    public void setRg(String rg)
    {
        this.rg = rg;
    }
    
    @Override
    //retorna string com nome e sobrenome separados por um espaço.
    public String nameLastName()
    {
        return nome + " " + sobrenome;
    }
    
    @Override
    //retorna string com sobrenome e nome separados por uma vírgula.
    public String lastNameName()
    {
        return sobrenome + ", " + nome;
    }
    
    @Override
    //retorna string com sobrenome e rg separados por dois pontos.
    public String lastNameDocument()
    {
        return sobrenome + ": " + rg;
    }
}
