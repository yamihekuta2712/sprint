import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = ConexionDB.getConnection()) {
            System.out.println("✅ Conexión a la base de datos establecida.");

            try (Statement stmt = conn.createStatement()) {
                // Limpiar tablas para evitar duplicados (orden importante por FK)
                stmt.executeUpdate("DELETE FROM tratamiento");
                stmt.executeUpdate("DELETE FROM ingreso");
                stmt.executeUpdate("DELETE FROM medico");
                stmt.executeUpdate("DELETE FROM paciente");

                // Insertar datos paciente
                String insertPaciente = """
                    INSERT INTO paciente (id_paciente, nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono, fecha_nacimiento)
                    VALUES (1, 'Juan', 'Pérez', 'Calle Falsa 123', 'Sevilla', 'Sevilla', '41001', '123456789', '1990-01-01');
                    """;
                stmt.executeUpdate(insertPaciente);

                // Insertar datos medico
                String insertMedico = """
                    INSERT INTO medico (id_medico, nombre, apellidos, especialidad, correo)
                    VALUES (1, 'Ana', 'García', 'Cardiología', 'ana.garcia@hospital.com');
                    """;
                stmt.executeUpdate(insertMedico);

                // Insertar ingreso (sin columnas 'diagnostico' ni 'habitacion')
                String insertIngreso = """
                    INSERT INTO ingreso (id_ingreso, fecha_ingreso, motivo_ingreso, observaciones, id_paciente, id_medico)
                    VALUES (1, '2025-05-15', 'Hipertensión', 'Paciente estable', 1, 1);
                    """;
                stmt.executeUpdate(insertIngreso);

                // Insertar tratamiento
                String insertTratamiento = """
                    INSERT INTO tratamiento (id_tratamiento, id_ingreso, nombre_tratamiento, dosis, frecuencia, observaciones)
                    VALUES (1, 1, 'Medicación antihipertensiva', '10mg', 'Diaria', 'Tomar con comida');
                    """;
                stmt.executeUpdate(insertTratamiento);

                System.out.println("✅ Datos insertados correctamente.");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar o insertar datos:");
            e.printStackTrace();
        }
    }
}
