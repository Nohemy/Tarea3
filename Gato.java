
public class Gato extends Animal {
	
String maullar;
	
//devolvemos maullar como String
	String maullar()
	{
	return maullar;
	}
	
//Obtenemos el nombre y la edad del gato ingresadas por el usuario 
	//como herencia de la clase Animal
	Gato(String nombre, int edad) 
	{
		super(nombre, edad);
	}

}
