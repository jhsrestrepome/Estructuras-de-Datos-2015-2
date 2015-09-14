
public class Triangulo extends Figuras {

	private double alto=1;
	private double base=1;
	public Triangulo(String nombre) {
		super(nombre);
		super.setNombre("Triangulo");
	}	
	
	public double getAlto() {
		return alto;
	}
	
	public void setAlto(double alto) {
		if(alto>0 && alto <21){
			this.alto = alto;			
		}else{
			this.base = 0;
		}
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
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
		return "Triangulo [alto=" + alto + ", base=" + base + "]";
	}	
}
