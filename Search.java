//пятая лаба по ТОИП (Ярцев Р.А.) 2 курс 3 семестр
//Последовательный поиск

import java.util.Arrays;
import java.util.Scanner;

public class Search {

	public static void main (String [] args) {
		
		int[] array = new int[16];
		int numbers=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Заполните массив элементами:");
		    
		    for (int i = 0; i < 16; i++) {
		        array[i] = scan.nextInt(); 
		                                 }
		    String intArrayString = Arrays.toString(array);
		    System.out.println ("Введен массив:   " + intArrayString);
	 
		    System.out.println("Введите искомый элемент:");    
		    int poisk = scan.nextInt(); 
		    System.out.println ("Введен искомый элемент:" + poisk + "  Осуществляем поиск");
		    for (int i = 0;  i < 16; i++) {
		       if (poisk>array[i] || poisk<array[i]) {} else {numbers=numbers+1; System.out.println ("Найдено совпадение в ячейке № " +i); break;}
		       
		    }
		       if (numbers>0) {System.out.println ("Поиск завершен успешно");} else {System.out.println ("Поиск завершен, совпадений не найдено");};
		             
                    }
	}
