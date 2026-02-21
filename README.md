INSTRUCCIONES DETALLADAS PARA EJECUTAR EL PROYECTO

Práctica: Pilas + Maven

Estas instrucciones explican paso a paso cómo abrir, compilar y ejecutar correctamente el proyecto utilizando la consola del sistema. 


- Compilar e instalar la librería (PASO OBLIGATORIO)

Primero se debe compilar la librería para que Maven la registre en el repositorio local.

Paso 1 — Abrir terminal en la carpeta de la librería

Ejemplo de ruta:

C:\Users\USUARIO\Downloads\Practica Pilas + Maven\umg.edu.gt.data-structure.stack

Paso 2 — Ejecutar el comando Maven

mvn clean install

Este comando:

- Compila el código
- Genera el archivo JAR
- Instala la librería en el repositorio local Maven (.m2)

Si aparece el mensaje BUILD SUCCESS, el proceso fue exitoso.

-Compilar el proyecto principal (stackHandler)

Paso 1 — Abrir terminal en la carpeta:

stackHandler

Ejemplo:

C:\Users\USUARIO\Downloads\Practica Pilas + Maven\stackHandler

Paso 2 — Ejecutar:

mvn clean package

Esto generará los archivos ejecutables dentro de la carpeta:

target

-Ejecutar el programa desde consola

Una vez compilado, ejecutar el siguiente comando:

java -jar target/stackHandler-0.0.1-SNAPSHOT-jar-with-dependencies.jar "(a+b) * [c-d]"

Ejemplo de salida esperada:

Expression: (a+b) * [c-d]
Valid: true

También se puede probar una expresión inválida:

java -jar target/stackHandler-0.0.1-SNAPSHOT-jar-with-dependencies.jar "([)]"

Salida esperada:

Expression: ([)]
Valid: false


-Generar y ejecutar la versión ofuscada

Para generar el archivo ofuscado se utiliza un perfil Maven.

Paso 1 — Ejecutar:

mvn clean package -Pobfuscate

Esto generará un nuevo archivo en la carpeta "target":

stackHandler-0.0.1-SNAPSHOT-obf.jar

Paso 2 — Ejecutar el archivo ofuscado:

java -jar target/stackHandler-0.0.1-SNAPSHOT-obf.jar "(a+b)"




- Ejecución de la librería ofuscada (opcional)

También puede generarse el JAR ofuscado de la librería:

1. Abrir terminal en:

umg.edu.gt.data-structure.stack

2. Ejecutar:

mvn clean package -Pobfuscate





NOTA:

Debe ejecutarse el archivo jar-with-dependencies.jar, no el jar normal.


