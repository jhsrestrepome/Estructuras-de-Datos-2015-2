import java.util.*;

public class Main {

	public static void main(String[] args) {
		Rectangulo[] rectangulo= new Rectangulo[5];
		Circulo[] circulo = new Circulo[5];
		Triangulo[] triangulo = new Triangulo[5];
				
		rectangulo[1].setAlto(2);
		rectangulo[1].setLargo(2);
		rectangulo[2].setAlto(1);
		rectangulo[2].setLargo(2);
		rectangulo[3].setAlto(1);
		rectangulo[3].setLargo(2);
		rectangulo[4].setAlto(1);
		rectangulo[4].setLargo(2);
		
		circulo[1].setRadio(2);
		circulo[2].setRadio(-3);
		circulo[3].setRadio(4);
		circulo[4].setRadio(5);
		
		triangulo[1].setBase(2);
		triangulo[1].setAlto(2);
		triangulo[2].setBase(3);
		triangulo[2].setAlto(-3);
		triangulo[3].setBase(21);
		triangulo[3].setAlto(4);
		triangulo[4].setBase(5);
		triangulo[4].setAlto(5);
		
		ArrayList<Double> area = new ArrayList<Double>();
		
		area.add(rectangulo[0].areaRectangulo());
		area.add(rectangulo[1].areaRectangulo());
		area.add(rectangulo[2].areaRectangulo());
		area.add(rectangulo[3].areaRectangulo());
		area.add(rectangulo[4].areaRectangulo());
		
		ArrayList<Double> perimetro = new ArrayList<Double>();
		
		perimetro.add(rectangulo[0].perimetroRectangulo());
		perimetro.add(rectangulo[1].perimetroRectangulo());
		perimetro.add(rectangulo[2].perimetroRectangulo());
		perimetro.add(rectangulo[3].perimetroRectangulo());
		perimetro.add(rectangulo[4].perimetroRectangulo());
		
		//ArrayList<Double> areaCirculo = new ArrayList<Double>();
		
		area.add(circulo[0].areaCirculo());
		area.add(circulo[1].areaCirculo());
		area.add(circulo[2].areaCirculo());
		area.add(circulo[3].areaCirculo());
		area.add(circulo[4].areaCirculo());
		
		//ArrayList<Double> perimetroCirculo = new ArrayList<Double>();
		
		perimetro.add(circulo[0].perimetroCirculo());
		perimetro.add(circulo[1].perimetroCirculo());
		perimetro.add(circulo[2].perimetroCirculo());
		perimetro.add(circulo[3].perimetroCirculo());
		perimetro.add(circulo[4].perimetroCirculo());
		
		//ArrayList<Double> areaTriangulo = new ArrayList<Double>();
		
		area.add(triangulo[0].areaTriangulo());
		area.add(triangulo[1].areaTriangulo());
		area.add(triangulo[2].areaTriangulo());
		area.add(triangulo[3].areaTriangulo());
		area.add(triangulo[4].areaTriangulo());
		
		//ArrayList<Double> perimetroTriangulo = new ArrayList<Double>();
		
		perimetro.add(triangulo[0].perimetroTriangulo());
		perimetro.add(triangulo[1].perimetroTriangulo());
		perimetro.add(triangulo[2].perimetroTriangulo());
		perimetro.add(triangulo[3].perimetroTriangulo());
		perimetro.add(triangulo[4].perimetroTriangulo());
		
		for(int k=1; k<4; k++){
			for (int i = 0; i <= 4; i++) {
	            System.out.println(area.get(i*k));
			}
			System.out.println("////////");
		}
		
		
		
		
	}
}
