/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author filip
 */
public class Cilindro {
    private float raio = 0;
    private int altura = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
     if(raio <= 0){
          throw new Exception("O raio não pode ser <= 0");
      }
        this.raio = raio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) throws Exception {
       if(altura <= 0){
            throw new Exception("A altura não pode ser <= 0");
        }
        this.altura = altura;
    }
    
    public float calcularAreaL(){
        return (float) (2*3.1415*raio*altura);
    }
    public float calcularAreaT(){
        return (float) (2*3.1415*raio*(altura+raio));
    }
    public float calcularVolume(){
        return (float) (3.1415*raio*raio*altura);
    }
}
