
package view;
import java.util.Scanner;
/**
 *
 * @author arqua
 */
public class VideoMediaView {
    
    private static Scanner scan = new Scanner(System.in);
    
    public static void updateVideoMedia() {
        
          String title;
          String author;
          String materialType; 
          String publishedYear;
          boolean availableArticle;
          String editorial;
          String hours;
          int id;
          int copies;
          
     do {     
          System.out.println("¿Desea actualizar el Titulo de la revista (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Título: ");
            title = scan.nextLine();
        }

        System.out.println("¿Desea actualizar el Autor? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Autor: ");
            author = scan.nextLine();
        }

        System.out.println("¿Desea actualizar el Tipo de material? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Tipo de material: ");
            materialType = scan.nextLine();
        }

        System.out.println("¿Desea actualizar el Año de publicación? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Año de publicación: ");
            publishedYear = scan.nextLine();
        }

        System.out.println("¿Desea actualizar la disponibilidad? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese si está disponible (true/false): ");
            availableArticle = scan.nextBoolean();
            scan.nextLine(); 
        }

        System.out.println("¿Desea actualizar la Editorial? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese la nueva Editorial: ");
            editorial = scan.nextLine();
        }

        System.out.println("¿Desea actualizar el Número de Horas? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo Número de Horas: ");
            hours = scan.nextLine();
            scan.nextLine(); 
        }
        
        System.out.println("¿Desea actualizar la cantidad de copias? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo ID: ");
            copies = scan.nextInt();
            scan.nextLine(); 
        }
        
        
        System.out.println("¿Desea actualizar el ID de la revista? (S/N): ");
        if (scan.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Ingrese el nuevo ID: ");
            id = scan.nextInt();
            scan.nextLine(); 
        }
        
      }  while (scan.nextLine().equalsIgnoreCase("S"));  

        
//        System.out.println("Actualización completada:");
//        System.out.println("Título: " + title);
//        System.out.println("Autor: " + author);
//        System.out.println("Tipo de material: " + materialType);
//        System.out.println("Año de publicación: " + publishedYear);
//        System.out.println("Disponible: " + availableArticle);
//        System.out.println("Editorial: " + editorial);
//        System.out.println("Número de Horas: " + hours);
//        System.out.println("Número de Copias: " + copies);
//        System.out.println("ID: " + id);

        scan.close();
          
    } 
    
    public static void insertVideoMedia() {
        
        
          
          String title;
          String author;
          String materialType; 
          String publishedYear;
         boolean availableArticle;
          String editorial;
          String hours;
          int    id;
          int    copies;
          
          
            System.out.println("Ingrese el Titulo del Video: ");
            title = scan.nextLine();
            
            System.out.println("Ingrese el Nombre del autor: ");
            author = scan.nextLine();
            
            System.out.println("Ingrese el Tipo de material: ");
            materialType = scan.nextLine();
            
            System.out.println("Ingrese el Año de publicacion: ");
            publishedYear = scan.nextLine();
            
            System.out.println("Ingrese si esta Disponible: S/N ");
            availableArticle = scan.nextBoolean();
            
            System.out.println("Ingrese la Casa editorial: ");
            editorial = scan.nextLine();
            
            System.out.println("Ingrese la cantidad de horas con minutos. HH:MM:  ");
            hours = scan.nextLine();
            
            System.out.println("Ingrese la cantidad de copias del video:  ");
            hours = scan.nextLine();
            
            System.out.println("Ingrese el ID para el Video: ");
            id = scan.nextInt();
        
    } 
    
    public static void removeVideoMedia() {
        
        System.out.println("Por favor, ingrese el ID del Video que desea borrar: ");
    int id = scan.nextInt();
    scan.nextLine();

    
    System.out.println("Ha ingresado el ID: " + id);
    System.out.println("¿Está seguro de que desea borrar este Video? (S/N): ");
    String confirmacion = scan.nextLine().toUpperCase();

    
    if (confirmacion.equalsIgnoreCase("S")) {
        System.out.println("El Video con ID " + id + " ha sido eliminado.");
        
    } else {
        System.out.println("Operación cancelada. El Video no ha sido borrado.");
    }
    
    
    }
    
    
    public static void listVideoMedia() {
        
        System.out.println("Por favor, ingrese el ID del  Video que desea listar: ");
        int id = scan.nextInt();
    scan.nextLine();

    
        System.out.println("Ha ingresado el ID: " + id);
        System.out.println("¿Está seguro de que desea listar este Video? (S/N): ");
        String confirmacion = scan.nextLine().toUpperCase();

     
        if (confirmacion.equalsIgnoreCase("S")) {
        System.out.println("El Video con ID " + id + " ha sido listado.");
        
        } else {
        System.out.println("Operación cancelada.");
        }
        
    }
     
    
    public static void listMagazines() {
        
        
        
    }
        
    
    
    public static void listVideoMedias() {
        
        
        
    }
    
}
