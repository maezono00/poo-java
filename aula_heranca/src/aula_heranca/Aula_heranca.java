/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_heranca;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 0040482311010
 */
public class Aula_heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        PARA CLASSE PESSOA
        pessoa p = new pessoa();
        
        p.setNome("Pato");
        p.setSobrenome("Donald");
        
        p.setRg("12345678-9");
        
        p.printPessoa();
        */
        
        //CLASSE ALUNO
        Aluno al = new Aluno();
        
        al.setNome("Carlinho");
        al.setSobrenome("Thompson");
        al.setRg("20240821-21");
        al.setRa("0040482311099");
        al.setCurso("Desing de Moda");
        
        al.printAluno();
        
    }
    
}


