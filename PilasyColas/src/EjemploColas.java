import java.util.Scanner;
	import java.util.LinkedList;
	import java.util.Queue;
public class EjemploColas {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Queue<String> cola = new LinkedList<>();
	        
	       
	        
	        int opcion;
	        do {
	          
	            System.out.println("1. Agregar elemento a la cola (Encolar)");
	            System.out.println("2. Eliminar elemento de la cola (Desencolar)");
	            System.out.println("3. Ver el frente de la cola");
	            System.out.println("4. Mostrar todos los elementos");
	            System.out.println("5. Verificar si la cola está vacía");
	            System.out.println("6. Mostrar cantidad de elementos en la cola");
				System.out.println("7. Salir");
	            System.out.print("Seleccione una opción: ");
	            
	            opcion = scanner.nextInt();
	            scanner.nextLine(); 
	            
	            switch(opcion) {
	                case 1:
	                    System.out.print("Ingrese el elemento que desea agregar: ");
	                    String elemento = scanner.nextLine();
	                    cola.offer(elemento);
	                    System.out.println("Elemento '" + elemento + "' agregado a la cola.");
	                    break;
	                    
	                case 2:
	                    if(cola.isEmpty()) {
	                        System.out.println("La cola está vacía. No hay elementos para eliminar.");
	                    } else {
	                        String elementoEliminado = cola.poll();
	                        System.out.println("Elemento '" + elementoEliminado + "' eliminado de la cola.");
	                    }
	                    break;
	                    
	                case 3:
	                    if(cola.isEmpty()) {
	                        System.out.println("La cola está vacía.");
	                    } else {
	                        System.out.println("Elemento al frente: " + cola.peek());
	                    }
	                    break;
	                    
	                case 4:
	                    if(cola.isEmpty()) {
	                        System.out.println("La cola está vacía.");
	                    } else {
	                        System.out.println("Elementos en la cola: " + cola);
	                    }
	                    break;
	                    
	                case 5:
	                    System.out.println("¿La cola está vacía? " + cola.isEmpty());
	                    break;
	                    
	                case 6:
						System.out.println("Tamaño actual de la cola: " + cola.size());
						break;
	                    
	                case 7:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                    
	                default:
	                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
	            }
	        } while(opcion != 6);
	        
	        scanner.close();
	    }
	}


