import java.util.Scanner;

    public class q3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
             final String name = sc.nextLine();

            System.out.println("....................");
            System.out.println("Original and reverse: ");
            System.out.println(name);

            char[] nameChars = name.toCharArray();

            for (int i = nameChars.length - 1; i >= 0; i--) {
                System.out.print( nameChars[i]);
            }
        }
    }


