🐾 Peluquería Canina - Sistema de Registro
¡Bienvenido al proyecto Peluquería Canina! Esta es una aplicación de escritorio diseñada para gestionar el registro de mascotas y sus dueños de manera eficiente, permitiendo almacenar información detallada sobre cada cliente canino y sus necesidades específicas.

🚀 Características
Gestión de Mascotas: Registro de nombre, raza, color y observaciones particulares.

Información de Salud: Control de alergias y atención especial para cada mascota.

Vínculo con Dueños: Cada mascota está asociada a un dueño con sus datos de contacto (teléfono y dirección).

Persistencia de Datos: Utiliza JPA (Java Persistence API) y MySQL para el almacenamiento seguro de la información.

Interfaz Gráfica (IGU): Diseñada con Swing para una experiencia de usuario intuitiva y amigable.

🛠️ Tecnologías Utilizadas
Lenguaje: Java 25.

Gestor de Dependencias: Maven.

Persistencia: JPA / Hibernate / EclipseLink.

Base de Datos: MySQL.

Interfaz: Java Swing.

📂 Estructura del Proyecto
El proyecto sigue una arquitectura organizada para facilitar el mantenimiento:

com.mycompany.peluqueriacanina.igu: Contiene las pantallas de la interfaz (Menú, Registro, Visualización).

com.mycompany.peluqueriacanina.logic: Contiene las entidades (Pet, Owner) y el controlador de la lógica de negocio.

com.mycompany.peluqueriacanina.persistence: Controladores JPA para la comunicación con la base de datos.

⚙️ Configuración del Sistema
Para ejecutar este proyecto localmente, asegúrate de configurar tu base de datos en el archivo persistence.xml:

XML

<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/peluqueria_canina"/>
<property name="javax.persistence.jdbc.user" value="TU_USUARIO"/>
<property name="javax.persistence.jdbc.password" value="TU_CONTRASEÑA"/>
(Nota: El sistema está configurado para crear la base de datos automáticamente si no existe).

📸 Vistas de la Aplicación
Menú Principal: Acceso rápido a las funciones de registro y consulta.

Formulario de Registro: Carga completa de datos de la mascota y su dueño.

Desarrollado con ❤️ para el cuidado de nuestras mascotas.
