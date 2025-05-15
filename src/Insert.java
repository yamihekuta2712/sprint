import java.sql.*;
import java.util.Scanner;

public class Insert {

    public static void insertarPaciente(Connection conn, Scanner sc) {
        try {
            System.out.print("Introduce id_paciente (int): ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Introduce nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Introduce apellidos: ");
            String apellidos = sc.nextLine();
            System.out.print("Introduce direccion: ");
            String direccion = sc.nextLine();
            System.out.print("Introduce provincia: ");
            String provincia = sc.nextLine();
            System.out.print("Introduce codigo_postal: ");
            String codigoPostal = sc.nextLine();
            System.out.print("Introduce telefono: ");
            String telefono = sc.nextLine();
            System.out.print("Introduce fecha_nacimiento (YYYY-MM-DD): ");
            Date fechaNacimiento = Date.valueOf(sc.nextLine());

            String sql = "INSERT INTO paciente (id_paciente, nombre, apellidos, direccion, provincia, codigo_postal, telefono, fecha_nacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.setString(2, nombre);
                ps.setString(3, apellidos);
                ps.setString(4, direccion);
                ps.setString(5, provincia);
                ps.setString(6, codigoPostal);
                ps.setString(7, telefono);
                ps.setDate(8, fechaNacimiento);
                ps.executeUpdate();
                System.out.println("✅ Paciente insertado correctamente.");
            }
        } catch (NumberFormatException e) {
            System.out.println("❌ El id debe ser un número entero válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Formato de fecha incorrecto.");
        } catch (SQLException e) {
            System.out.println("❌ Error al insertar paciente en la base de datos:");
            e.printStackTrace();
        }
    }

    public static void eliminarPaciente(Connection conn, Scanner sc) {
        listarPacientes(conn);
        try {
            System.out.print("Introduce id_paciente a eliminar: ");
            int id = Integer.parseInt(sc.nextLine());
            String sql = "DELETE FROM paciente WHERE id_paciente = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                int rows = ps.executeUpdate();
                if (rows > 0) {
                    System.out.println("✅ Paciente eliminado correctamente.");
                } else {
                    System.out.println("❌ No existe paciente con ese id.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("❌ El id debe ser un número entero válido.");
        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar paciente. Puede tener ingresos asociados.");
            // e.printStackTrace();
        }
    }

    public static void listarPacientes(Connection conn) {
        String sql = "SELECT id_paciente, nombre, apellidos FROM paciente";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n📋 Lista actual de pacientes:");
            while (rs.next()) {
                System.out.printf("  ID: %d - %s %s\n",
                        rs.getInt("id_paciente"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"));
            }
            System.out.println();
        } catch (SQLException e) {
            System.out.println("❌ Error al listar pacientes:");
            e.printStackTrace();
        }
    }

    // MÉTODOS PARA MEDICOS (muy similar a pacientes)

    public static void insertarMedico(Connection conn, Scanner sc) {
        try {
            System.out.print("Introduce id_medico (int): ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Introduce nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Introduce apellidos: ");
            String apellidos = sc.nextLine();
            System.out.print("Introduce especialidad: ");
            String especialidad = sc.nextLine();
            System.out.print("Introduce correo: ");
            String correo = sc.nextLine();

            String sql = "INSERT INTO medico (id_medico, nombre, apellidos, especialidad, correo) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.setString(2, nombre);
                ps.setString(3, apellidos);
                ps.setString(4, especialidad);
                ps.setString(5, correo);
                ps.executeUpdate();
                System.out.println("✅ Médico insertado correctamente.");
            }
        } catch (NumberFormatException e) {
            System.out.println("❌ El id debe ser un número entero válido.");
        } catch (SQLException e) {
            System.out.println("❌ Error al insertar médico en la base de datos:");
            e.printStackTrace();
        }
    }

    public static void eliminarMedico(Connection conn, Scanner sc) {
        listarMedicos(conn);
        try {
            System.out.print("Introduce id_medico a eliminar: ");
            int id = Integer.parseInt(sc.nextLine());
            String sql = "DELETE FROM medico WHERE id_medico = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                int rows = ps.executeUpdate();
                if (rows > 0) {
                    System.out.println("✅ Médico eliminado correctamente.");
                } else {
                    System.out.println("❌ No existe médico con ese id.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("❌ El id debe ser un número entero válido.");
        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar médico. Puede tener ingresos asociados.");
            // e.printStackTrace();
        }
    }

    public static void listarMedicos(Connection conn) {
        String sql = "SELECT id_medico, nombre, apellidos FROM medico";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n📋 Lista actual de médicos:");
            while (rs.next()) {
                System.out.printf("  ID: %d - %s %s\n",
                        rs.getInt("id_medico"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"));
            }
            System.out.println();
        } catch (SQLException e) {
            System.out.println("❌ Error al listar médicos:");
            e.printStackTrace();
        }
    }
}
