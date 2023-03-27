import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Programa de calendario");
    System.out.println("Pon el mes que quieres ver: ");
    String input = scanner.nextLine();
    String get = input.toLowerCase();

    switch (get) {
      case ("enero"):
        trientauno enero = new trientauno();
        enero.one();
        System.out.println("Quieres ver los dias festivos?");
        String dias = scanner.nextLine();
        String in = dias.toLowerCase();
        if (in == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("Dia 1-Año Nuevo");
          System.out.println("Dia 6-Epifanía del señor");
        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("febrero"):
        veinte febrero = new veinte();
        febrero.ocho();
        System.out.println("Quieres ver los dias festivos?: ");
        String day = scanner.nextLine();
        String dis = day.toLowerCase();
        if (dis == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("No hay dias festivos");
        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("marzo"):
        System.out.println("Must masturbate March");
        System.out.println("-Banjo");
        trientauno marzo = new trientauno();
        marzo.one();
        System.out.println("Quieres ver los dias festivos?: ");
        String sida = scanner.nextLine();
        String pito = sida.toLowerCase();
        if (pito == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("No hay dias festivos");

        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("abril"):
        tri abril = new tri();
        abril.treinta();
        System.out.println("Quieres ver los dias festivos?: ");
        String sexo = scanner.nextLine();
        String pene = sexo.toLowerCase();
        if (pene == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("Dia 15-Viernes santo");
          System.out.println("Dia 18-Lunes de pascua");
        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("mayo"):
        trientauno mayo = new trientauno();
        mayo.one();
        System.out.println("Quieres ver los dias festivos?: ");
        String dick = scanner.nextLine();
        String pussy = dick.toLowerCase();
        if (pussy == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("Dia 1-Fiesta del trabajo");

        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("junio"):
        tri junio = new tri();
        junio.treinta();
        System.out.println("Quieres ver los dias festivos?: ");
        String tetas = scanner.nextLine();
        String culo = tetas.toLowerCase();
        if (culo == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("No hay =(");
        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("julio"):
        trientauno julio = new trientauno();
        julio.one();
        System.out.println("Quieres ver los dias festivos?: ");
        String caca = scanner.nextLine();
        String cremosa = caca.toLowerCase();
        if (cremosa == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("No hay =(");
        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("agosto"):
        trientauno agosto = new trientauno();
        agosto.one();
        System.out.println("Quieres ver los dias festivos?: ");
        String papel = scanner.nextLine();
        String bano = papel.toLowerCase();
        if (bano == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("Dia 15-Assunción de la virgen");
        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("septiembre"):
        tri septiembre = new tri();
        septiembre.treinta();
        System.out.println("Quieres ver los dias festivos?: ");
        String mierda = scanner.nextLine();
        String nuts = mierda.toLowerCase();
        if (nuts == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("No hay");
        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("octubre"):
        trientauno octubre = new trientauno();
        octubre.one();
        System.out.println("Quieres ver los dias festivos?: ");
        String conete = scanner.nextLine();
        String pitote = conete.toLowerCase();
        if (pitote == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("Dia 12-Fiesta Nacional");

        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("noviembre"):
        tri noviembre = new tri();
        noviembre.treinta();
        System.out.println("Quieres ver los dias festivos?: ");
        String nigga = scanner.nextLine();
        String glock = nigga.toLowerCase();
        if (glock == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("Dia 1-Todos los santos");

        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("diciembre"):
        tri diciembre = new tri();
        diciembre.treinta();
        System.out.println("Quieres ver los dias festivos?: ");
        String negros = scanner.nextLine();
        String demierda = negros.toLowerCase();
        if (demierda == "si") {
          System.out.println("Los dias festivos son: ");
          System.out.println("Dia 6-Dia de la constitucion");
          System.out.println("Dia 8-Inmaculada concepción");
          System.out.println("Dia 25-Día de Navidad");

        } else {
          System.out.println("No vera los dias festivos");
        }
        break;

      default:
        System.out.println("Input equivocado");
        System.out.println("Los meses son:");
        System.out.println("-enero");
        System.out.println("-febrero");
        System.out.println("-marzo");
        System.out.println("-abril");
        System.out.println("-mayo");
        System.out.println("-junio");
        System.out.println("-julio");
        System.out.println("-agosto");
        System.out.println("-septiembre");
        System.out.println("-octubre");
        System.out.println("-noviembre");
        System.out.println("-diciembre");

        System.out.println("Vuelve a poner el input");
        break;
    }
  }
}
