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
        if(in == "si" ){
          System.out.println("Los dias festivos son: ");
          System.out.println("Dia 1-Año Nuevo");
          System.out.println("Dia 6-Epifanía del señor");
        }else{
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("febrero"):
        veinte febrero = new veinte();
        febrero.ocho();
        String day = scanner.nextLine();
        String dis = day.toLowerCase();
        if(dis == "si" ){
          System.out.println("Los dias festivos son: ");
          System.out.println("No hay dias festivos");
        }else{
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("marzo"):
        System.out.println("Must masturbate March");
        System.out.println("-Banjo");
        trientauno marzo = new trientauno();
        marzo.one();
        String sida = scanner.nextLine();
        String pito = sida.toLowerCase();
        if(pito == "si" ){
          System.out.println("Los dias festivos son: ");
          System.out.println("Dia 14- Jueves Santo");
          System.out.println("Dia 15- Viernes Santo");
        }else{
          System.out.println("No vera los dias festivos");
        }
        break;

      case ("abril"):
        tri abril = new tri();
        abril.treinta();
        String sexo = scanner.nextLine();
        String pene = sexo.toLowerCase();
        if(pene == "si" ){
          System.out.println("Los dias festivos son: ");
          System.out.println("Dia 1-Año Nuevo");
          System.out.println("Dia 6-Epifanía del señor");
        }else{
          System.out.println("No vera los dias festivos");
        }
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
