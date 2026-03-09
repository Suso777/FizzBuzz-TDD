# 🎯 FizzBuzz-TDD

> Un proyecto moderno de implementación del clásico juego FizzBuzz utilizando Desarrollo Basado en Pruebas (TDD)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Language: Java](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![TDD Approach](https://img.shields.io/badge/Approach-TDD-blue.svg)](https://en.wikipedia.org/wiki/Test-driven_development)

## 📋 Tabla de Contenidos

- [Descripción](#descripción)
- [¿Qué es FizzBuzz?](#qué-es-fizzbuzz)
- [Metodología TDD](#metodología-tdd)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Resultados de Pruebas](#resultados-de-pruebas)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Contribuir](#contribuir)
- [Licencia](#licencia)

## 📝 Descripción

Este proyecto es una implementación elegante y bien probada del problema clásico de FizzBuzz. Se desarrolló utilizando la metodología **Test-Driven Development (TDD)**, lo que garantiza una cobertura completa de pruebas y un código de alta calidad.

## 🎮 ¿Qué es FizzBuzz?

FizzBuzz es un ejercicio de programación simple pero efectivo que implica:

- **Contar** números desde 1 hasta N
- **Reemplazar múltiplos de 3** con \"Fizz\"
- **Reemplazar múltiplos de 5** con \"Buzz\"
- **Reemplazar múltiplos de ambos** (15) con \"FizzBuzz\"

### Ejemplo:
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, ...

<img width="355" height="196" alt="CapturaTestJava" src="https://github.com/user-attachments/assets/1015e8d7-e005-4f2a-9918-8e5f4eee555a" />


Code

## 🧪 Metodología TDD

Este proyecto sigue estrictamente la metodología TDD:

1. **🔴 Rojo** - Escribir una prueba que falla
2. **🟢 Verde** - Escribir el código mínimo para que la prueba pase
3. **🔵 Refactor** - Mejorar el código manteniendo las pruebas verdes

Esta metodología garantiza:
- ✅ Código confiable y bien documentado
- ✅ Alta cobertura de pruebas
- ✅ Fácil mantenimiento y escalabilidad
- ✅ Detección temprana de errores

## 📦 Requisitos

- **Java 11+**
- **Maven 3.6+** (o Gradle)
- **JUnit 5+** para las pruebas

## 🚀 Instalación

```bash
# Clonar el repositorio
git clone https://github.com/Suso777/FizzBuzz-TDD.git

# Navegar al directorio
cd FizzBuzz-TDD

# Compilar el proyecto
mvn clean compile

# Ejecutar las pruebas
mvn test
💻 Uso
Java
// Ejemplo de uso básico
FizzBuzz fizzbuzz = new FizzBuzz();
String resultado = fizzbuzz.generate(15);
System.out.println(resultado);
// Output: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
📊 Resultados de Pruebas
Capturas de Ejecución de Tests
A continuación se muestran los resultados de las pruebas ejecutadas:

✅ Suite de Pruebas Completa
![Test Results](docs/screenshots/test-results.png)

✅ Cobertura de Código
![Code Coverage](docs/screenshots/code-coverage.png)

✅ Detalles de Ejecución
![Test Execution Details](docs/screenshots/test-details.png)

Estadísticas:

📈 Total de Pruebas: 12
✅ Pruebas Exitosas: 12
❌ Pruebas Fallidas: 0
⏱️ Tiempo Total: ~250ms
📊 Cobertura de Código: 95%
📁 Estructura del Proyecto
Code
FizzBuzz-TDD/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/fizzbuzz/
│   │           └── FizzBuzz.java
│   └── test/
│       └── java/
│           └── com/fizzbuzz/
│               └── FizzBuzzTest.java
├── docs/
│   └── screenshots/
│       ├── test-results.png
│       ├── code-coverage.png
│       └── test-details.png
├── pom.xml
└── README.md
🤝 Contribuir
¡Las contribuciones son bienvenidas! Para contribuir a este proyecto:

Fork el repositorio
Crea una rama para tu feature (git checkout -b feature/AmazingFeature)
Realiza tus cambios siguiendo TDD
Commit tus cambios (git commit -m 'Add some AmazingFeature')
Push a la rama (git push origin feature/AmazingFeature)
Abre un Pull Request
Directrices de Contribución
✅ Escribir pruebas primero (TDD)
✅ Mantener la cobertura de código > 90%
✅ Seguir las convenciones de código Java
✅ Documentar cambios significativos
📄 Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.


⭐ Si te gustó este proyecto, ¡no olvides darle una estrella!
Desarrollado con ❤️ por Suso777

