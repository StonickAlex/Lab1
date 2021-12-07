package bsu.rfe.java.group10.lab1.VOLOTSKO.varA3;

import java.util.Scanner;

public class MainAplication {
	@SuppressWarnings("unchecked")
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Food[] breakfast = new Food[20];
		for (int i = 0; i < 20; i++) {
			System.out.println("Введите блюдо");
			String food = scanner.nextLine();
			if (food.equals("сыр")) {
				breakfast[i] = new Cheese();
			} else if (food.equals("яблоко/большое")) {
				breakfast[i] = new Apple("большое");
			} else if (food.equals("яблоко/маленькое")) {
				breakfast[i] = new Apple("маленькое");
			} else if (food.equals("жевательная резинка/Мята")) {
				breakfast[i] = new IceCream("Мята");
			} else if (food.equals("жевательная резинка/Вишня")) {
				breakfast[i] = new IceCream("Вишня");
			} else if (food.equals("жевательная резинка/Арбуз")) {
				breakfast[i] = new IceCream("Арбуз");
			}  else break;
		}
		for (int j=0; j<breakfast.length; j++) {
			if (breakfast[j] != null)
				breakfast[j].consume();
			else break;
		}

		int apple_counter=0;
		int cheese_counter=0;
		int pie_counter=0;
		for (int i = 0; i < 20; i++) {
			if(breakfast[i]  instanceof Apple) {
				apple_counter++;
			} else if(breakfast[i]  instanceof Cheese ) {
				cheese_counter++;
			} else if(breakfast[i]  instanceof IceCream) {
				pie_counter++;
			}
		}
		System.out.println("CЫР - " +cheese_counter );
		System.out.println("ЯБЛОКО - " +apple_counter );
		System.out.println("ЖЕВАТЕЛЬНАЯ РЕЗИНКА - " + pie_counter);
	}
}