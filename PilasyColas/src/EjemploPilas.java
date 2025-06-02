import java.util.Scanner;
	import java.util.Stack;
public class EjemploPilas {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Stack<String> pila = new Stack<>();
	        
	       
	        
	        int opcion;
	        do {
	            
	            System.out.println("1. Agregar elemento a la pila");
	            System.out.println("2. Eliminar elemento de la pila");
	            System.out.println("3. Ver el tope de la pila");
	            System.out.println("4. Mostrar todos los elementos");
	            System.out.println("5. Verificar si la pila está vacía");
	            System.out.println("6. Salir");
	            System.out.print("Seleccione una opción: ");
	            
	            opcion = scanner.nextInt();
	            scanner.nextLine(); 
	            
	            switch(opcion) {
	                case 1:
	                    System.out.print("Ingrese el elemento que desea agregar: ");
	                    String elemento = scanner.nextLine();
	                    pila.push(elemento);
	                    System.out.println("Elemento '" + elemento + "' agregado a la pila.");
	                    break;
	                    
	                case 2:
	                    if(pila.isEmpty()) {
	                        System.out.println("La pila está vacía. No hay elementos para eliminar.");
	                    } else {
	                        String elementoEliminado = pila.pop();
	                        System.out.println("Elemento '" + elementoEliminado + "' eliminado de la pila.");
	                    }
	                    break;
	                    
	                case 3:
	                    if(pila.isEmpty()) {
	                        System.out.println("La pila está vacía.");
	                    } else {
	                        System.out.println("Elemento en el tope: " + pila.peek());
	                    }
	                    break;
	                    
	                case 4:
	                    if(pila.isEmpty()) {
	                        System.out.println("La pila está vacía.");
	                    } else {
	                        System.out.println("Elementos en la pila: " + pila);
	                    }
	                    break;
	                    
	                case 5:
	                    System.out.println("¿La pila está vacía? " + pila.isEmpty());
	                    break;
	                    
	                case 6:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                    
	                default:
	                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
	            }
	        } while(opcion != 6);
	        
	        scanner.close();
	    }
	}

	


