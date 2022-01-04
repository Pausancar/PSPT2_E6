package es.studium.Ejercicio6;

public class OpBasicas extends Thread
{
	int x, y;
	OpBasicas(String nombreHilo, int numero1, int numero2)
	{
		super(nombreHilo);
		x = numero1;
		y = numero2;
	}
	public void run()
	{
		System.out.println(x + "+" + y + "=" + (x+y) + "del hilo"+ getName());
		System.out.println(x + "-" + y + "=" + (x-y) + "del hilo"+ getName());
		System.out.println(x + "x" + y + "=" + (x*y) + "del hilo"+ getName());
		System.out.println(x + "/" + y + "=" + (x/y) + "del hilo"+ getName());
	}
}
