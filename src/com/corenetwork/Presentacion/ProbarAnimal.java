package com.corenetwork.Presentacion;

import com.corenetwork.Modelo.Animal;

public class ProbarAnimal {
    public static void main(String[] args) {

        //Crear tres objetos de la clase animal con los nombres de pez, perro, gato

        //pez
       Animal pez = new Animal();
        pez.setCarnivoro(true);
        pez.setMamifero(false);
        pez.setColorPelaje(" No tiene");
        System.out.println(pez.toString());
        System.out.println(pez.Comer());
        System.out.println(pez.emitirSonido());


        //perro
        Animal perro = new Animal(true,true,"negro");
        System.out.println(perro.toString());
        System.out.println(perro.Comer());
        System.out.println(perro.emitirSonido());


        //gato

        Animal gato = new Animal(true,true,"naranja");
        System.out.println(gato.toString());
        System.out.println(gato.Comer());
        System.out.println(gato.emitirSonido());

    }
}
