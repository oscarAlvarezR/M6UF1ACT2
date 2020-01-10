import java.io.*;

public class EscriureFitxerObject {
	public static void main(String[] args) throws IOException {
		//Camp variable tipus Comarca
		Cotxes cotxe;
		//Declaració del fitxer
		File fitxer = new File("/home/user/Escriptori/cotxesObject.txt");
		//Crea el flux de sortida
		FileOutputStream fileout = new FileOutputStream(fitxer);
		//Connectar el flux de bytes al flux de dades
		ObjectOutputStream dataOuCotxe = new ObjectOutputStream(fileout);
		//Les dades per generar els objectes Comarca
		String marca[] = {"BMW", "Mercedes", "Seat", "Citroen", "Honda", "Ford"};
		String model[] = {"X3" , "Clase A", "Ibiza", "C3", "Civic", "Focus"};
		int any[] = {2004, 2016, 1997, 2019, 2002, 1999};
		String matricula[] = {"1241 XHS", "2349 KCW", "0947 IPE", "8914 KAC", "4200 WED", "8714 BCT" };
		//Recorre els arrays
		for (int i=0; i<marca.length; i++){//Crea la comarca
			cotxe = new Cotxes(marca[i], model[i], any[i], matricula[i]);
			dataOuCotxe.writeObject(cotxe);//L'escriu al fixer
		}
		dataOuCotxe.close();//Tanca el stream de sortida
	}
}