package assignment16;
 //here to the find the number of lines words and characters in a text file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 public class CountInFile{ //creating a class as CountInFile
	 public static void main(String[] args) { //creating main method
	    
	        BufferedReader reader = null;    
	         
	        //Initializing charCount, wordCount and lineCount to 0
	         
	        int charCount = 0;
	         
	        int wordCount = 0;
	         
	        int lineCount = 0;
	         
	        try{
	        
	            //Creating BufferedReader object and given the path of a source file
	            reader = new BufferedReader(new FileReader("C:/Users/IIS 3/Documents/AcadGild.txt"));
	             
	            //Reading the first line into currentLine
	             
	            String currentLine = reader.readLine();
	             
	            while (currentLine != null){
	         
	                //giving  the lineCount              
	                lineCount++;
	                 
	                //Getting number of words in currentLine
	                 
	                String[] words = currentLine.split(" ");
	                 
	                //taking  the wordCount
	                 
	                wordCount = wordCount + words.length;
	                 
	                // here it is Iterating each word
	                 
	                for (String word : words)
	                {
	                    //Updating the charCount
	                     
	                    charCount = charCount + word.length();
	                }
	                 
	                //Reading next line into currentLine
	                 
	                currentLine = reader.readLine();
	            }
	             
	            //Printing charCount, wordCount and lineCount
	             
	            System.out.println("Number Of Characters  In A  File : "+charCount);
	             
	            System.out.println("Number Of Words In A File : "+wordCount);
	             
	            System.out.println("Number Of Lines In A File : "+lineCount);
	        } 
	        catch (IOException e)  //has it gives exception to handle those put it in a try catch block
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            try
	            {
	                reader.close();           // here Closing the reader
	            }
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }    
 }
	 