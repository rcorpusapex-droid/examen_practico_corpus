# Java Ejercicios + PokeAPI Pro

Proyecto desarrollado en Java que reúne ejercicios prácticos de lógica y programación orientada a objetos, junto con un módulo de consumo de API externa usando PokeAPI. Además, se incluye una versión con Spring Boot para exponer un endpoint local y realizar pruebas desde Postman o navegador.

## Descripción del proyecto

Este proyecto está dividido en dos partes principales.

La primera parte contiene ejercicios prácticos de Java enfocados en reforzar fundamentos importantes del lenguaje, como:

- estructuras de control
- ciclos
- arreglos
- métodos
- clases y objetos
- encapsulamiento
- interfaces
- validación de datos

Cada ejercicio fue resuelto con un enfoque claro, funcional y ordenado, buscando que el código no solo funcione, sino que también sea fácil de leer, entender y mantener.

La segunda parte corresponde al consumo de una API externa, en este caso **PokeAPI**, una API pública que permite consultar información de Pokémon. En el proyecto se implementa una búsqueda por nombre, aunque el recurso también permite consultar por id.

Por ejemplo, la URL:

`https://pokeapi.co/api/v2/pokemon/pikachu`

consulta el recurso `pokemon` de la API y devuelve la información correspondiente a `pikachu`.

La estructura de esa URL se entiende así:

- `https://pokeapi.co` → dominio de la API
- `/api/v2/` → versión de la API
- `/pokemon/` → recurso consultado
- `pikachu` → parámetro enviado en la ruta

Ese último valor puede ser el nombre del Pokémon o también su identificador numérico. Por ejemplo:

`https://pokeapi.co/api/v2/pokemon/25`

Además del consumo en consola, se agregó una implementación con **Spring Boot** para exponer una API local. Esto permite probar el proyecto desde Postman o navegador y mostrar una estructura más cercana a un entorno real de desarrollo backend.

## Contenido del proyecto

El proyecto incluye:

- 10 ejercicios de Java
- un módulo de consumo de PokeAPI desde consola
- una API local con Spring Boot para consultar Pokémon desde `localhost`

## Requisitos

Para ejecutar este proyecto se recomienda contar con lo siguiente:

- Java 17 o superior
- Maven 3.9 o superior
- Visual Studio Code, IntelliJ IDEA o Eclipse

## Estructura del proyecto

```text
src/main/java/
 ├─ ejercicios/
 │   ├─ Pregunta1.java
 │   ├─ EjemploFor.java
 │   ├─ EjemploWhile.java
 │   ├─ Pregunta3.java
 │   ├─ Pregunta4.java
 │   ├─ Persona.java
 │   ├─ Pregunta6.java
 │   ├─ Pregunta7.java
 │   ├─ Pregunta8.java
 │   ├─ Pregunta9.java
 │   └─ Pregunta10.java
 └─ pokeapi/
     ├─ Main.java
     ├─ PokeApiApplication.java
     ├─ controller/
     ├─ model/
     └─ service/