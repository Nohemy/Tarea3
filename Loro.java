
public class Loro extends Animal {
	
String hablar;
	
//devolvemos la variable hablar
	String hablar()
	{
		return hablar;
	}
	
//pedimos el nombre y la edad del loro al usuario como herencia desde Animal
	Loro(String nombre, int edad) 
	{
		super(nombre, edad);
	}

}
