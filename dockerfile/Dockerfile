# Usar una imagen base de Java
FROM openjdk:17-jdk-slim

# Configurar el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR al contenedor
COPY *.jar /app/my-app.jar

# Especificar el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/my-app.jar"]
