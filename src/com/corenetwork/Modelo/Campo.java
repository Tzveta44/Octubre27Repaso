package com.corenetwork.Modelo;

public class Campo {


    //1. Atributos

    private int x;

    //2. Métodos

    public int mostrar() {
        return x;
    }

    public void incrementa() {
        x++;
    }

    //3. Constructores

    public void Campos() {
    }

    public Campo(int x) {
        this.x = x;
    }
    //4. Setters y Getters


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
