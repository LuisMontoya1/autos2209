package autos2209;

import java.awt.Color;

public class Autos2209 {

    public static void main(String[] args) {

        //Bocho
        Características miBocho = new Características();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println("Marca: " + miBocho.getMarca());
        System.out.println("SubMarca: " + miBocho.getSubMarca());
        System.out.println("Modelo: " + miBocho.getModelo());
        System.out.println("Color: " + miBocho.getColor());
        System.out.println("");

        //Mustang
        Características miMustang = new Características();
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("Mustan");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.yellow);
        System.out.println("Marca: " + miMustang.getMarca());
        System.out.println("SubMarca: " + miMustang.getSubMarca());
        System.out.println("Modelo: " + miMustang.getModelo());
        System.out.println("Color: " + miMustang.getColor());
        System.out.println("");

        //Akura
        Características miAkura = new Características();
        miAkura.setMarca("Akura");
        miAkura.setSubMarca("NSX");
        miAkura.setModelo(2013);
        miAkura.setColor(Color.gray);
        System.out.println("Marca: " + miAkura.getMarca());
        System.out.println("SubMarca: " + miAkura.getSubMarca());
        System.out.println("Modelo: " + miAkura.getModelo());
        System.out.println("Color: " + miAkura.getColor());
    }
}