package com.curso;

public class App{

	public static void main(String[] arg){

    public static void main( String[] args ) throws SQLException {
        // Crea una conexion a la base de datos
        // usuario: 	root
        // password: 	root
        // servidor:	localhost

        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/", "root", null)) {


            // Crea una stentencia
            try (Statement stmt = conn.createStatement()) {

                //Ejecuta el SQL
                String sql = "SELECT 'Hello World!'";
                try (ResultSet rs = stmt.executeQuery(sql)) {
                    
                    // Saca los resultados
                    while(rs.next()){
                    	System.out.println(rs.getString(1));
                    }
                }

            }
        }
    }
}
