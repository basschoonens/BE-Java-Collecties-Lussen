import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hier mag je je code schrijven voor de hoofd-opdracht
        Integer[] numeric = {1, 2, 3, 4,5,6,7,8,9};
        String[] alphabetic = {"een","twee","drie","vier","vijf","zes","zeven","acht","negen"};

        Translator translator = new Translator(alphabetic, numeric);

        boolean play = true;
        String ongeldig = "ongeldige invoer";

        Scanner scanner = new Scanner(System.in);

        while (play == true){
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");

            String input = scanner.nextLine();

            if (Objects.equals(input, "x")) {
                play = false;
            } else if (Objects.equals(input, "v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();

                if (number < 10) {
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                    System.out.println(ongeldig);
                }

            }

        }

    }





