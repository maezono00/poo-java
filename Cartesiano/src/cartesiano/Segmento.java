/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 040069
 */
public class Segmento 
{
    private Ponto p1, p2;
    
    public Segmento()
    {
        p1= new Ponto();
        p2= new Ponto(0, 1);
    }
    
    public Segmento(double x1, double y1, double x2, double y2)
    {
        p1= new Ponto(x1, y1);
        p2= new Ponto(x2, y2);
    }
    
    public Segmento(Segmento s)
    {
        p1= new Ponto(s.p1);
        p2= new Ponto(s.p2);
    }
    
    public void assign(Segmento sg)
    {
        p1.assign(sg.p1);
        p2.assign(sg.p2);
    }
    
    public void desloc(double dX, double dY)
    {
        p1.desloc(dX, dY);
        p2.desloc(dX, dY);
    }
    
    public void escale(double factor)
    {
        p1.escale(factor);
        p2.escale(factor);
    }
    
    @Override
    public String toString()
    {
        return "[" + p1 + "," + p2 + "]";
    }
    
    public double length()
    {
        return p1.distance(p2);
    }
    
    public Ponto midPoint()
    {
        double xm= (p1.x + p2.x)/2;
        double ym= (p1.y + p2.y)/2;
        
        return new Ponto(xm, ym);
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)return false;
        if(!(obj instanceof Segmento)) return false;
        Segmento s= (Segmento)obj;
        return p1.equals(s.p1)&&p2.equals(s.p2);
    }
    
    public boolean isValid()
    {
        if(p1==null || p2==null)return false;
        return p1.distance(p2) > 0;
    }
}
