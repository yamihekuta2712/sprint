/**
 * Clase principal para probar el sistema.
 */
public class Main {
    public static void main(String[] args) {
        // Crear algunos objetos
        Paciente paciente1 = new Paciente(1, "Juan", "Pérez", "Calle Falsa 123", "Sevilla", "Sevilla", "41001", "123456789", "1990-01-01");
        Medico medico1 = new Medico(1, "Carlos", "Gómez", "987654321", "Cardiología");
        Ingreso ingreso1 = new Ingreso(1, paciente1.getIdPaciente(), medico1.getIdMedico(), "101", "1", "2025-05-13");
        Tratamiento tratamiento1 = new Tratamiento(1, ingreso1.getIdIngreso(), "Antibiótico", "500mg", "Cada 8 horas", "Ninguna observación");

        // Mostrar información
        System.out.println("=== Paciente ===");
        System.out.println(paciente1);
        System.out.println("=== Médico ===");
        System.out.println(medico1);
        System.out.println("=== Ingreso ===");
        System.out.println(ingreso1);
        System.out.println("=== Tratamiento ===");
        System.out.println(tratamiento1);
    }
}



