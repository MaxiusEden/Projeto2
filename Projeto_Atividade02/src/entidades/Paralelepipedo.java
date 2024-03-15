/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author filip
 */
public class Paralelepipedo {
    private int altura = 0;
    private int largura = 0;
    private int comprimento;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) throws Exception {
        if(altura <= 0){
            throw new Exception("A altura não pode ser <= 0");
        }
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) throws Exception {
        if(largura <= 0){
            throw new Exception("A largura não pode ser <= 0");
        }
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) throws Exception {
      if(comprimento <= 0){
            throw new Exception("O comprimento não pode ser <= 0");
        }
        this.comprimento = comprimento;
    }
    
    public int calcularVolume(){
        return (altura * comprimento * largura);
    }
    public int calcularArea(){
        return (2*(altura*largura + altura*comprimento + largura*comprimento));
    }
}
