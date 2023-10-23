import java.io.*; 
 import java.util.*; 
  
 public class IOExceptions { 
     public static void main(String[] args) { 
         Scanner scanner = new Scanner(System.in); 
  
 while (true){ 
         System.out.print("Enter the name of a file (e.g., non-existent-file.txt): "); 
         String fileName = scanner.nextLine(); 
  
         try { 
             BufferedReader reader = new BufferedReader(new FileReader(fileName)); 
             String line; 
             while ((line = reader.readLine()) != null) { 
                 System.out.println(line); 
             } 
             reader.close(); 
         } catch (IOException e) { 
             System.err.println("IOException: " + e.getMessage()); 
         } 
  
         
     } 
     } 
 }