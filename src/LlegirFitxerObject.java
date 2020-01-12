import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LlegirFitxerObject {
	public LlegirFitxerObject () {

	}

	public void Llegir () throws IOException, ClassNotFoundException {

		//Camp variable
		Cotxes cotxe;
		//Declaració del fitxer
		File fitxer = new File("D:/m6/cotxesObject.txt");
		//Crea el flux d'entrada
		FileInputStream filein = new FileInputStream(fitxer);
		//Connectar el flux de bytes al flux de dades
		ObjectInputStream dataInCotxe = new ObjectInputStream(filein);

		try {
			while (true){//Llegeix el fitxer
				//Llegeix el cotxe
				cotxe = (Cotxes) dataInCotxe.readObject();
				System.out.println("Marca: " +cotxe.getMarca()+ "  Model: "+ cotxe.getModel()+"  Any: " + cotxe.getAny() + "  Matricula: " + cotxe.getMatricula());
			}
		} catch (EOFException eo) {}
		dataInCotxe.close();//Tanca el stream d'entrada
	}

	public void LlegirSegonsCamp (int camp) throws IOException, ClassNotFoundException {

		//Camp variable
				Cotxes cotxe;
				//Declaració del fitxer
				File fitxer = new File("D:/m6/cotxesObject.txt");
				//Crea el flux d'entrada
				FileInputStream filein = new FileInputStream(fitxer);
				//Connectar el flux de bytes al flux de dades
				ObjectInputStream dataInCotxe = new ObjectInputStream(filein);

				try {
					while (true){//Llegeix el fitxer
						//Llegeix el cotxe
						cotxe = (Cotxes) dataInCotxe.readObject();
						if (camp == 1) {
							System.out.println("Marca: " +cotxe.getMarca());
						} else if (camp == 2) {
							System.out.println("Model: "+ cotxe.getModel());
						} else if (camp == 3) {
							System.out.println("Any: " + cotxe.getAny());
						} else {
							System.out.println("Matricula: " + cotxe.getMatricula());
						}
					}
				} catch (EOFException eo) {}
				dataInCotxe.close();//Tanca el stream d'entrada

	}
}