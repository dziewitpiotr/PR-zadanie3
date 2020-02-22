import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MixedWordException {

        Scanner scanner = new Scanner(System.in);

        String tokeny = scanner.next();

        metoda(tokeny);

//        //drugie podejscie
//        for (int i = 0; i < tokeny.length(); i++) {
//        }

    }

    private static void metoda(String token) throws MixedWordException {
        for (int i = 0; i < token.length()-1; i++) {

            if(((token.charAt(i) >= 48 && token.charAt(i) <= 57) && (token.charAt(i+1) >= 48 && token.charAt(i+1) <= 57)) || ((token.charAt(i) >= 97 && token.charAt(i) <= 122) && (token.charAt(i+1) >= 97 && token.charAt(i+1) <= 122))) {
                return;
            }

        }
        throw new MixedWordException();
    }

}
