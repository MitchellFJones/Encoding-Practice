import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
public static void main(String[] args)
{
String def, set = "", fin = "";
int letterCounter = 0;
//inputs the thing to be encoded, make it into a string
System.out.println("Input:");
      
   Scanner in = new Scanner(System.in);
   
   String input = in.nextLine();
   
   String[] inputStringArray = input.split("");
   
 //taking the string and turning it into a char array
   
   List<String> outputStringLst= new ArrayList<String>();
   set = inputStringArray[0];
   for(int i = 0;i < inputStringArray.length;i++)
   {
     def = inputStringArray[i];
     
     if(inputStringArray[i] == inputStringArray[0])
     {
     set = inputStringArray[0];
     
     letterCounter++;
     
     }

     else 
     {
    	
		  if(inputStringArray[i].equals(inputStringArray[i-1]))
		     {
		     letterCounter++;
		    
		     if (i+1 == inputStringArray.length )
		     {
		    	 String numberAsString = String.valueOf(letterCounter);
			     
		    	 System.out.print("p");
		    	 
			     outputStringLst.add(numberAsString);
			     
			     outputStringLst.add(inputStringArray[i]);
			     
			     set = inputStringArray[i];
			     
			     
		     }
		    }
		     else
				{
				     if(letterCounter == 1)
				     {
				    	 outputStringLst.add(inputStringArray[i]);
				    	 
				     }
				     else
				     {
				    	 
					     String numberAsString = String.valueOf(letterCounter);
					      
					     outputStringLst.add(numberAsString);
					     
					     
					     outputStringLst.add(inputStringArray[i-1]);
					     
					     set = inputStringArray[i];
					     
					     letterCounter = 1;
					     
					  
					     if (i+1 == inputStringArray.length )
					     {
					    	 numberAsString = String.valueOf(letterCounter);
						     
					    	 
					    	 
						     
						     
						     outputStringLst.add(inputStringArray[i]);
						     
						     set = inputStringArray[i];
						     
						     
					     }
				     }
				     
		     
				}
     }
   }
        
   for (String j : outputStringLst)
   {
  fin += j;
   }
   System.out.println("Encoded: " + fin);

      
         //starts loop for length of char array
                                      
                                        //sets array[i] to def_char which will create a pattern
       
                                        //first check if array[i] is array[0] then sets to set_char
       
                                        //second check if array[i] (which is equal to def char), is the same as set_char
                                                                      
                                                                        //if it is equal then just add one more to the letter_counter
       
                                                                        //if it is not equal then add set_char to new encode_list and add letter_counter to encode_list.
                                                                       //After that set set_char to def_char and reset letter_counter to 1
       
                        //after doing this it should output create a list of one letter followed by the number of times it is in the original line of data
}
}


