import java.util.Scanner;
public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para hoy\n1 "+monedaBase+ " = "+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingrese el valor que deseas convertir "+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println("El valor "+cantidad+" "+monedaBase+" corresponde al valor final de =>> "+cantidadConvertida+" "+monedas.target_code());
    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el código de moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
