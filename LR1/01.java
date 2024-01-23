import java.util.Scanner;
public class Program {


public static void main(String[] args) { Scanner in = new Scanner(System.in); System.out.print("Input a line: "); String line = in.nextLine();

System.out.printf("Your line is: %s \n", line); in.close();
}
}
