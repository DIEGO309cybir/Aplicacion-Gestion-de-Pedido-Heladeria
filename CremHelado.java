package com.mycompany.heladeriaarctea;

public class CremHelado extends Helados {
    
    public CremHelado(String nombre, double precio) {
        super(nombre, precio);
    }
    // En CremHelado.java
@Override
public String servir() {
    return "Sirviendo el helado: " + getNombre(); 
}


    
} 
