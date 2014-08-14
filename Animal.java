
public class Animal {
	//declaracion de variables del animal
	String nombre;
	int edad;
		
		Animal(String nombre, int edad)
		{
			this.nombre = nombre;
			this.edad =  edad;
		}
		//obtenemos el nombre del animal
	String getNombre()
		{
			return nombre;
		}
	
	//obtenemos la edad del animal
	int getEdad()
	{
		return edad;
	}
	//devolvemos el  nombre del animal
	void setNombre(String nombre)
	{
	
		this.nombre = nombre;
	}
	
//devolvemos la edad del animal
	void setEdad(int edad)
	{
		
		this.edad = edad;
	}
}
