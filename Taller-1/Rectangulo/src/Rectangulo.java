
public class Rectangulo {

	private int alto = 1;
	private int largo = 1;
	
	
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		if(alto>1 && alto<20){
			this.alto = alto;
		}else {
			this.alto=0;
		}		
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		if(largo>1 && largo <20){
			this.largo = largo;
		}else {
			this.largo = 0;
		}
	}
	
	public int areaRectangulo (){
		return this.alto*this.largo;		
	}
	
	public int perimetroRectangulo(){
		if(this.alto==0 || this.largo==0 ){
			return 0;
		}else {
			return (2*this.alto)+(2*this.largo);			
		}
	}
	
	
}
