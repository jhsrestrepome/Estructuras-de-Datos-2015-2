

public class Circulo extends Figuras{

	private double radio = 1;	

	public Circulo(String nombre) {
		super(nombre);
		super.setNombre("Circulo");
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
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
		return "Circulo [radio=" + radio + "]";
	}	
	
}
