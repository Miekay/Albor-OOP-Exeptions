import java.util.*; 
  
 public class ClassNotFoundExceptions { 
         public static void main(String[] args) { 
                 Scanner scanner = new Scanner(System.in); 
  
                 while (true) { 
                         System.out.print("Enter the name of a class (e.g., java.util.ArrayList): "); 
                         String className = scanner.nextLine(); 
  
                         try { 
                                 Class<?> clazz = Class.forName(className); 
                                 System.out.println("Class found: " + clazz.getName()); 
                         } catch (ClassNotFoundException e) { 
                                 System.err.println("ClassNotFoundException: " + e.getMessage()); 
                         } 
  
                         
                 } 
         } 
 }