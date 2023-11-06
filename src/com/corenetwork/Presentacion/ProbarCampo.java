package com.corenetwork.Presentacion;

import com.corenetwork.Modelo.Campo;

public class ProbarCampo {
    public static void main(String[] args) {
        Campo c1 = new Campo(5);
        c1.incrementa();
        c1.incrementa();
        System.out.println(c1.mostrar());


    }
}
