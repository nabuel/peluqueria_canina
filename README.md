# 🐾 Peluquería Canina - Sistema de Registro

¡Bienvenido al proyecto **Peluquería Canina**! Esta es una aplicación de escritorio diseñada para gestionar el registro de mascotas y sus dueños de manera eficiente, permitiendo almacenar información detallada sobre cada cliente canino y sus necesidades específicas.

## 🚀 Características

* **Gestión de Mascotas**: Registro de nombre, raza, color y observaciones particulares.
* **Información de Salud**: Control de alergias y atención especial para cada mascota.
* **Vínculo con Dueños**: Cada mascota está asociada a un dueño con sus datos de contacto como teléfono y dirección.
* **Persistencia de Datos**: Utiliza JPA (Java Persistence API) y MySQL para el almacenamiento seguro de la información.
* **Interfaz Gráfica (IGU)**: Diseñada con Swing para una experiencia de usuario intuitiva y amigable.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje**: Java (versión 25).
* **Gestor de Dependencias**: Maven.
* **Persistencia**: JPA con EclipseLink.
* **Base de Datos**: MySQL.
* **Interfaz**: Java Swing.

## 📂 Estructura del Proyecto

El proyecto sigue una arquitectura organizada para facilitar el mantenimiento:

* `com.mycompany.peluqueriacanina.igu`: Contiene las pantallas de la interfaz como `MenuScreen` y `RecordScreen`.
* `com.mycompany.peluqueriacanina.logic`: Contiene las entidades `Pet` y `Owner`, además del controlador de lógica.
* `com.mycompany.peluqueriacanina.persistence`: Controladores JPA para la comunicación con la base de datos.

## ⚙️ Configuración del Sistema

Para ejecutar este proyecto localmente, asegúrate de configurar tu base de datos en el archivo `persistence.xml`:

```xml
<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/peluqueria_canina?serverTimezone=UTC"/>
<property name="javax.persistence.jdbc.user" value="root"/>
<property name="javax.persistence.jdbc.password" value=""/>
```
## 🐋 Instalación y Ejecución Rápida

Sigue estos pasos para ejecutar el proyecto localmente sin necesidad de instalar MySQL de forma manual:

1. **Prerrequisitos:** Asegúrate de tener instalado [Docker Desktop](https://www.docker.com/products/docker-desktop/).
2. **Levantar la Base de Datos:** Abre una terminal en la carpeta raíz del proyecto y ejecuta:
   ```bash
   docker-compose up -d
