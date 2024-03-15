/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author filip
 */
public class Cone {
    private float raio = 0;
    private int altura = 0;

    public float getRaio(float raio){
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
    
    public float calcularGeratriz(){
        return (float) (Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2)));
    }
    public float calcularAreaL(){
        return (float) (3.1415 * raio * calcularGeratriz());
    }
    public float calcularAreaT(){
        return (float) (3.1415*raio*(calcularGeratriz()+ raio));
    }
    public float calcularVolume(){
        return (float) (1.0/3.0*3.1415*Math.pow(raio, 2)*altura);
    }
}
