import java.util.Scanner;
class numbergame2
{
    
    public static int getrandN(int min, int max)
   
    {
        return (int) (Math.random() * (max - min + 1) + min); 
    }
    
    public static void main(String arg[])
    
    {
        System.out.println("_______"); 
        System.out.println("NUMBER GAME"); 
        System.out.println("_______"); 
        System.out.println("NUMBER GAME RANGE IS BETWEEN 1 TO 100"); 
        System.out.println("HEY YOU HAVE " + 5 + " CHANCES TO WIN"); 
        int user_choice, finalscore = 0; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("1-> WANT TO PLAY GAME"); 
        System.out.println("2-> EXIT");
        System.out.print("ENTER CHOICE OF USER= "); 
        int ch = sc.nextInt(); 
        
        switch (ch)
        
        {
            case 1: 
                boolean playagain = true;
                
                while (playagain) 
                
                {
                    int Random_Number = getrandN(1, 100); 
                    boolean guess = false;
                    
                    for (int i = 1; i <= 5; i++)
                    
                    {
                        System.out.println("Round" + i); 
                        System.out.print("ENTER NUMBER OF YOUR CHOICE USER= ");
                        user_choice = sc.nextInt(); 
                        
                        if (user_choice == Random_Number)
                        
                        {
                            guess = true;
                            finalscore++; 
                            System.out.println("CONGRATULATION YOU WIN"); 
                            break; 
                        }
                         
                        else if (user_choice > Random_Number)
                        
                        {
                            System.out.println("USER CHOICED NUMBER IS LARGER.");
                        } 
                       
                        else 
                        
                        {
                            System.out.println("USER CHOICED NUMBER IS SMALLER.");// PRINT INSTRUCTION

                        }
                        
                        if (guess = false) 
                        
                        {
                            System.out.println("YOU LOST YOUR CHANCE  NUMBER  IS" + Random_Number);
                        }
                    }
                    System.out.print("WANT TO PLAY AGAIN(YES/NO)=");
                    String chAgain = sc.next();
                    playagain = chAgain.equalsIgnoreCase("YES");
                }
                System.out.println("HOPE YOU ENJOY THIS GAME");
                System.out.println("SCORE YOU GET=" + finalscore);
            case 2: 
                System.out.println("THANKU TO USING THE NUMBER GAME"); 
                break; 
            default:
                System.out.println("INVALID CHOICE. PLEASE TRY AGAIN."); 
        } 
    } 
}