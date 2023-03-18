import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de calendario");
        System.out.println("Pon el mes que quieres ver: ");
        String month = scanner.nextLine();

        switch(month){
            case("enero"):
                enero enero = new enero();
                enero.en();
            break;

            case("febrero"):
                febrero febrero = new febrero();
                febrero.febre();
            break;

            case("marzo"):
                marzo marzo = new marzo();
                marzo.marz();
            break;

            case("abril"):
                abril abril = new abril();
                abril.abri();
            break;

            case("mayo"):
                mayo mayo = new mayo();
                mayo.mai();
            break;

            case("junio"):
                junio junio = new junio();
                junio.june();
            break;

            case("julio"):
               julio julio = new julio();
               julio.julia();
            break;

            case("agosto"):
                agosto agosto = new agosto();
                agosto.august();
            break;

            case("septiembre"):
                septiembre septiembre = new septiembre();
                septiembre.septembre();
            break;

            case("octubre"):
                octubre octubre = new octubre();
                octubre.october();
            break;

            case("noviembre"):
                noviembre noviembre = new noviembre();
                noviembre.november();
            break;

            case("diciembre"):
                diciembre diciembre = new diciembre();
                diciembre.december();
            break;

            default:
                System.out.println("Input equivocado");
            break;
        }
        System.out.println("Adios!");
    }
}
