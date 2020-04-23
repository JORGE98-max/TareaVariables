import java.util.Scanner;
public class datos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese su nombre:");
		String nombre = scan.nextLine();
		System.out.println("Ingrese su primer apellido:");
		String ape1 = scan.next();
		System.out.println("Ingrese su segundo apellido:");
		String ape2 = scan.next();
		System.out.println("Ingrese su edad: ");
        int edad = scan.nextInt();
		System.out.println("Usted es el usuario : \n" + nombre+" " + ape1+" " + ape2+" con "+edad+ " años de edad ");
        
	}

}
