import java.util.Scanner;
public class Main {



            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your age: ");
                int age = scanner.nextInt();


                int bookPages = 100-age;
                System.out.println(age+" year olds should read at least "+ bookPages+" pages before giving up on a book");
            }
    }
