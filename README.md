# PARADIGMAS_GRUPOB02
Paradigmas de programación_ grupo B02 ANIMAL RIDDLE
import java.util.Random;


public class Organize1 {
	
	 public static void printWords(char[] wordNow)
	    {
	        for(int i = 0; i < wordNow.length; i++)
	        {
	            System.out.print(wordNow[i]);
	        }
	    }
	 
	    public static void main(String[] args) {
	        // 1 Se elija aleatoriamente una palabra del banco de preguntas para que el usuario adivine
	            
	        String[] words = {"LION","ELEPHANT","EAGLE","JAGUAR","WHALE","","HORSE","ZEBRA","GORILLA","GIRAFFE"};
	                 // Seleccionar una palabra al azar
	        Random random =  new Random();
	                 int randomIndex = random.nextInt (words.length); 
	                 
	                 String selectWord = words[randomIndex];
	                 System.out.println(selectWord);

	 
	    }
}
