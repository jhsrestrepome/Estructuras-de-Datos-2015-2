import java.util.*;

public class Main {

	public static void main(String[] args) {

		Rectangulo rectangulo1 = new Rectangulo();
		Rectangulo rectangulo2 = new Rectangulo("Rect1", 2, 2);
		Rectangulo rectangulo3 = new Rectangulo("Rect2", 1, 2);
		Rectangulo rectangulo4 = new Rectangulo("Rect3", 3, 2);
		Rectangulo rectangulo5 = new Rectangulo("Rect4", 1, 3);

		Circulo circulo1 = new Circulo();
		Circulo circulo2 = new Circulo("Circ1", 2);
		Circulo circulo3 = new Circulo("Circ2", 3);
		Circulo circulo4 = new Circulo("Circ3", 4);
		Circulo circulo5 = new Circulo("Circ4", 5);

		Triangulo triangulo1 = new Triangulo();
		Triangulo triangulo2 = new Triangulo("Trian1", 2, 2);
		Triangulo triangulo3 = new Triangulo("Trian2", 3, 5);
		Triangulo triangulo4 = new Triangulo("Trian3", 7, 4);
		Triangulo triangulo5 = new Triangulo("Trian4", 5, 1);



		ArrayList<Figuras> figuras = new ArrayList<Figuras>();

		figuras.add(rectangulo1);
		figuras.add(rectangulo2);
		figuras.add(rectangulo3);
		figuras.add(rectangulo4);
		figuras.add(rectangulo5);

		figuras.add(circulo1);
		figuras.add(circulo2);
		figuras.add(circulo3);
		figuras.add(circulo4);
		figuras.add(circulo5);

		figuras.add(triangulo1);
		figuras.add(triangulo2);
		figuras.add(triangulo3);
		figuras.add(triangulo4);
		figuras.add(triangulo5);

		for(int k = 0; k < figuras.size(); k++){
			System.out.println(figuras.get(k));	
		}
		
	}
	




}
