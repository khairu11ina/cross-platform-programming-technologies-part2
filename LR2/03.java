import java.util.Arrays;

public class Program  {
public static void main(String args[]) {
int [][] arr = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3},{2,5,6,2}};
System.out.println(Arrays.deepToString(arr)); double sum = 0;
int num = 0;
for (int i = 0; i < 4; i++) { for (int j = 0; j < 4; j++) {
if (j - i > 0 && arr[i][j] > 0) { sum += arr[i][j];
num++;
}
}
}
System.out.println("Сумма элементов: " + sum); System.out.println("Количество элементов: " + num);
}
}
