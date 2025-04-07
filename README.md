# 🍦 Heladería Arctea - Sistema de Gestión de Pedidos

![Logo Heladería Arctea](LogoHeladosArctea.png)

Aplicación Java Swing para la gestión de pedidos en una heladería, con catálogo de productos, carrito de compras y generación de facturas.

## 📋 Características Principales

- Catálogo organizado por marcas: Crem Helados, Colombina y Mimo's
- Sistema de pedidos con cálculo automático de totales
- Interfaz gráfica intuitiva con navegación por categorías
- Generación de resúmenes/facturas de pedidos
- Diseño responsive y atractivo visualmente

## 🛠️ Tecnologías Utilizadas

- Java 8+
- Java Swing (GUI)
- Maven (Gestión de dependencias)
- Git (Control de versiones)

## 📦 Estructura del Proyecto
heladeria-arctea/
├── src/
│ ├── main/
│ │ ├── java/com/mycompany/heladeriaarctea/
│ │ │ ├── Helados.java # Clase abstracta base
│ │ │ ├── CremHelado.java # Helados marca Crem
│ │ │ ├── Colombina.java # Helados marca Colombina
│ │ │ ├── HeladosMimos.java # Helados marca Mimo's
│ │ │ ├── Pedido.java # Lógica de gestión de pedidos
│ │ │ └── HeladeriaArctea.java # Clase principal con GUI
│ │ └── resources/ # Recursos (imágenes)
├── pom.xml # Configuración Maven
└── README.md
