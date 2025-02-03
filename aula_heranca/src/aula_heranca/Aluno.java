/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_heranca;

/**
 *
 * @author 0040482311010
 */
public class Aluno extends pessoa
{
    private String ra, curso;
    
    //GETTERS
    public String getRa() {
        return ra;
    }

    public String getCurso() {
        return curso;
    }
    
    //SETTERS
    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //OUTROS
    public void printAluno()
    {
        printPessoa();
        System.out.println("RA: " + ra + "\n" + "Curso: " + curso);
    }
    
}
