import java.util.ArrayList; 
 import java.util.InputMismatchException; 
 import java.util.Random; 
 import java.util.Scanner; 
  
 class Player { 
     private ArrayList<Integer> numbers; 
  
     public Player(String name) { 
         this.numbers = new ArrayList<>(); 
     } 
  
     public ArrayList<Integer> getNumbers() { 
         return numbers; 
     } 
  
     public void addNumber(int number) { 
         numbers.add(number); 
     } 
 } 
  
 public class LotterySystem { 
     private static ArrayList<Player> players = new ArrayList<>(); 
     private static final int TWO_D_RANGE = 31; 
     private static final int THREE_D_RANGE = 10; 
     private static final int SIX_D_RANGE = 10; 
  
     public static void main(String[] args) { 
         Scanner scanner = new Scanner(System.in); 
  
         while (true) { 
             System.out.println("Lottery Categories:"); 
             System.out.println("1. 2D (1-" + TWO_D_RANGE + ")"); 
             System.out.println("2. 3D (0-" + THREE_D_RANGE + ")"); 
             System.out.println("3. 6D (0-" + SIX_D_RANGE + ")"); 
             System.out.println("4. Exit"); 
             System.out.print("Choose a category (1-4): "); 
  
             int choice = scanner.nextInt(); 
  
             if (choice == 4) { 
                 System.out.println("Exiting the program."); 
                 break; 
             } 
  
             if (choice < 1 || choice > 3) { 
                 System.out.println("Invalid choice. Please select a valid category."); 
                 continue; 
             } 
  
             scanner.nextLine(); // Consume newline 
  
             // Generate one winning number for all players in the category 
             int numDigits = (choice == 1) ? 2 : (choice == 2) ? 3 : 6; 
             int maxRange = (choice == 1) ? TWO_D_RANGE : (choice == 2) ? THREE_D_RANGE : SIX_D_RANGE; 
             Random random = new Random(); 
             int winningNumber = random.nextInt((int) Math.pow(10, numDigits)); 
  
             while (true) { 
  
  
            Player player= new Player(); 
  
                 for (int i = 0; i < numDigits; i++) { 
                     int number; 
                     while (true) { 
                         try { 
                             System.out.print("Digit " + (i + 1) + " (0-" + maxRange + "): "); 
                             number = scanner.nextInt(); 
 System.out.print("Enter player name or 'quit' to stop: "); 
  
                 if (playerName.equalsIgnoreCase("quit")) { 
                     break; 
                 } 
                             if (number < 0 || number > maxRange) { 
                                 System.out.println("Invalid number. Please enter a number within the specified range."); 
                                 continue; 
                             } 
  
                             if (getNumbers().contains(number)) { 
                                 System.out.println("Number already entered. Please enter a different number."); 
                                 continue; 
                             } 
  
                             break; // Exit the loop if input is valid 
                         } catch (InputMismatchException e) { 
                             System.out.println("Invalid input. Please enter a number."); 
                             scanner.nextLine(); // Consume invalid input 
                         } 
                     } 
                     player.addNumber(number); 
                 } 
                 scanner.nextLine(); // Consume newline 
             } 
  
             // Draw the lottery and declare winners 
             drawLottery(choice, winningNumber); 
         } 
  
         scanner.close(); // Close the scanner outside the main loop 
     } 
  
     private static void drawLottery(int category, int winningNumber) { 
     System.out.println("Drawing the lottery for category " + category + "..."); 
     System.out.println("Winning Number: " + winningNumber); // Display the winning number 
     ArrayList<Player> winners = new ArrayList<>(); 
  
     for (Player player : players) { 
  //       System.out.println(player.getName() + "'s numbers: " + player.getNumbers()); 
            System.out.println("numbers: " + player.getNumbers()); 
  
         if (player.getNumbers().contains(winningNumber)) { 
             winners.add(player); 
         } 
     } 
  
     if (winners.isEmpty()) { 
         System.out.println("No winners in this category."); 
     } else { 
         System.out.println("Winners:"); 
         for (Player winner : winners) { 
             System.out.println(winner.getName()); 
         } 
     } 
  
     players.clear(); // Clear the list for the next category 
 } 
 }