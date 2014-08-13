
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		return x + y;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		return x - y;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		return x * y;
	}
	
	//devuelve el residuo de x y y
	// aqui saque la informacion de como sacar el reciduo
	//https://mx.answers.yahoo.com/question/index?qid=20121107181832AAX979g
	static int residuo(int x, int y)
	{
		return x % y;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	//de esta pagina saque la formula que me ayudo a resolver el problema
	//http://latecladeescape.com/t/Algoritmo+para+saber+si+un+n%C3%BAmero+es+par+o+impar,+o+de+como+enrollarse+con+un+tema+de+lo+m%C3%A1s+tonto
	static boolean esPar(int x)
	{
		return  x % 2 == 0;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	//todos los demas problemas los hice guiandome de lo que aprendi de la pagina anterios dada
	static boolean esMultiploDe3(int x)
	{
		return x % 3 == 0;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
	 if (x > y) 
	
		return x;
	
	 
		 else 
			 return y;
		  		
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		return edad >= 18;
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		return x % 2 == 0 & y % 2 == 0 & z % 2 == 0;
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
{	
		if (x > y & x > z)
		{
			return x;
		}
		if (y > x & y > z)
		{
			return y;
	    }
		else
		{
			return z;
		}
}
	
	public static void main(String[] args)
	{
		  
	} 

}
