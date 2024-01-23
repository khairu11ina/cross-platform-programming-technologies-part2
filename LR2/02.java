import java.util.Scanner;
public class Program  {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in); int[] arr = {2,4,5,2,3};
System.out.println("Введите элемент: "); int n = scanner.nextInt();
int sum = 0;
for (int i = 0; i < 5; i++) { if (arr[i] == n) {
sum++;
}
}
System.out.println("Сумма элементов: " + sum);
}
}


