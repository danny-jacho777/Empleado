import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        // Datos del Empleado 1
        String nombre1 = JOptionPane.showInputDialog("Ingrese el primer nombre del Empleado 1:");
        String apellido1 = JOptionPane.showInputDialog("Ingrese el apellido paterno del Empleado 1:");
        double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual del Empleado 1:"));

        // Datos del Empleado 2
        String nombre2 = JOptionPane.showInputDialog("Ingrese el primer nombre del Empleado 2:");
        String apellido2 = JOptionPane.showInputDialog("Ingrese el apellido paterno del Empleado 2:");
        double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual del Empleado 2:"));

        Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);
        Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

        // Mostrar salarios anuales iniciales
        String salida = String.format("=== SALARIOS ANUALES INICIALES ===\n" +
                        "%s %s: $%.2f\n" +
                        "%s %s: $%.2f\n\n",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), (empleado1.getSalarioMensual() * 12),
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), (empleado2.getSalarioMensual() * 12));

        // Aplicar 10% de aumento
        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.10);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.10);

        // Mostrar salarios anuales con aumento
        salida += String.format("=== SALARIOS ANUALES CON 10%% DE AUMENTO ===\n" +
                        "%s %s: $%.2f\n" +
                        "%s %s: $%.2f",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), (empleado1.getSalarioMensual() * 12),
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), (empleado2.getSalarioMensual() * 12));

        JOptionPane.showMessageDialog(null, salida, "Resultados Empleados", JOptionPane.INFORMATION_MESSAGE);
    }
}