public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 2000.0);
        Gerente gerente = new Gerente("Ana", 3000.0, 1000.0);
        Desarrollador desarrollador = new Desarrollador("Carlos", 2500.0, 5);
        System.out.println("Salario de " + empleado.getNombre() + ": $" + empleado.calcularSalario());
        System.out.println("Salario de " + gerente.getNombre() + ": $" + gerente.calcularSalario() + " (Bono: $" + gerente.getBono() + ")");
        System.out.println("Salario de " + desarrollador.getNombre() + ": $" + desarrollador.calcularSalario() + " (Horas Extras: " + desarrollador.getHorasExtras() + ")");
    }
}