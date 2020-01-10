import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LlegirFitxerObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Camp variable tipus Comarca
		Cotxes cotxe;
		//Declaració del fitxer
		File fitxer = new File("/home/user/Escriptori/cotxesObject.txt");
		//Crea el flux d'entrada
		FileInputStream filein = new FileInputStream(fitxer);
		//Connectar el flux de bytes al flux de dades
		ObjectInputStream dataInCotxe = new ObjectInputStream(filein);

		try {
			while (true){//Llegeix el fitxer
				//Llegeix la comarca
				cotxe = (Cotxes) dataInCotxe.readObject();
				System.out.println("Marca: " +cotxe.getMarca()+ "  Model: "+ cotxe.getModel()+"  Any: " + cotxe.getAny() + "  Matricula: " + cotxe.getMatricula());
			}
		} catch (EOFException eo) {}
		dataInCotxe.close();//Tanca el stream d'entrada
	}
}