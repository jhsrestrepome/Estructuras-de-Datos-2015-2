
public class Figuras {

	protected String nombre;

	public Figuras(){
		super();
		this.nombre = "figura";
	}
	
	public Figuras(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Figuras [nombre=" + nombre + "]";
	}
	

	
	
}
