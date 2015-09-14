

public class Circulo extends Figuras{

	
	private float radio;	
	
	public Circulo(){
		super();
		this.nombre = "Circulo";
		this.radio = 1;
	}

	public Circulo(String nombre, float radio) {
		super();
		this.nombre = nombre;
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		if(radio>0 && radio<21){
			this.radio = radio;
		}else{
			this.radio = 0;
		}		
	}
	
	public double areaCirculo(){
		return Math.PI*this.radio*this.radio;
	}
	
	public double perimetroCirculo(){
		return Math.PI*this.radio;
	}
	

	@Override
	public String toString() {
		return "Circulo [nombre="+ nombre + ", radio=" + radio + ", área=" + areaCirculo() + ", perímetro=" + perimetroCirculo() +"]";
	}	
	
}
