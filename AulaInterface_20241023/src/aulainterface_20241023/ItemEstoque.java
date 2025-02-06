/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulainterface_20241023;

/**
 *
 * @author 0040482311010
 */
public class ItemEstoque
{
    private ItemEstoque lista[];
    private int count;

    public ItemEstoque(int capmax) {
        lista = new ItemEstoque[capmax];
        count = 0;
    }
    
    public int add(ItemEstoqueInt item)
    {
        if (lista.length < capmax)
        {
            lista.add(item);
            return lista.size() -1;
        }
    }
    
}
