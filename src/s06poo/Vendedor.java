package s06poo;

public class Vendedor extends Empleado {

    private float montoVendido;
    private float tasaComision;

    public Vendedor() {
    }

    public Vendedor(float montoVendido, float tasaComision, String dni, String apellidos, String nombres) {
        super(dni, apellidos, nombres);
        this.montoVendido = montoVendido;
        this.tasaComision = tasaComision;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String mostrarInformacion() {
        return "EMPLEADO VENDEDOR\n" + super.mostrarInformacion()
                + "\nMonto vemdido: " + montoVendido
                + "\nTasa comision: " + tasaComision;
    }

    @Override
    public float ingresos() {
        return montoVendido + tasaComision;
    }

    @Override
    public float bonificaciones() {
        if (montoVendido < 1000) {
            return 0;
        } else if (montoVendido < 5000) {
            return ingresos() * 0.05f;
        } else {
            return ingresos() * 0.10f;
        }
    }

    @Override
    public float descuentos() {
        if (ingresos() < 1000) {
            return ingresos() * 0.11f;
        } else {
            return ingresos() * 0.15f;
        }
    }
}
