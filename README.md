# 🍳 Gestor de Recetas Full-Stack

¡Bienvenido al **Gestor de Recetas**! Una aplicación web robusta desarrollada con **Spring Boot** y desplegada en la nube utilizando **Railway**. Este proyecto permite gestionar de manera integral un catálogo de recetas y sus ingredientes asociados.

---

## 🚀 Enlaces del Proyecto

* **🌐 Aplicación en Vivo:** [Ver en Railway](https://gestorrecetas-production.up.railway.app/inicio)
* **📦 Repositorio:** [GitHub Project](https://github.com/TU_USUARIO/TU_REPOSITORIO)

---

## ✨ Características

* **Gestión de Recetas:** Listado detallado y creación de nuevas recetas con parámetros de tiempo y dificultad.
* **Control de Inventario:** Gestión de ingredientes y sus cantidades.
* **Persistencia Total:** Base de datos relacional MySQL integrada.
* **Diseño Responsive:** Interfaz limpia utilizando **Bootstrap 5**.

## 🛠️ Tecnologías Utilizadas

| Tecnología | Uso |
| :--- | :--- |
| **Java 17** | Lenguaje principal |
| **Spring Boot 3** | Framework de backend |
| **Spring Data JPA** | Gestión de base de datos y ORM |
| **MySQL** | Motor de base de datos relacional |
| **Thymeleaf** | Motor de plantillas para el frontend |
| **Bootstrap 5** | Estilos y diseño UI |
| **Railway** | Cloud Hosting y Deployment |

---

## 📸 Vista Previa

> [!TIP]
> Puedes añadir capturas de pantalla de tu aplicación aquí para que se vea mucho mejor.

### Inicio
Página principal personalizada con acceso directo a todas las funcionalidades.

### Listados
Tablas dinámicas que consumen datos en tiempo real desde la base de datos MySQL.

---

## ⚙️ Configuración y Despliegue

La aplicación está configurada para funcionar en entornos de producción mediante variables de entorno, garantizando la seguridad de las credenciales:

```properties
spring.datasource.url=jdbc:${MYSQL_URL}
spring.datasource.username=${MYSQLUSER}
spring.datasource.password=${MYSQLPASSWORD}
