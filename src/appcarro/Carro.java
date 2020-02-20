/*
 * Está classe foi feita para declarar as variavel, entrada e saida para a seguinte classe JP.
 */
package appcarro;

/**
 * @author Nicolas, Mairon, Patrique e Luan.
 */
public class Carro {
    /*
    * Declaração das variavel:
    * Variavel modelo vai receber uma palavra.
    * variavel ano vai receber números.
    * Variavel preço vai receber valor de venda.
    * Variavel fabricante vai receber o nome industria que fabrica o carro.
    */
    private String modelo;
    private int ano; 
    private double preço;
    private String fabricante;
    
    /*
    * Declaração do metodo construtor.
    */
    public Carro(String modelo, int ano, double preço, String fabricante) {
        this.modelo = modelo;
        this.ano = ano;
        this.preço = preço;
        this.fabricante = fabricante;
    }
    /*
    * Declaração do metodo get e set. 
    */
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
}
