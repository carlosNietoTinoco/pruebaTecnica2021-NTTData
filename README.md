# Aplicacion NTT Data

Esta es una aplicación creada a partir de la especificación dada en la prueba técnica enviada por la empresa NTT Data.

Es este Readme se especificara la forma de desplegar la aplicación que está compuesta por 2 contenedores Docker separados que contienen:

- Backend de Java (Spring Boot)
- Interfaz Angular

El punto de entrada para un usuario es un sitio web que está disponible en la dirección: **http://localhost:4200/**

![ADN](https://github.com/carlosNietoTinoco/pruebaTecnica2021-NTTData/blob/main/assets/NTTData-ui.png)


---

### Requisitos previos

Para ejecutar esta aplicación, debe instalar dos herramientas: **Docker** y **Docker Compose**.

Instrucciones de cómo instalar **Docker** en [Ubuntu](https://docs.docker.com/install/linux/docker-ce/ubuntu/), [Windows](https://docs.docker.com/docker-for-windows/install/), [Mac](https://docs.docker.com/docker-for-mac/install/).

**Docker Compose** ya está incluido en los paquetes de instalación para *Windows* y *Mac*, por lo que solo los usuarios de Ubuntu deben seguir [estas instrucciones](https://docs.docker.com/compose/install/).

---

### ¿Cómo ejecutarlo?

Toda la aplicación se puede ejecutar con un solo comando en una terminal abierta en la localización de este proyecto:

```
$ docker-compose up
```

Después de esto ya podrá hacer una prueba completa de la aplicación desde cualquier navegador ingresando a **http://localhost:4200/**, tambien puede realizar peticiones al backend de la aplicación, para esto puede usar la colección de postman que se encuentra [aqui](https://github.com/carlosNietoTinoco/pruebaTecnica2021-NTTData/blob/main/assets/API%20prueba%20tecnica%20NTTData.postman_collection.json)
