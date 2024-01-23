import java.util.Arrays;
public class Program  {
public static void main(String args[]) {
int [][] arr = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3},{2,5,6,2}};
System.out.println(Arrays.deepToString(arr)); for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) { if (i == j) {
arr[i][j] = arr[i][j]* arr[i][j];
}
}
}
System.out.println(Arrays.deepToString(arr));
}
}

