
public class Programm {
    public static void main(String[] args) {
        
        char[] array = {'O','P','Q','S'};
        char[] array1 = {'o','p','q','s'};
        
        char missingChar = Kata.findMissingLetter(array);
        System.out.println(missingChar);
        
        System.out.println(AlternativeSolution.findMissingLetter(array1));
        
    }
}
