package s06poo;

public abstract class Empleado {

    private String dni;
    private String apellidos;
    private String nombres;

    public Empleado() {
    }

    public Empleado(String dni, String apellidos, String nombres) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String mostrarInformacion() {
        return "Nombres: " + nombres
                + "\nApellidos: " + apellidos
                + "\nDni: " + dni
                + "\nSueldo Neto: " + sueldoNeto()
                + "\nBonificaiones: " + bonificaciones()
                + "\nIngresos: " + ingresos()
                + "\n Descuentos: " + descuentos();
    }

    public float sueldoNeto() {
        return ingresos()+bonificaciones()-descuentos();
    }

    public abstract float ingresos();

    public abstract float bonificaciones();

    public abstract float descuentos();

}
