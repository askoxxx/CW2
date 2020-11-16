
public class AlternativeSolution {

  public static char findMissingLetter(char[] array) {
    boolean stop = false;
    int i;
    for (i = 1; i < array.length && !stop; i++) {
      if (array[i] - array[i-1] != 1)
        stop = true;
    }
    
    System.out.println(array[i-1]-1);
    System.out.println('a' - 'a');
    
    return (char) (array[i-1]-1);
  }

}
