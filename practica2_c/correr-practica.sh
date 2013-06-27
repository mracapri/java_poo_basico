# Este shell-script corre la practica con un solo comando

# Paso 1 - Limpiar, compilar y empaquetar con Maven

mvn clean package

# Paso 2 - Limpiar la consola
clear


# Paso 3 - Correr la aplicacion

java -cp target/poo-java-1.0.0.jar com.curso.App




