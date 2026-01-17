import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {

    public Connection connectDB() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/uc11?useSSL=false&serverTimezone=UTC",
                "root",
                ""
            );
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,
                "Erro ao conectar com o banco: " + erro.getMessage()
            );
        }

        return conn;
    }
}
