import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = ConexionDB.getConnection();
             Scanner sc = new Scanner(System.in)) {

            System.out.println("✅ Conexión a la base de datos establecida.");

            boolean salir = false;
            while (!salir) {
                System.out.println("\nElige una opción: insertar, eliminar, salir");
                System.out.print("Opción: ");
                String accion = sc.nextLine().trim().toLowerCase();

                switch (accion) {
                    case "insertar":
                        System.out.println("¿Qué deseas insertar? paciente o medico");
                        System.out.print("Tipo: ");
                        String tipoInsertar = sc.nextLine().trim().toLowerCase();
                        if (tipoInsertar.equals("paciente")) {
                            Insert.insertarPaciente(conn, sc);
                        } else if (tipoInsertar.equals("medico")) {
                            Insert.insertarMedico(conn, sc);
                        } else {
                            System.out.println("Tipo no válido.");
                        }
                        break;

                    case "eliminar":
                        System.out.println("¿Qué deseas eliminar? paciente o medico");
                        System.out.print("Tipo: ");
                        String tipoEliminar = sc.nextLine().trim().toLowerCase();
                        if (tipoEliminar.equals("paciente")) {
                            Insert.eliminarPaciente(conn, sc);
                        } else if (tipoEliminar.equals("medico")) {
                            Insert.eliminarMedico(conn, sc);
                        } else {
                            System.out.println("Tipo no válido.");
                        }
                        break;

                    case "salir":
                        salir = true;
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
