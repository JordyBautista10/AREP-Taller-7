# AREP-Taller-7: APLICACIÓN DISTRIBUIDA SEGURA EN TODOS SUS FRENTES

Este repositorio contiene el código fuente y la documentación para un proyecto de desarrollo de una aplicación web segura. El objetivo principal de este proyecto es implementar una aplicación web que cumpla con rigurosos estándares de seguridad, garantizando la autenticación, autorización e integridad de los usuarios y los datos.

## Prerequisitos

Para que el código corra de forma satisfactoria y se puedan seguir todos los pasos se necesitara de: Java, Maven, Git y Docker; sin embargo,  para la descarga e instalación de estos elementos, adjunto los link de material de apoyo de otros autores

* [Tutorial instalación Java] (https://youtu.be/4WKo13f2Qpc?si=lHG84Jp_k7YbBFmp)
* [Tutorial instalación Git] (https://youtu.be/jpTrSSjPlEo?si=VdcaXSaNEFkR3hCk)
* [Tutorial instalación Maven] (https://youtu.be/biBOXvSNaXg?si=wfySIfBTUERGEVZC)
* [Tutorial instalación Docker] (https://youtu.be/_et7H0EQ8fY)

## Construido con:

* [Java](http://www.dropwizard.io/1.0.2/docs/) - Lenguaje con el cual funciona la mayor parte del proyecto
* [Html](https://developer.mozilla.org/es/docs/Web/HTML) - Usado para la sección del cliente
* [JavaScript](https://developer.mozilla.org/es/docs/Web/JavaScript) - Este lenguaje le permite al cliente realizar las peticiones necesarias
* [Maven](https://maven.apache.org/) - Usado para la construcción de la estructura del proyecto
* [Git](https://git-scm.com) - Usado para el versionamiento
* [Docker](https://www.docker.com/products/docker-desktop/) - Es un software que permite crear imágenes y correr contenedores
* [Spark](https://mvnrepository.com/artifact/org.apache.spark/spark-core) - Framework con el cual se realizó el API
* [AWS](https://aws.amazon.com/es/) - Plataforma de servicios en la nube que maneja almacenamiento, bases de datos, análisis, inteligencia artificial, aprendizaje automático, Internet de las cosas (IoT), seguridad y mucho más.

## Para Comenzar (Local)

### Repositorio

En primera instancia, debemos obtener el código del proyecto, por lo que se ejecutara el comando desde consola. (tenga en cuenta que debe estar en la carpeta deseada antes de clonar el repositorio)

~~~
https://github.com/JordyBautista10/AREP-Taller-7.git
~~~

Se entra a la carpeta del proyecto:

~~~
cd AREP-Taller-7
~~~

Posteriormente, descargamos las dependencias necesarias y compilamos el código:

~~~
mvn clean install compile
~~~

Ahora para ejecutar los servicios se usa el siguiente comando (es necesario contar con la sección <build> dentro del pom.xml):  

`Windows`
~~~
java -cp "target\classes;target\dependency\*" co.edu.escuelaing.WebService
~~~

`Linux`:
~~~
java -cp "target\classes:target\dependency\*" co.edu.escuelaing.WebService
~~~