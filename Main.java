import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    // Problem 1
    System.out.println("Enter String: ");
    String sentence = sc.nextLine();
    System.out.println("Contains p followed by a vowel " + pVowel(sentence) + " times.");

    // Problem 2
    System.out.println("Enter String: ");
    sentence = sc.nextLine();
    System.out.println(removeLetters(sentence));

    // Problem 3
    System.out.println("Enter two Strings: ");
    sentence = sc.nextLine();
    String sentence2 = sc.nextLine();
    System.out.println(discombobulated(sentence, sentence2));
  }

  // Problem 1
  public static int pVowel(String sentence){
    int count = 0;
    for(int i = 0; i < sentence.length()-1; i++){
      String letter = sentence.substring(i, i+2);
      if (letter.equals("pa") || letter.equals("pe") || letter.equals("pi") || letter.equals("po") || letter.equals("pu")){
        count++;
      }
    }
    return count;
  }

  // Problem 2
  public static String removeLetters(String sentence){
    String newSentence = "";
    for(int i = 0; i < sentence.length(); i++){
      String letter = sentence.substring(i, i+1);
      if (!(letter.equals("e") || letter.equals("t") || letter.equals("a") || letter.equals("i") || letter.equals("o"))){
        newSentence += letter;
      }
    }
    return newSentence;
  }

  // Problem 3
  public static String discombobulated(String sentence, String sentence2){
    String newSentence = "";
    if (sentence.length() == sentence2.length()){
      for(int i = (sentence.length()+1); i > sentence.length(); i--){
        String ch1 = sentence.substring(i, i-1);
        String ch2 = sentence2.substring(i, i-1);
        newSentence += ch1;
        newSentence += ch2;
      }
    } else {
      newSentence = "error";
    }
    return newSentence;
  }

}
