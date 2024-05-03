package s06poo;

import java.util.Scanner;

public class S06poo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar apelldios: ");
        String apellidos = sc.next();
        System.out.println("Ingresar nombres: ");
        String nombres = sc.next();
        System.out.println("Ingresar dni: ");
        String dni = sc.next();
        System.out.println("Ingresar monto vendido: ");
        float montoVendido = sc.nextFloat();
        System.out.println("Ingresar tasa comision: ");
        float tasaComision = sc.nextFloat();
        Vendedor ov = new Vendedor(montoVendido, tasaComision, dni, apellidos, nombres);
        System.out.println(ov.mostrarInformacion());
    }
    
}
