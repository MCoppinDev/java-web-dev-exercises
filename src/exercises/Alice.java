package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String quote;
        Scanner input;
        String inputSearch;


        quote = "Alice was beginning to get very tired of sitting by her sister on the bank, \n" +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, \n" +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'\n";

        input = new Scanner(System.in);

        System.out.println(quote);

        System.out.println("Input word to search inside of quote");

        inputSearch = input.next().toLowerCase().trim();



        if(quote.toLowerCase().trim().contains(inputSearch)){

            String newQuote = quote.replaceFirst(inputSearch, "(***)");


            System.out.println("word found at: " + quote.indexOf(inputSearch) + " with " + inputSearch.length() + " characters.");
            System.out.println(newQuote);

        }else{
            System.out.println("Not found");
        }

    }

}
