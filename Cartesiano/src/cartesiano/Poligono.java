/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 040069
 */

class VertexAlreadyExistsException extends Exception
{
    public VertexAlreadyExistsException(String message)
    {
        super(message);
    }
}

public class Poligono 
{
    private Ponto list[];
    private int count;
    
    public Poligono()
    {
        list= new Ponto[5];
        count= 0;
    }
    
    public Poligono(Poligono pg)
    {
        list= new Ponto[5];
        count= pg.count;
        
        for(int i=0; i<count; i++)
            list[i]= new Ponto(pg.list[i]);
    }
    
    public boolean ptExist(Ponto pt)
    {
        for(int i=0; i<count; i++)
        {
            if(list[i].equals(pt))
                return true;
        }
        
        return false;
    }
    
    public boolean addVertex(Ponto pt) throws Exception {
        // Verifica se o ponto já existe
        if (ptExist(pt)) throw new Exception("Ponto já existe!!!");

        // Verifica se há espaço suficiente no array de pontos
        //if (count >= list.length) throw new RuntimeException("A lista está cheia!!!");
        if (count >= list.length) throw new PontoJaExisteException();

        // Adiciona o ponto na lista de vértices
        list[count] = pt;
        count++;
        return true;
    }
    
    public boolean isValid()
    {
        return count >= 3;
    }
    
    public double perimeter()
    {
        if(!isValid()) return -1;
        double per= 0;
        for(int i=0; i<count-1; i++)
            per+= list[i].distance(list[i+1]);
        
        per+= list[count-1].distance(list[0]);
        
        return per;
    }
    
    public Ponto geoCenter()
    {
        double accx=0, accy=0;
        for(int i=0; i<count; i++)
        {
            accx+= list[i].x;
            accy+= list[i].y;
        }
        
        return new Ponto(accx/count, accy/count);
    }
    
    public double distance(Poligono plg)
    {
//        Ponto pt= geoCenter();
//        Ponto outro= plg.geoCenter();
//        
//        return pt.distance(outro);
        
        return geoCenter().distance(plg.geoCenter());
    }
    
    public void desloc(double dx, double dy)
    {
        for(int i=0; i<count; i++)
            list[i].desloc(dx, dy);
    }
    
    public void escale(double factor)
    {
        for(int i=0; i<count; i++)
            list[i].escale(factor);
    }
    
    @Override
    public String toString()
    {
        String st= "[";
        for(int i=0; i<count; i++)
        {
            st= st + list[i].toString();
            if(i<count-1)
                st= st + ", ";
            else
                st= st +"]";
        }
        return st;
    }
    
    public void print()
    {
        System.out.println(toString());
    }
    
}
