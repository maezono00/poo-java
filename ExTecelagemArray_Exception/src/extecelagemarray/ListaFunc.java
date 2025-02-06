/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagemarray;

/**
 *
 * @author 0040482311010
 */
public class ListaFunc
{
    /*
    public Funcionario[] funcionarios;
    public int count;
    
    public ListaFunc (int capacidade)
    {
        this.funcionarios = new Funcionario[capacidade];
        this.count = 0;
    }
    
    //Não permita dois funcionários com o mesmo código.
    public boolean addFunc (Funcionario f)
    {
        for (int i = 0; i < funcionarios.length; i ++)
        {
            if (funcionarios[i].getCodigo() == f.getCodigo())
            {
                System.out.println("Esse código já existe!");
                return false;
            }
        }
        if (count < funcionarios.length)
        {
            funcionarios[count] = f;
            count ++;
            System.out.println("Funcionário adicionado com sucesso!");
            return true;
        }
        return false;
    }
    
    //Retorna o funcionário com o código indicado, ou null se não existe.
    public Funcionario getFunc (int cod)
    {
        for (int i = 0; i < funcionarios.length; i ++)
        {
            if (funcionarios[i].getCodigo() == cod)
            {
                System.out.println("O funcionário do código " + cod + "é o: " + funcionarios[i].getNome());
            }
        }
        return null;
    }
    
    //Calcula e retorna o salário líquido do funcionário indicado ou -1 se não existe.
    public double salarioLiquido (int cod)
    {
        for (int i = 0; i < funcionarios.length; i ++)
        {
            if (funcionarios[i].getCodigo() == cod)
            {
                return funcionarios[i].salarioLiquido();
            }
        }
        return -1;
    }
    */
    
    private Funcionario lista[];
    private int count;
    
    public ListaFunc(int capMax)
    {
        lista = new Funcionario[capMax];
        count = 0;
    }
    
    public Funcionario getFunc(int cod)
    {
        for (int i = 0; i < count; i ++)
        {
            if (lista[i].getCodigo() == cod)
            {
                return lista[i];
            }
        }
        
        return null;
    }
    
    public boolean addFunc(Funcionario f) throws CodigoJaExiste
    {
        if (getFunc(f.getCodigo()) != null)
        {
            throw new CodigoJaExiste();
        }
        
        if (count >= lista.length)
        {
            return false;
        }
        
        lista[count] = f;
        count ++;
        
        return true;
    }
    
    public void listagemVendas()
    {
        double totVendas = 0;
        
        for (int i = 0; i < count; i ++)
        {
            if (lista[i] instanceof Vendedor)
            {
                lista[i].hollerith();
                totVendas += ((Vendedor)lista[i]).getTotVendas();
            }
        }
        
        System.out.println("Total de Vendas: " + totVendas);
    }
    
    public double salarioLiquido(int cod)
    {
        Funcionario f = getFunc(cod);
        if (f == null)
        {
            return -1;
        }
        return f.salarioLiquido();
    }
    
    public boolean registrarVenda(int cod, double valor)
    {
        Funcionario f = getFunc(cod);
        if (f == null)
        {
            return false;
        }
        
        if (f instanceof Vendedor)
        {
            ((Vendedor)f).registrarVenda(valor);
            return true;
        }
        
        return false;
    }
    
    public boolean registrarHorasDiurnas(int cod, int horas)
    {
        Funcionario f = getFunc(cod);
        if (f == null)
        {
            return false;
        }
        
        if (f instanceof Producao)
        {
            ((Producao)f).registrarHorasDiurnas(horas);
            return true;
        }
        
        return false;
    }
    
    public boolean registrarHorasNoturnas (int cod, int horas)
    {
        Funcionario f = getFunc(cod);
        if (f == null)
        {
            return false;
        }
        
        if (f instanceof Producao)
        {
            ((Producao)f).registrarHorasNoturnas(horas);
            return true;
        }
        
        return false;
    }
}
