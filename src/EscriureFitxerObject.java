import java.io.*;
import java.util.Scanner;

public class EscriureFitxerObject {

	public EscriureFitxerObject () {

	}

	public void escriureBloc () throws IOException {

		
		Cotxes cotxe;
		//Declaració del fitxer
		File fitxer = new File("D:/m6/cotxesObject.txt");
		//Crea el flux de sortida
		FileOutputStream fileout = new FileOutputStream(fitxer,true);
		//Connectar el flux de bytes al flux de dades
		ObjectOutputStream dataOuCotxe = new ObjectOutputStream(fileout);
		//Les dades per generar els objectes 

		String marca[] = {"BMW", "Mercedes", "Seat", "Citroen", "Honda", "Ford"};
		String model[] = {"X3" , "Clase A", "Ibiza", "C3", "Civic", "Focus"};
		int any[] = {2004, 2016, 1997, 2019, 2002, 1999};
		String matricula[] = {"1241 XHS", "2349 KCW", "0947 IPE", "8914 KAC", "4200 WED", "8714 BCT" };

		//Recorre els arrays
		for (int i=0; i<marca.length; i++){//Crea el cotxe
			cotxe = new Cotxes(marca[i], model[i], any[i], matricula[i]);
			dataOuCotxe.writeObject(cotxe);//L'escriu al fixer
		}
		dataOuCotxe.close();//Tanca el stream de sortida

	}

	public void escriureUn () throws IOException {

		//Declaració del fitxer
		File fitxer = new File("D:/m6/cotxesObject.txt");
		//Crea el flux de sortida
		FileOutputStream fileout = new FileOutputStream(fitxer,true);
		//Connectar el flux de bytes al flux de dades
		ObjectOutputStream dataOuCotxe = new ObjectOutputStream(fileout);

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introdueix la marca del cotxe:");
		String marca = teclado.nextLine();

		System.out.println("Introdueix el model del cotxe:");
		String model = teclado.nextLine();

		System.out.println("Introdueix el any del cotxe:");
		int any = Integer.valueOf(teclado.nextLine());

		System.out.println("Introdueix la matricula del vehicle:");
		String matricula = teclado.nextLine();

		Cotxes cotxe = new Cotxes(marca,model,any,matricula);
		dataOuCotxe.writeObject(cotxe);//L'escriu al fixer

		dataOuCotxe.close();//Tanca el stream de sortida

	}
}