import java.util.Scanner;
public class Playground {

public static void main(String[] args) {
System.out.println("Введите ваш код: —>");

Scanner scanner = new Scanner(System.in);
String yourcode = scanner.nextLine();
scanner.close();
int linelength = yourcode.length();
System.out.println("Длина вашего кода равна " + linelength);
if (linelength < 7) {System.out.println ("Недостаточно символов"); System.exit(0); }

int mod = linelength % 7;
if ( mod != 0) {
System.out.println ("Число не кратно 7 - все плохо");

System.out.println ("Количество отбрасываемых символов" + " " + mod);
linelength -= mod;

System.out.println ("Размер идеальной строки после отброса" +" " + linelength);
yourcode = yourcode.substring(0, linelength);
System.out.println ("Строка после отброса" + " " + yourcode);
}
else{
System.out.println ("Число кратно 7 - отлично!");
System.out.println ("Наша строка" + " " + yourcode);
}

char[] sign = yourcode.toCharArray();

int s1 = sign[0] + sign[1] + sign[2] + sign[4];
int s2 = sign[0] + sign[1] + sign[3] + sign[5];
int s3 = sign[0] + sign[2] + sign[3] + sign[6];

if (s1 % 2 != 0 || s1 % 2 != 0 || s1 % 2 != 0) {
System.out.println ("Есть ошибка в коде");
}
}
}
