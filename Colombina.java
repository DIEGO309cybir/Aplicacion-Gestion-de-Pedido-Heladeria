package com.mycompany.heladeriaarctea;

/**
 *
 * @author SEBASTIAN BOHORQUEZ
 */
public class Colombina extends Helados {
    
    public Colombina(String nombre, double precio) {
        super(nombre, precio);
    }
    // En Colombina.java
@Override
public String servir() {
    return "Sirviendo el helado: " + getNombre();
}
    
}
