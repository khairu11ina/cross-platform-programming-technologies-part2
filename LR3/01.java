import java.text.DateFormat; import java.text.SimpleDateFormat; import java.util.ArrayList;
import java.util.Date; import java.util.List; import java.util.Locale; import java.util.Random; import java.util.Scanner;
import java.util.regex.Matcher; import java.util.regex.Pattern;



public class Program {


public static void main(String[] args) { Scanner scanner = new Scanner(System.in); System.out.println("Введите элемент: ");
int n = scanner.nextInt(); switch(n){
case 1 -> backwards(); case 2 -> count();
case 3 -> splitText(); case 4 -> time(); case 5 -> week();
case 6 -> format();
}
}
static void backwards() { String str = "абвгдеёжзи";
String reverse = new StringBuffer(str).reverse().toString(); System.out.println("\nСтрока до реверса: " + str); System.out.println("Строка в обратном порядке, после реверса: " +
reverse);
}
static void count(){
String someString = "elephant"; char someChar = 'e';
int count = 0;


for (int i = 0; i < someString.length(); i++) { if (someString.charAt(i) == someChar) { count++;
}
}
System.out.println("\nКоличество вхождений: " + count);
}
static void splitText() {
String text = "Can we see the full text of your speech before Tuesday";


Pattern p = Pattern.compile("\\w+"); Matcher m = p.matcher(text); List<String> words = new ArrayList<>(); while (m.find())words.add(m.group()); for (int i = 0; i < words.size(); i++) {
System.out.println(words.get(i));
}


}
static void time(){
Date date = new Date(); System.out.println(date); long now = date.getTime();
long next = now + 1000000000; date.setTime(next); System.out.println(date);
}
static void week(){
Date date = new Date(); int min = 1000000;
int max = 2000000000; int diff = max - min;
Random random = new Random(); int i = random.nextInt(diff + 1);
i += min; date.setTime(i);
Locale locale = Locale.ENGLISH;
DateFormat formatter = new SimpleDateFormat("EEEE", locale); System.out.println(date); System.out.println(formatter.format(date));
}
static void format(){
Date date = new Date();
DateFormat formatter = new SimpleDateFormat("yyyy MMMM dd"); String today = formatter.format(date);
System.out.println("Today : " + today);
}
}
