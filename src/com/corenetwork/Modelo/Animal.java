package com.corenetwork.Modelo;

public class Animal {


    //Atributos
    private boolean mamifero;
    private boolean carnivoro;
    private String ColorPelaje;

    public Animal() {

    }


//Metodos

    public String emitirSonido() {
        return "El animal esta emitiendo sonido";
    }

    public String Comer() {
        return "El animal esta comiendo";
    }


    @Override
    public String toString() {
        return "Animal{" +
                "mamifero=" + mamifero +
                ", carnivoro=" + carnivoro +
                ", colorPelaje='" + ColorPelaje + '\'' +
                '}';
    }




        //Constructores
    public Animal (boolean mamifero,boolean carnivoro, String colorPelaje)
    {this.mamifero=mamifero;
    this.carnivoro=carnivoro;
    this.ColorPelaje=colorPelaje;}

    //Getters y Setters


    public boolean isMamifero() {
        return mamifero;
    }

    public void setMamifero(boolean mamifero) {
        this.mamifero = mamifero;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    public String getColorPelaje() {
        return ColorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        ColorPelaje = colorPelaje;
    }
}
