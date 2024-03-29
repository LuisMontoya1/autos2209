package autos2209;

import java.awt.Color;

public class Características {

    private String marca;
    private String subMarca;
    private int modelo;
    private Color color;

    public Características() {
    }

    public Características(String marca, String subMarca, int modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void encender() {
        System.out.println("El auto " + this.subMarca + " esta encendido");
    }

    public void acelerar() {
        System.out.println("Acelerando al auto " + this.subMarca + "");
    }

    public void avanzar() {
        System.out.println("Avanzando el auto");
    }
}
