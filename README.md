# U3-ejercicio19
# 📇 Agenda de Contactos y Validación de Teléfonos

Ejercicio de **Programación Orientada a Objetos en Java** que modela un contacto de una agenda telefónica aplicando el principio de **encapsulamiento**. El nombre, el teléfono y el correo electrónico son privados y solo se actualizan mediante setters que validan el formato de cada dato antes de aceptarlo.

## 🎯 Objetivo

Administrar un contacto telefónico garantizando que su número y su correo cumplan los formatos mínimos requeridos, rechazando cualquier valor inválido sin alterar el dato almacenado.

## ✨ Características

- Atributos privados: `nombre`, `telefono` y `email`.
- `setTelefono(String)`: rechaza letras y caracteres no permitidos, y exige entre 8 y 15 dígitos.
- `setEmail(String)`: exige un único `@` con texto antes y después, sin espacios.
- `setNombre(String)`: rechaza nombres vacíos.
- Mensajes de error específicos que indican el motivo exacto del rechazo.
- `obtenerFicha()` y `obtenerResumen()` devuelven los datos formateados.
- Constructor que valida los datos, por lo que el contacto siempre nace en un estado válido.


## 📚 Conceptos aplicados

Encapsulamiento · Modificadores de acceso · Setters con validación · Manejo de cadenas · Constructores · Métodos privados

![U3 ejercicio19](U3%20ejercicio19.png)
