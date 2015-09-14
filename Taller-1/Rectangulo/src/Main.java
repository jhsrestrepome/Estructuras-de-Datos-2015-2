//Programa que halla el area de un rectangulo llamando los atributos de sus clase,
//los valores por defecto de alto y largo es de 1 para ambos casos.
//El programa tiene como limitantes si el alto o el largo es menor a 1 o mayor a 20
//le asigan un valor de 0.

public class Main {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo();
		
		double area1 = rectangulo.areaRectangulo();
		double perimetro1 = rectangulo.perimetroRectangulo();
		
		System.out.println("El area es :" + area1);	//imprime el area de los valores por defecto.				
		System.out.println("El perimetro es :" + perimetro1); //imprime el perimetro del rectangulo
		rectangulo.setAlto(2);		//asigna un nuevo valor al alto del rectangulo
		rectangulo.setLargo(2);		//asigna un nuevo valor al largo del rectangulo
		
		double area2 = rectangulo.areaRectangulo();
		double perimetro2 = rectangulo.perimetroRectangulo();
		
		System.out.println("El area es :" +area2);
		System.out.println("El perimetro es :" + perimetro2);
		rectangulo.setAlto(-1);
		rectangulo.setLargo(2);
		
		double area3 = rectangulo.areaRectangulo();
		double perimetro3 = rectangulo.perimetroRectangulo();
		System.out.println("El area es :" +area3);
		System.out.println("El perimetro es :" + perimetro3);
		rectangulo.setAlto(21);
		rectangulo.setLargo(2);
		
		double area4 = rectangulo.areaRectangulo();
		double perimetro4 = rectangulo.perimetroRectangulo();
		
		System.out.println("El area es :" +area4);
		System.out.println("El perimetro es :" + perimetro4);
		rectangulo.setAlto(4);
		rectangulo.setLargo(4);
		
		double area5 = rectangulo.areaRectangulo();
		double perimetro5 = rectangulo.perimetroRectangulo();
		
		System.out.println("El area es :" +area5);
		System.out.println("El perimetro es :" + perimetro5);
		
		
	}

}
