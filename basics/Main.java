import java.util.Random;

import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {
    String greeting = "Welcome to my Java program.";
    System.out.println(greeting);

    // execute pluralize function
    String word = "cat";
    int number = 0;
    String pluralizedWord = pluralize(word, number);
    System.out.println("I own " + number + " " + pluralizedWord);

    // execute flipNHeads

    int n = 3;
    String coinFlipResult = flipNHeads(n);
    System.out.println("It took me " + coinFlipResult + " flips to flip " + n + " Heads in a row.");

   // execute clock
   String timeNow = clock();
   System.out.println(timeNow);

    }

  public static String pluralize(String word, int number) {
    if (number == 0 || number > 1) {
      return word + "s";
    } else {
      return word;
    }
  }

  public static String flipNHeads(int n) {
    Random random = new Random();
    int numHeads = 0;
    int numFlips = 0;
    double inBetween = 0.5;
    String result = "";

    while (numHeads != n) {
      double coinFlip = random.nextDouble();
      numFlips = coinFlip < inBetween ? numFlips + 1 : numFlips + 1;
      System.out.println(coinFlip < inBetween ? "Tails" : "Heads");

      numHeads = coinFlip > inBetween ? numHeads + 1 : 0;
      result = Integer.toString(numFlips);
    }
    return result;
  }

  public static String clock() {
    int seconds = 0;
    while (true) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        if (second != seconds) {
            seconds = second;
            System.out.println(hour + ":" + minute + ":" + second);
        }
      }
    }
}
