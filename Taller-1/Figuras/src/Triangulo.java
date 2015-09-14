
public class Triangulo extends Figuras {

	private float alto;
	private float base;
	
	public Triangulo(){
		super();
		this.nombre = "Triangulo";
		this.alto = 1;
		this.base = 1;
	}
	
	public Triangulo(String nombre, float alto, float base) {
		super();
		this.nombre = nombre;
		this.alto = alto;
		this.base = base;
	}	
	
	public double getAlto() {
		return alto;
	}
	
	public void setAlto(float alto) {
		if(alto>0 && alto <21){
			this.alto = alto;			
		}else{
			this.base = 0;
		}
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(float base) {
		if(base>0 && base<21){
			this.base = base;
		}else{
			this.base = 0;
		}
	}
	
	public double areaTriangulo(){
		return (this.base*this.alto)/2;
	}
	
	public double perimetroTriangulo(){
		return this.base+2*Math.sqrt(((this.base/2)*(this.base/2)+(this.alto/2)*(this.alto/2)));
	}	

	@Override
	public String toString() {
		return "Triangulo [nombre="+ nombre + ", alto=" + alto + ", base=" + base + ", área=" + areaTriangulo() + ", perímetro=" + perimetroTriangulo() +"]";
	}	
	
	
	
}
