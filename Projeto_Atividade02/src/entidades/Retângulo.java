/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author puc
 */
public class Retângulo {
    public int comprimento = 0;
    public int largura = 0;
    public float calcularPerimetro(){
        return ((largura*2) + (comprimento*2));
    }
    public float calcularArea(){
        return (largura * comprimento);
    }
}
