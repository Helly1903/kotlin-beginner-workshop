# Kotlin-Beginner-Workshop 

**Estudiante:** Santiago Helly Mejia Rendón

## Descripción

Taller práctico de introducción a Kotlin. Contiene 8 ejercicios que aplican los
conceptos fundamentales del lenguaje: variables y tipos de datos, condicionales,
ciclos, colecciones, funciones, clases y manejo seguro de valores nulos (null safety).

## Estructura del proyecto

Cada ejercicio se desarrolló de manera individual dentro de la carpeta `src`,
en su propia subcarpeta (`exercise-01` a `exercise-08`). Cada uno cuenta con su
propio archivo `main()`, nombrado de forma numerada para evitar conflictos de compilación
con los `main()` de los otros ejercicios:

| Ejercicio | Carpeta | Archivo |
|---|---|---|
| 1. Calculadora básica | `src/exercise-01` | `Main.kt` |
| 2. Clasificación de estudiantes | `src/exercise-02` | `Main2.kt` |
| 3. Tabla de multiplicar | `src/exercise-03` | `Main3.kt` |
| 4. Análisis de una lista | `src/exercise-04` | `Main4.kt` |
| 5. Funciones matemáticas | `src/exercise-05` | `Main5.kt` |
| 6. Gestión de productos | `src/exercise-06` | `Main6.kt` |
| 7. Agenda de contactos | `src/exercise-07` | `Main7.kt` |
| 8. Manejo de valores nulos | `src/exercise-08` | `Main8.kt` |

## Cómo revisar cada ejercicio

1. Ingresar a la carpeta correspondiente, por ejemplo: `kotlin-beginner-workshop/src/exercise-01`
2. Al dar clic en el archivo `Main.kt` (o `MainN.kt` según el ejercicio) para ver el código completo y final.
3. Para ver el proceso de desarrollo, se debe dar clic en **History** (parte derecha de la vista del archivo en GitHub). Ahí aparece el historial de commits de ese ejercicio específico, mostrando las etapas en las que se construyó la solución del punto).

Este mismo procedimiento aplica para los 8 ejercicios.

## Cómo ejecutar los ejercicios

1. Clonar o descargar el repositorio.
2. Abrirlo como proyecto en IntelliJ IDEA.
3. En el panel de proyecto (izquierda), navegar hasta la carpeta del ejercicio que se desea ejecutar, por ejemplo `src/exercise-08`.
4. Abrir el archivo `Main.kt` (o `MainN.kt`) de esa carpeta.
5. Buscar la función `fun main()` dentro del archivo. A su izquierda, en el margen del editor, aparece un ícono de flecha verde.
6. Hacer clic en ese ícono y seleccionar **Run**. IntelliJ compilará y ejecutará únicamente ese archivo, mostrando el resultado en la consola inferior.

No es necesario configurar nada adicional: cada archivo se ejecuta de forma independiente sin afectar a los demás ejercicios.