package s06poo;

public class Permamente extends Empleado {

    private float sueldoBase;
    private String afiliacion;

    public Permamente() {
    }

    public Permamente(float sueldoBase, String afiliacion, String dni, String apellidos, String nombres) {
        super(dni, apellidos, nombres);
        this.sueldoBase = sueldoBase;
        this.afiliacion = afiliacion;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String mostrarInformacion() {
        return "EMPLEADO PERMANENTE: " + super.mostrarInformacion()
                + "\nSueldo base: " + sueldoBase
                + "\nAfiliacion: " + afiliacion;
    }

    public float movilidad() {
        if (ingresos() < 1000) {
            return 50;
        } else {
            return 40;
        }
    }

    @Override
    public float ingresos() {
        return sueldoBase;
    }

    @Override
    public float bonificaciones() {
        return 0;
    }

    @Override
    public float descuentos() {
        if (afiliacion.equalsIgnoreCase("AFP")) {
            return ingresos() * 0.15f;
        } else {
            return ingresos() * 0.11f;
        }
    }
}
