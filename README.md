# Trabajo Práctico 3: TDA Pila

## Descripción

Este repositorio contiene la resolución de ejercicios relacionados con el Tipo de Dato Abstracto **Pila**, implementado tanto en su versión **estática (usando arreglos)** como **dinámica (usando listas enlazadas)**. El objetivo es comprender y aplicar las operaciones fundamentales de este TDA en distintos contextos algorítmicos.

## Ejercicios Realizados

### 1. Métodos adicionales en pila basada en arreglo
- **Descripción:** Se implementan dos métodos adicionales a los fundamentales (`push`, `pop`, `peek`, `isEmpty`, `isFull`) en una estructura de pila estática. Los métodos agregados son:
  - `size()`: Devuelve la cantidad de elementos en la pila.
  - `clear()`: Vacía completamente la pila.

### 2. Pila con operaciones desde la posición 0
- **Descripción:** Implementación de una pila utilizando un arreglo, en la que las operaciones `push` y `pop` se realizan siempre en la posición 0. Esto implica desplazar los elementos del arreglo en cada operación.

### 3. Pila dinámica con listas enlazadas
- **Descripción:** Implementación de una pila con capacidad dinámica usando listas enlazadas simples. Incluye las operaciones fundamentales del TDA Pila y se valida su funcionamiento mediante un ejemplo simple.

### 4. Verificación de paréntesis balanceados
- **Descripción:** Algoritmo que verifica si los paréntesis en una expresión matemática o lógica están correctamente balanceados, utilizando una pila para el control de apertura y cierre.

### 5. Inversión de cadena de texto
- **Descripción:** Programa que invierte el orden de los caracteres de una cadena ingresada por el usuario, utilizando una pila.

### 6. Conversión de notación infija a postfija
- **Descripción:** Conversión de una expresión matemática desde notación infija (ej. `A + B`) a postfija (ej. `AB+`) utilizando una pila, siguiendo el algoritmo del Shunting Yard.

### 7. Simulación de deshacer/rehacer
- **Descripción:** Simulación del sistema de “Deshacer” y “Rehacer” típico de un editor de texto. Cada acción se almacena en una pila, permitiendo revertir o restaurar cambios de forma ordenada.

## Integrantes del Grupo

- **Nombre Completo:** Melissa Oriana Mareco  
- **Legajo:** 1148938

## Instrucciones para ejecutar el proyecto

1. Asegúrate de tener instalado **Java** en tu máquina. Si no lo tienes, puedes descargarlo desde el sitio oficial de [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Descarga o clona este repositorio en tu máquina local.
3. Abre la terminal o línea de comandos y navega hasta el directorio del proyecto.
4. Compila los archivos Java con el siguiente comando:

   ```bash
   javac *.java
