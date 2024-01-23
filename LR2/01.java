import java.util.Arrays; import java.util.LinkedList; import java.util.List;

public class Program {


public static void main(String args[]) {
List<Integer> integerList = new LinkedList<>(Arrays.asList(-5, 3,0,3,7,- 2,8));

System.out.println(integerList); int min = Integer.MAX_VALUE; int max = Integer.MIN_VALUE; Integer tmpVal;
for (Integer integer : integerList) { tmpVal = integer;
if (tmpVal > max) { max = tmpVal;
}
if (tmpVal < min) { min = tmpVal;
}
}
 
int indMin = Math.min(integerList.indexOf(min),integerList.indexOf(max));
int indMax = Math.max(integerList.lastIndexOf(min),integerList.lastIndexOf(max));
System.out.println("Наибольший элемент: " + max); System.out.println("Наименьший элемент: " + min); integerList.subList(indMin + 1, indMax).clear(); System.out.println(integerList);

}
}
