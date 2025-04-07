package com.mycompany.heladeriaarctea;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<Helados> helados; // nombre en minúscula por convención

    public Pedido() {
        helados = new ArrayList<>();
    }

    public void agregarHelado(Helados helado) {
        helados.add(helado);
    }

    public void eliminarHelado(Helados helado) {
        helados.remove(helado);
    }

    public void limpiarPedido() {
        helados.clear();
    }

    public double calcularTotal() {
        double total = 0;
        for (Helados helado : helados) {
            total += helado.getPrecio();
        }
        return total;
    }

    public List<Helados> getHelados() {
        return helados;
    }

    public String generarResumen() {
        StringBuilder resumen = new StringBuilder("Resumen del pedido:\n\n");
        for (Helados helado : helados) {
            resumen.append("- ").append(helado.toString()).append("\n");
        }
        resumen.append("\nTotal: $").append(calcularTotal());
        return resumen.toString();
    }

    public boolean estaVacio() {
        return helados.isEmpty();
    }
}
