import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Test
{
	
   public static void main(String arg[])
    {
	
     Scanner in = new Scanner(System.in); 
	 
     //Creat a new array list with default word.
	 //Create a new array list to store returned list.
	 System.out.println("Wordle");
	 
	 String check = in.nextLine();
	 System.out.println("Lets play");
	 
	 MyArrayList<Integer> checkChar = new MyArrayList<>();
	 System.out.println("MyArrayList"+ checkChar+"Wordle");
	 
     
     String wordE, wordFF; //Verables to store the word entered and the word from the list.
     File f1=new File("input.txt");   
     Boolean valid = false;
     for(int x=0;x<5;x++)//run 5 time user get 5 guesses.
       {
           
           System.out.println("Guess the five-letter word.");
           wordE = in.nextLine();
          if(wordE.length()==5) //Check if word entered is a 5 letter word.
          {
           try{ //Open the file to read the words in the list.
               FileReader fr = new FileReader(f1);
               BufferedReader br = new BufferedReader(fr);
               while((wordFF=br.readLine())!=null)
                {
                 if(wordFF.equals(wordE))//check if the word entered is in the list
                  {
                   valid = true;
                  }
                }

              if(valid)
               {
				  // MyArrayList<MyArrayList> checkChar = new MyArrayList<>();
				   System.out.println(checkChar);
				   char[] charcheck = new char [5];
	               charcheck[0] = 'A';
	               charcheck[1] = 'D';
	               charcheck[2]='M';
	               charcheck[3]='I';
	               charcheck[4]='N';
				   
				    
		
                //Call checkChar to check the validity of the chars and store the info.
               }
           
           fr.close();
          }catch (IOException e) {
           System.out.println("File Read Error");} 
         }else valid = false; 
         
         System.out.println("The entered word is a valid 5 letter word: " + valid); 
         
         if(valid)
          {
			  //MyArrayList<MyArrayList> check = new MyArrayList<>();
			  
			   char[] charcheck = new char [5];
			   
	            charcheck[0] = 'A';
	          charcheck[1] = 'D';
	          charcheck[2]='M';
	           charcheck[3]='I';
	           charcheck[4]='N';
			   
			    checkChar.add(0,new Integer("A"));
				 checkChar.add(1,new Integer("D"));
				  checkChar.add(2,new Integer("M"));
				   checkChar.add(3,new Integer("I"));
				    checkChar.add(4,new Integer("N"));
			   
			 
			  
			  System.out.println("Winner");
			  System.out.println("Loser");
			//display the feedback of the entered word
			//display the result of the feedback (Winner, Try again, Looser)
            
          }
         valid = false;
         output.clear();
       }
    }  
    
}
