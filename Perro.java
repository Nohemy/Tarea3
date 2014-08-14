
public class Perro  extends Animal {
	
	//Declaracion de la variable ladrar
	String ladrar;
	
	//devolvemos ladrar
	String ladrar()
{
		return ladrar;
}
	//pedimos el nombre y la edad del perro al usuario como herencia desde Animal
Perro(String nombre, int edad) 
{
	super(nombre, edad);
}
}
