package org.example;

abstract class Dulce extends Producto {
    public Dulce(int serie, int precio) {
        super(serie, precio);
    }
    public abstract String consumir();
}
