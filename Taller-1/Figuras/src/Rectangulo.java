
public class Rectangulo extends Figuras {

	private double alto = 1;
	private double largo = 1;
		
		
	public Rectangulo(String nombre) {
		super(nombre);
		super.setNombre("Rectangulo");
	}

	public double getAlto() {
		return alto;
	}
	
	public void setAlto(double alto) {
		if(alto>0 && alto<21){
			this.alto = alto;
		}else {
			this.alto=0;
		}		
	}
	
	public double getLargo() {
		return largo;
	}
	
	public void setLargo(double largo) {
		if(largo>0 && largo <21){
			this.largo = largo;
		}else {
			this.largo = 0;
		}
	}
	
	public double areaRectangulo (){
		return this.alto*this.largo;		
	}
	
	public double perimetroRectangulo(){
		if(this.alto==0 || this.largo==0 ){
			return 0;
		}else {
			return (2*this.alto)+(2*this.largo);			
		}
	}
	
	@Override
	public String toString() {
		return "Rectangulo [alto=" + alto + ", largo=" + largo + "]";
	}	
	
}
