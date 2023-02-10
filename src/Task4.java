import java.util.Scanner;

public class Task4 {
    static Scanner console;

    public static void main(String[] args) {
        console = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = console.nextLine();
        System.out.println("Enter searchable letter: ");
        char ch = console.next().charAt(0);
        String[] words = text.split("[ ,.:;-?!]+");
        
        int count = 0, max = 0;
        for (int i = 0; i < words.length; i++){
            String word = words[i];
            char[] chars = word.toCharArray();
            for (int j = 0; j < chars.length; j++){
                if (chars[j] == ch) count++;
            }
            if (count > max) max = count;
            count = 0;
        }
        //System.out.println("Count = " + count);
        System.out.println("max = " + max);
        System.out.println("Words which consists of maximum quantity of given character: ");
        for (int i = 0; i < words.length; i++){
            String word = words[i];
            char[] chars = word.toCharArray();
            for (int j = 0; j < chars.length; j++){
                if (chars[j] == ch) count++;
            }
            if (count == max) System.out.println("word["+i+"]: " + word);
            count = 0;
        }

        console.close();
    }
}