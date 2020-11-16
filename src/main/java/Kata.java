
import java.util.Arrays;


// FIND THE MISSING LETTER

public class Kata {
    
  public static char findMissingLetter(char[] array) {
      
    char[] alphabetUpperCase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};  
    char[] alphabetLowerCase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};  
    char[] alphabet;

    //get which caseArray to use
    if (getCase(alphabetLowerCase, array[0])) {
        alphabet = alphabetUpperCase;
    } else {
        alphabet = alphabetLowerCase;
    }
      
    //get starting point in alphabet array
    int startIndex = getStartIndex(alphabet, array);

    //copy alphabet from startingPoint to new array 
    char[] newAlphabet = Arrays.copyOfRange(alphabet, startIndex, alphabet.length);

    //compare arrays to find missing char
    return compareArrays(array, newAlphabet);
   }
 
    public static boolean getCase(char[] array, char c) {
        boolean isUpperCase = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                isUpperCase = false;
                break;
          }
        }
        
        return isUpperCase;
    }
  
    public static int getStartIndex(char[] array1, char[] array2) {
        int startIndex = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[0]) {
                startIndex = i;
            }
    }
      
        return startIndex;
    }
    
    public static char compareArrays(char[] array1, char[] array2) {
        char missingChar = ' ';
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                missingChar = array2[i];
                break;
            }
        }        
       
        return missingChar;
    }
   
}
