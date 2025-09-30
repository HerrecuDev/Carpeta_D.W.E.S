# Copilot Instructions for AI Agents

## Arquitectura y Componentes Clave
- Proyecto Java simple, orientado a prácticas de lambdas y streams.
- Estructura principal:
  - `src/main/java/org/iesvdm/App.java`: punto de entrada, ejemplo básico.
  - `streams/IFuncionOperacion.java`: interfaz funcional para operaciones matemáticas, utilizada en ejemplos de clases anónimas y lambdas.
  - `src/test/java/org/iesvdm/JavaFunctionTest.java`: tests que ilustran patrones de uso de clases anónimas, closures y lambdas.

## Flujos de trabajo críticos
- **Compilación y ejecución:**
  - Usar Maven: `mvn clean package`
  - Ejecutar la aplicación: `mvn exec:java -Dexec.mainClass="org.iesvdm.App"`
- **Pruebas:**
  - Ejecutar tests: `mvn test`
  - Los tests usan JUnit 4 (`junit:junit:4.13.2`).

## Patrones y convenciones específicas
- Las interfaces funcionales se implementan tanto con clases anónimas como con expresiones lambda (ver `JavaFunctionTest.java`).
- Los closures se demuestran atrapando variables externas en clases anónimas y lambdas.
- Los métodos de test incluyen comentarios pedagógicos para explicar el "por qué" de cada patrón.
- El código de ejemplo prioriza la claridad didáctica sobre la optimización o complejidad.

## Integraciones y dependencias
- Dependencia principal: JUnit 4 para pruebas.
- No hay integración con bases de datos, servicios externos ni frameworks complejos.

## Ejemplos de patrones clave
- Implementación de operaciones matemáticas con clases anónimas:
  ```java
  IFuncionOperacion suma = new IFuncionOperacion() {
      public double operacion(double a, double b) { return a + b; }
  };
  ```
- Implementación con lambda:
  ```java
  IFuncionOperacion mult = (a, b) -> a * b;
  ```
- Uso de closures:
  ```java
  final double constante = 1.234;
  IFuncionOperacion op = (a, b) -> a * b * constante;
  ```

## Archivos clave para referencia
- `streams/IFuncionOperacion.java`: define la interfaz funcional.
- `src/test/java/org/iesvdm/JavaFunctionTest.java`: muestra todos los patrones relevantes.
- `pom.xml`: define dependencias y plugins Maven.

---
¿Falta alguna convención, flujo o integración relevante? Indica detalles para mejorar estas instrucciones.