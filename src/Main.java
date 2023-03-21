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
        break;

      case ("febrero"):
        veinte febrero = new veinte();
        febrero.ocho();
        break;

      case ("marzo"):
        System.out.println("Must masturbate March");
        System.out.println("-Banjo");
        trientauno marzo = new trientauno();
        marzo.one();
        break;

      case ("abril"):
        tri abril = new tri();
        abril.treinta();
        break;

      case ("mayo"):
        trientauno mayo = new trientauno();
        mayo.one();
        break;

      case ("junio"):
        tri junio = new tri();
        junio.treinta();
        break;

      case ("julio"):
        trientauno julio = new trientauno();
        julio.one();
        break;

      case ("agosto"):
        trientauno agosto = new trientauno();
        agosto.one();
        break;

      case ("septiembre"):
        tri septiembre = new tri();
        septiembre.treinta();
        break;

      case ("octubre"):
        trientauno octubre = new trientauno();
        octubre.one();
        break;

      case ("noviembre"):
        tri noviembre = new tri();
        noviembre.treinta();
        break;

      case ("diciembre"):
        tri diciembre = new tri();
        diciembre.treinta();
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
    System.out.println("Adios!");
  }
}
