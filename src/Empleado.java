
class Empleado {
    private String nombre;
    private double salarioBase;
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }
    public double getBono() {
        return bono;
    }
}
class Desarrollador extends Empleado {
    private int horasExtras;

    public Desarrollador(String nombre, double salarioBase, int horasExtras) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
    }
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horasExtras * 10);
    }
    public int getHorasExtras() {
        return horasExtras;
    }
}