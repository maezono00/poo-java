/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 040069
 */
public class Circulo extends Ponto
{
    private double raio;
    
    public Circulo()
    {
        super();
        raio= 1;
    }
    
    public Circulo(double x, double y, double raio)
    {
        super(x, y);
        this.raio= raio;
    }
    
    public Circulo(Circulo c)
    {
        super(c);
        raio= c.raio;
    }
    
    public void assign(Circulo c)
    {
        super.assign(c);
        raio= c.raio;
    }
    
    public boolean equals(Object obj)
    {
        if(obj==null) return false;
        if(!(obj instanceof Circulo)) return false;
        Circulo c= (Circulo)obj;
        return super.equals(c) && (raio==c.raio);
    }
    
}
