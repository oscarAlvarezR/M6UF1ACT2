import java.io.IOException;
import java.util.Scanner;


public class UF1ACT2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Scanner teclado = new Scanner(System.in);
		
		EscriureFitxerObject escriure = new EscriureFitxerObject();
		LlegirFitxerObject llegir = new LlegirFitxerObject();
		
		
		
		System.out.println("1 : Guadar i recuperar lista de cotxes");
		System.out.println("2 : Guardar cotxes de un en un");
		System.out.println("3 : Recuperar cotxes segons un camp");
		int seleccio = Integer.valueOf(teclado.nextLine());
		
		while (seleccio < 1 || seleccio > 3) {
			
			System.out.println("Error numero no valid");
			System.out.println("1 : Guadar i recuperar lista de cotxes");
			System.out.println("2 : Guardar cotxes de un en un");
			System.out.println("3 : Recuperar cotxes segons un camp");
		}
		
		if (seleccio == 1) {
			
			escriure.escriureBloc();
			llegir.Llegir();
			
		} else if (seleccio == 2) {
			
			escriure.escriureUn();
			
		} else {
			
			System.out.println("Introdueix el camp segons el cual vols buscar:");
			System.out.println("1 = marca | 2 = model | 3 = any | 4 = matricula");
			int camp = Integer.valueOf(teclado.nextLine());
			
			llegir.LlegirSegonsCamp(camp);
		}
		
	}
}
