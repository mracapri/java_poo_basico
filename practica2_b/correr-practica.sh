echo $1
if [ $1 = "-ola" ]
then
	echo "   __ _   _ __    __ _  __  __  ( _ )   _ __ ___    ___    ___  | |_    __ _   _ __ ___  "
	echo "  / _  | |  __|  / _  | \ \/ /  / _ \  |  _   _ \  / __|  / __| | __|  / _  | |  _   _ \ "
	echo " | (_| | | |    | (_| |  >  <  | (_) | | | | | | | \__ \ | (__  | |_  | (_| | | | | | | |"
	echo "  \__, | |_|     \__,_| /_/\_\  \___/  |_| |_| |_| |___/  \___|  \__|  \__,_| |_| |_| |_|"
	echo "  |___/    "
	
	echo ""
	echo ""
	echo -n "Enter para continuar..." 
	read x
fi

# Este shell-script corre la practica con un solo comando

# Paso 1 - Limpiar, compilar y empaquetar con Maven

mvn clean package

# Paso 2 - Limpiar la consola
clear


# Paso 3 - Correr la aplicacion

java -cp target/poo-java-1.0.0.jar com.curso.App




