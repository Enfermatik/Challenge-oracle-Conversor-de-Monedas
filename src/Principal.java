
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
//Algo que vi de rapidez es que debes incluir un try catch en
// int opcion=Integer.valueOf(entradaDato.next());
// junto con la excepcion NumberFormatException,
// ya que si por error el usuario ingresar una letra  el codigo se detiene
        int opcion = 0;


        while (opcion != 7) {
            System.out.println("********************************************\n");
            System.out.println("Bienvenidos al coversor de monedas");
            System.out.println("1) Dolar ==> Peso Argentino");
            System.out.println("2) Peso Argentino ==> Dolar");
            System.out.println("3) Dolar ==> Real Brasileño");
            System.out.println("4) Real Brasileño ==> Dolar");
            System.out.println("5) Dolar ==> Peso Colombiano");
            System.out.println("6) Peso Colombiano ==> Peso Dolar");
            System.out.println("7) Salir");
            System.out.println(" Elija una opción válida \n");
            System.out.println("********************************************");
//try {
//        option = Integer.parseInt(userInput());
//      } catch (NumberFormatException e) {
//        System.out.println("Introduce sólo numeros");
//        option = -1;
//      } catch (Exception e) {
//        System.out.println("Error desconocido" + e);
//      }

            try {
                opcion = lectura.nextInt();
                lectura.nextLine();

                switch (opcion) {
                    case 1:
                        ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                        break;
                    case 2:
                        ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                        break;
                    case 3:
                        ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                        break;
                    case 4:
                        ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                        break;
                    case 5:
                        ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                        break;
                    case 6:
                        ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                        break;
                    case 7:
                        System.out.println("Saliendo...");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Introduce sólo números por favor");
                opcion = -1;
            } catch (Exception e) {
                System.out.println("Opción no válida");
                break;


            }
        }
    }
}



