package empleados;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados emp1 = new Empleados(2144331512, "Elon", "Musk", "Tesla", "Los Angeles", "1452452432");
		Empleados emp2 = new Empleados(231241241, "Felipe", "Circunferencia", "Completa", "Guadalajara", "3412431421");
	
		System.out.println("Empleado 1");
		System.out.println("ID: "+emp1.getId());
		System.out.println("Nombre: "+emp1.getNombre());
		System.out.println("Apellidos: "+emp1.getApellido1() +emp1.getApellido2());
		System.out.println("Direccion: "+emp1.getDireccion());
		System.out.println("Telefono: "+emp1.getTfno());
		System.out.println("Empleado 1");
		System.out.println("ID: "+emp2.getId());
		System.out.println("Nombre: "+emp2.getNombre());
		System.out.println("Apellidos: "+emp2.getApellido1() +emp2.getApellido2());
		System.out.println("Direccion: "+emp2.getDireccion());
		System.out.println("Telefono: "+emp2.getTfno());
	}
}
