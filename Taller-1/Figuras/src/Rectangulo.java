
public class Rectangulo extends Figuras {

	private float alto;
	private float largo;
		
	public Rectangulo() {
		super();
		this.nombre = "Rectangulo";
		this.alto = 1;
		this.largo = 1;
	}
	
	public Rectangulo(String nombre, float alto, float largo) {
		super();
		this.nombre = nombre;
		this.alto = alto;
		this.largo = largo;
	}
	public double getAlto() {
		return alto;
	}
	
	public void setAlto(float alto) {
		if(alto>0 && alto<21){
			this.alto = alto;
		}else {
			this.alto=0;
		}		
	}
	
	public double getLargo() {
		return largo;
	}
	
	public void setLargo(float largo) {
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
		return "Rectangulo [nombre="+ nombre + ", alto=" + alto + ", largo=" + largo + ", área=" + areaRectangulo() + ", perímetro=" + perimetroRectangulo() +"]";
	}	
	
}
