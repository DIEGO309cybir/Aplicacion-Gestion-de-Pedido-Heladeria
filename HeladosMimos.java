package com.mycompany.heladeriaarctea;

public class HeladosMimos extends Helados {
    
    public HeladosMimos(String nombre, double precio) {
        super(nombre, precio);
    }
    
    @Override
    public String servir() {
        return "Sirviendo Helado: " + getNombre();
    }
}
