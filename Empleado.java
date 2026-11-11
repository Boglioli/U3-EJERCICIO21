public class Empleado {
    protected String nombre;
    protected String dni;
    protected int legajo;
    public Empleado(String nombre, String dni, int legajo) {
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = legajo;
    }
    public double calcularSalario() {
        return 0;
    }
    public void mostrarInformacion() {
        System.out.println("nombre: " + nombre);
        System.out.println("dni: " + dni);
        System.out.println("legajo: " + legajo);
        System.out.println("sueldo: $ " + calcularSalario());
    }
}
