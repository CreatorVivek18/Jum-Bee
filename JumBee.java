import java.util.*;

public class JumBee {
    static Scanner x = new Scanner(System.in);

    public static void zero() {
        System.out.println("-----WELCOWE TO SCHOOL SECTION -----");
        System.out.println(
                "NOTE : Here you have to find 5 School Words and enter all\nby separating them with spaces.\n\n");
        System.out.println("W  Z  B  F  J  J  G  D  E"); // ERASER
        System.out.println("S  C  H  O  O  L  O  W  R"); // PEN
        System.out.println("O  D  P  L  N  U  N  C  A"); // PENCIL
        System.out.println("V  P  E  N  A  N  L  O  S"); // UNIFORM
        System.out.println("I  E  N  D  J  I  Q  E  E"); // SCHOOL
        System.out.println("L  N  J  H  T  F  O  P  R");
        System.out.println("F  C  K  N  K  O  B  I  J");
        System.out.println("Z  I  B  Y  P  R  E  H  Q");
        System.out.println("K  L  B  T  H  M  J  U  I");
        System.out.print("\nEnter five  Words ---> ");
        String a = x.nextLine().trim();
        int c = 0, tc = 1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ')
                c++;
        }
        if (c != 4) {
            System.out.println("There are 5 words. :( ");
            System.exit(0);
        } else {
            int b = 0;
            String w = "";
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == ' ') {
                    w = a.substring(b, j);
                    b = j + 1;
                    if (w.equalsIgnoreCase("school"))
                        tc++;
                    else if (w.equalsIgnoreCase("pen"))
                        tc++;
                    else if (w.equalsIgnoreCase("pencil"))
                        tc++;
                    else if (w.equalsIgnoreCase("eraser"))
                        tc++;
                    else if (w.equalsIgnoreCase("uniform"))
                        tc++;
                }
            }
        }
        if (tc == 5)
            System.out.println("Congrats You Won !!!");
        else if (tc == 0)
            System.out.println("Sorry, You Lose !!!");
        else
            System.out.println("You gave " + (tc - 1) + " answers");
    }

    public static void one() {
        System.out.println("-----WELCOWE TO TECH SECTION -----");
        System.out.println(
                "NOTE : Here you have to find 5 Tech Words and enter all\nby separating them with spaces.\n\n");
        System.out.println("A  A  B  F  J  J  G  D  E"); // mobile
        System.out.println("M  N  W  I  N  D  O  W  S"); // windows
        System.out.println("O  D  B  L  L  M  N  C  H"); // laptop
        System.out.println("B  R  G  E  A  G  L  O  I"); // android
        System.out.println("I  O  K  D  P  J  Q  E  R"); // file
        System.out.println("L  I  J  H  T  T  O  P  N");
        System.out.println("E  D  K  N  O  P  B  I  J");
        System.out.println("Z  X  B  Y  P  E  E  H  Q");
        System.out.println("K  A  B  T  H  P  J  U  I");
        System.out.print("\nEnter five  Words ---> ");
        String a = x.nextLine().trim();
        int c = 0, tc = 1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ')
                c++;
        }
        if (c != 4) {
            System.out.println("There are 5 words. :( ");
            System.exit(0);
        } else {
            int b = 0;
            String w = "";
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == ' ') {
                    w = a.substring(b, j);
                    b = j + 1;
                    if (w.equalsIgnoreCase("windows"))
                        tc++;
                    else if (w.equalsIgnoreCase("android"))
                        tc++;
                    else if (w.equalsIgnoreCase("laptop"))
                        tc++;
                    else if (w.equalsIgnoreCase("mobile"))
                        tc++;
                    else if (w.equalsIgnoreCase("file"))
                        tc++;
                }
            }
        }
        if (tc == 5)
            System.out.println("Congrats You Won !!!");
        else if (tc == 0)
            System.out.println("Sorry, You Lose !!!");
        else
            System.out.println("You gave " + (tc - 1) + " answers");
    }

    public static void two() {
        System.out.println("-----WELCOWE TO SOCIAL SECTION -----");
        System.out.println(
                "NOTE : Here you have to find 5 Social Words and enter all\nby separating them with spaces.\n\n");
        System.out.println("A  A  B  F  J  J  G  D  E"); // LOVE
        System.out.println("M  N  F  R  I  E  N  D  S"); // FRIENDS
        System.out.println("O  D  B  L  L  M  N  C  O"); // GIRL
        System.out.println("B  R  G  E  I  G  L  O  Q"); // HOME
        System.out.println("I  O  K  D  F  I  Q  E  R"); // LIFE
        System.out.println("L  I  J  H  E  R  O  P  N");
        System.out.println("O  D  K  N  O  L  B  I  J");
        System.out.println("V  X  B  Y  P  E  E  H  Q");
        System.out.println("E  A  B  T  M  O  N  E  Y");
        System.out.print("\nEnter five  Words ---> ");
        String a = x.nextLine().trim();
        int c = 0, tc = 1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ')
                c++;
        }
        if (c != 4) {
            System.out.println("There are 5 words. :( ");
            System.exit(0);
        } else {
            int b = 0;
            String w = "";
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == ' ') {
                    w = a.substring(b, j);
                    b = j + 1;
                    if (w.equalsIgnoreCase("love"))
                        tc++;
                    else if (w.equalsIgnoreCase("friends"))
                        tc++;
                    else if (w.equalsIgnoreCase("life"))
                        tc++;
                    else if (w.equalsIgnoreCase("girl"))
                        tc++;
                    else if (w.equalsIgnoreCase("money"))
                        tc++;
                }
            }
        }
        if (tc == 5)
            System.out.println("Congrats You Won !!!");
        else if (tc == 0)
            System.out.println("Sorry, You Lose !!!");
        else
            System.out.println("You gave " + (tc - 1) + " answers");
    }

    public static void three() {

        System.out.println("-----WELCOWE TO SCIENCE SECTION -----");
        System.out.println(
                "NOTE : Here you have to find 5 Science Words and enter all\nby separating them with spaces.\n\n");
        System.out.println("C  H  E  M  I  C  A  L  E"); // GRAVITY
        System.out.println("M  N  F  M  E  T  A  L  S"); // CHEMICAL
        System.out.println("O  D  B  L  L  M  N  C  C"); // NEWTON
        System.out.println("N  R  G  E  M  G  L  O  I"); // SCIENCE
        System.out.println("E  O  K  D  E  I  Q  E  E"); // METALS
        System.out.println("W  I  J  H  T  R  O  P  N");
        System.out.println("T  D  K  N  A  L  B  I  C");
        System.out.println("O  X  B  Y  L  E  E  H  E");
        System.out.println("N  A  B  T  S  O  N  O  N");
        System.out.print("\nEnter five  Words ---> ");
        String a = x.nextLine().trim();
        int c = 0, tc = 1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ')
                c++;
        }
        if (c != 4)
            System.out.println("There are 5 words. :( ");
        else {
            int b = 0;
            String w = "";
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == ' ') {
                    w = a.substring(b, j);
                    b = j + 1;
                    if (w.equalsIgnoreCase("chemical"))
                        tc++;
                    else if (w.equalsIgnoreCase("science"))
                        tc++;
                    else if (w.equalsIgnoreCase("gravity"))
                        tc++;
                    else if (w.equalsIgnoreCase("newton"))
                        tc++;
                    else if (w.equalsIgnoreCase("metals"))
                        tc++;
                }
            }
        }
        if (tc == 5)
            System.out.println("Congrats You Won !!!");
        else
            System.out.println("Sorry, You Lose !!!");
    }

    public static void main(String ar[]) {
        System.out.println("             W E L C O M E    T O            \n");
        System.out.println("     T H E     J U M  -  B E E     G A M E \n");
        System.out.println("------------------------------------------------\n");
        System.out.print("Enter you Name --> ");
        String name = x.nextLine().trim();
        System.out.println("\nWelcome here " + name + " !!!\n\n");
        System.out.println("              LOADING ...\n\n");
        for (int pa = 1; pa <= 1424632562l; pa++) {
        }
        double d = Math.random();
        String s = String.valueOf(d);
        char ch = s.charAt(2);

        switch (ch) {
            case '0':
                zero();
                break;
            case '1':
                one();
                break;
            case '2':
                two();
                break;
            case '3':
                three();
                break;
            case '4':
                one();
                break;
            case '5':
                two();
                break;
            case '6':
                three();
                break;
            case '7':
                two();
                break;
            case '8':
                one();
                break;
            case '9':
                three();
                break;
        }
    }
}
