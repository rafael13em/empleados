package empleados;

public class Empleados {

	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String tfno;
	
	public Empleados(int i, String n, String ap1, String ap2, String dir, String t)
	{
		this.id = i;
		this.nombre = n;
		this.apellido1 = ap1;
		this.apellido2 = ap2;
		this.direccion = dir;
		this.tfno = t;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTfno() {
		return tfno;
	}

	public void setTfno(String tfno) {
		this.tfno = tfno;
	}
	
	
}
