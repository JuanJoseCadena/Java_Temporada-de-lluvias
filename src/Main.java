import java.util.Scanner;

public class Main {
	
	static int i = 1;
	static int x = 0;
	static int y = 0;
	static String arreglo[][] = new String[12][2];
	static String cadena = "";
	static Scanner entrada = new Scanner(System.in);
	
	public static void Datos() 
	{
		arreglo[0][0]="Enero";
		arreglo[1][0]="Febrero";
		arreglo[2][0]="Marzo";
		arreglo[3][0]="Abril";
		arreglo[4][0]="Mayo";
		arreglo[5][0]="Junio";
		arreglo[6][0]="Julio";
		arreglo[7][0]="Agosto";
		arreglo[8][0]="Septiembre";
		arreglo[9][0]="Octubre";
		arreglo[10][0]="Noviembre";
		arreglo[11][0]="Diciembre";
		
		System.out.println("Introduzca la cantidad de lluvia que se presentó en cada mes correspondiente:");
		
		while(i<=12) 
		{
			System.out.println(arreglo[x][0] + ":");
			cadena = entrada.nextLine();
			
			if(cadena.trim().matches("")) 
			{
				System.out.println("No se ha introducido ningún valor, por favor vuelva a intentarlo introduciendo solo números enteros");
				System.exit(0);
			}
			
			if(!cadena.matches("[0-9].*")) 
			{
				System.out.println("Se ha introducido un valor no válido, por favor vuelva a intentarlo introduciendo solo números enteros");
				System.exit(0);
			}
			
			System.out.println("");
			arreglo[x][1]=cadena;
			i++;
			x++;
		}
	}
	
	public static void Imprimir() 
	{
		System.out.println("Cantidades de lluvia:");
		System.out.println(arreglo[0][0] + "   " + arreglo[0][1]);
		System.out.println(arreglo[1][0] + "   " + arreglo[1][1]);
		System.out.println(arreglo[2][0] + "   " + arreglo[2][1]);
		System.out.println(arreglo[3][0] + "   " + arreglo[3][1]);
		System.out.println(arreglo[4][0] + "   " + arreglo[4][1]);
		System.out.println(arreglo[5][0] + "   " + arreglo[5][1]);
		System.out.println(arreglo[6][0] + "   " + arreglo[6][1]);
		System.out.println(arreglo[7][0] + "   " + arreglo[7][1]);
		System.out.println(arreglo[8][0] + "   " + arreglo[8][1]);
		System.out.println(arreglo[9][0] + "   " + arreglo[9][1]);
		System.out.println(arreglo[10][0] + "   " + arreglo[10][1]);
		System.out.println(arreglo[11][0] + "   " + arreglo[11][1]);
	}
	
	public static void EncontrarMayor() 
	{
		System.out.println("Mes con mayor cantidad de lluvia:");
		i=1;
		x=0;
		
		while(i<=12) 
		{
			if(Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[0][1]) && Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[1][1])
					&& Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[2][1]) && Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[3][1])
					&& Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[4][1]) && Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[5][1])
					&& Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[6][1]) && Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[7][1])
					&& Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[8][1]) && Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[9][1])
					&& Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[10][1]) && Integer.parseInt(arreglo[x][1])>=Integer.parseInt(arreglo[11][1])) 
			{
				y=x;
				System.out.println(arreglo[y][0] + "   " + arreglo[y][1]);
			}
			
			x++;
			i++;
		}
	}
	
	public static void EncontrarMenor() 
	{
		System.out.println("Mes con menor cantidad de lluvia:");
		i=1;
		x=0;
		
		while(i<=12) 
		{
			if(Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[0][1]) && Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[1][1])
					&& Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[2][1]) && Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[3][1])
					&& Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[4][1]) && Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[5][1])
					&& Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[6][1]) && Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[7][1])
					&& Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[8][1]) && Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[9][1])
					&& Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[10][1]) && Integer.parseInt(arreglo[x][1])<=Integer.parseInt(arreglo[11][1])) 
			{
				y=x;
				System.out.println(arreglo[y][0] + "   " + arreglo[y][1]);
			}
			
			x++;
			i++;
		}
		
	}

	public static void Promedio() 
	{
		float promedio = Integer.parseInt(arreglo[0][1]) + Integer.parseInt(arreglo[1][1]) + Integer.parseInt(arreglo[2][1])
				+ Integer.parseInt(arreglo[3][1]) + Integer.parseInt(arreglo[4][1]) + Integer.parseInt(arreglo[5][1])
						+ Integer.parseInt(arreglo[6][1]) + Integer.parseInt(arreglo[7][1]) + Integer.parseInt(arreglo[8][1])
								+ Integer.parseInt(arreglo[9][1]) + Integer.parseInt(arreglo[10][1]) + Integer.parseInt(arreglo[11][1]);
		
		promedio = promedio / arreglo.length;
		
		System.out.println("Promedio de lluvia en el año:");
		System.out.println(promedio);
	}
	
	public static void main(String[] args) {
		
		Datos();
		System.out.println("");
		Imprimir();
		System.out.println("");
		EncontrarMayor();
		System.out.println("");
		EncontrarMenor();
		System.out.println("");
		Promedio();
		
	}
}
