public class Main {
    public static void main(String[] args) {
        EmpleadoSalariado empleado1 = new EmpleadoSalariado("juan", "40123456", 101, 800000);
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("pedro", "40987654", 102, 5000, 120);
        System.out.println("empleado salario");
        empleado1.mostrarInformacion();
        System.out.println();
        System.out.println("empleado por hora");
        empleado2.mostrarInformacion();
    }
}
