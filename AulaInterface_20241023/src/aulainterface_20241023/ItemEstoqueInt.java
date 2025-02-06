/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aulainterface_20241023;

/**
 *
 * @author 0040482311010
 */
public interface ItemEstoqueInt
{
    void incUnits(int qtd);
    void decUnits(int qtd);
    int getUnits();
    float getPrice();
    void print();
}
