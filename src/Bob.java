import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bob {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

            boolean confirmation = true;
            String userResponse = "";
            do {
                System.out.println("Start conversation here: ");
                String conversation = sc.nextLine();
                if (conversation.endsWith("?")) {
                    System.out.println("Sure.");
                } else if (conversation.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (conversation.isEmpty()) {
                    System.out.println("Fine. Be that way!");
                } else System.out.println("Whatever.");

                System.out.print("Do you want to continue your conversation? (y/N) ");
                userResponse = sc.nextLine();
                confirmation = userResponse.equalsIgnoreCase("y");

            } while (confirmation);

            }
        }
