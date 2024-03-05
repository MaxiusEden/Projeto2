/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entidades;

/**
 *
 * @author puc
 */
public class Esfera {
public float raio = 0;
public float calcularArea(){
    return (float) (4*3.1415*Math.pow(raio, 3));
}
public float calcularVolume(){
    return (float) ((4/3)*3.1415*Math.pow( raio, 3));
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
