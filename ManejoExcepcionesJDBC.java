import java.sql.*;

public class ManejoExcepcionesJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/baseD";
    private static final String USER = "usuario";
    private static final String PASSWORD = ""

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Base de datos conectada");

            String query = "SELECT * FROM miTabla";
            try (Statement stmt = connection.createStatement()) {
                ResultSet rs = stmt.executeQuery(query);
            } catch (SQLException e) {
                System.out.println("Error de SQL: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}