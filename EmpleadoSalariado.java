public class EmpleadoSalariado extends Empleado {
    private double sueldoMensual;
    public EmpleadoSalariado(String nombre, String dni, int legajo, double sueldoMensual) {
        super(nombre, dni, legajo);
        this.sueldoMensual = sueldoMensual;
    }
    @Override
    public double calcularSalario() {
        return sueldoMensual;
    }
}

