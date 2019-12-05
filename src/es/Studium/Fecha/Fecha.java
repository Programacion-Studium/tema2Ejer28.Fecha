package es.Studium.Fecha;

import java.util.Scanner;

public class Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el dia");
		int dia = teclado.nextInt();
		System.out.println("Introduzca el mes");
		int mes = teclado.nextInt();
		System.out.println("Introduzca el año");
		int anyo = teclado.nextInt();
		teclado.close();
		if((dia<1)||(mes<1)||(anyo<1))
		{
			System.out.println("La fecha si es correcta");
		}
		else
		{
			switch (mes)
			{
			case 1:
				if(dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 3:
				if(dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 5:
				if(dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 7:
				if(dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 8:
				if(dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 10:
				if(dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 12:
				if(dia<=31)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 4:
				if(dia<=30)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 6:
				if(dia<=30)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 9:
				if(dia<=30)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 11:
				if(dia<=30)
				{
					System.out.println("La fecha si es correcta");
				}
				else
				{
					System.out.println("La fecha no es correcta");
				}
				break;
			case 2:
				if(dia>29)
				{
					System.out.println("La fecha no es correcta");
				}
				else
				{
					if(dia==29)
					{
						if((anyo%4==0) & (anyo%100==0) || (anyo%400==0))
						{
							System.out.println("La fecha si es correcta");
						}
						else
						{
							System.out.println("La fecha no es correcta");
						}
					}
					if(dia<29)
					{
						System.out.println("La fecha si es correcta");
					}
					System.out.println("La fecha no es correcta");
				}
				break;
			default:
				System.out.println("La fecha no es correcta");
			}
		}
	}

}
