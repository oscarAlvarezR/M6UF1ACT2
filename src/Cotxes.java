import java.io.Serializable;

public class Cotxes implements Serializable {
					//Implementa la interfície Serializable
	private String marca;
	private String model;
	private int any;
	private String matricula;
	
	//constructor amb paràmetres
	public Cotxes (String marca, String model, int any, String matricula){
		//per no confondre el paràmetre amb el camp de variable
		this.marca = marca;
		//per no confondre el paràmetre amb el camp de variable
		this.model = model;
		
		this.any = any;
		
		this.matricula = matricula;
	}
	public Cotxes (){//constructor per defecte
		this.marca = null;
	}
	//per donar el valor als camps de variable private
	public void setMarca(String marcaSet){marca = marcaSet;}
	public void setModel(String modelSet){model = modelSet;}
	public void setAny(int anySet){ any = anySet;}
	public void setMatricula(String matriculaSet){ matricula = matriculaSet;}
	//per consultar el valor dels camps de variable private
	public String getMarca(){return marca;}
	public String getModel(){return model;}
	public int getAny(){return any;}
	public String getMatricula(){return matricula;}
}
