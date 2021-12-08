package bsu.rfe.java.group10.lab1.VOLOTSKO.varA3;

import java.util.Scanner;

public class MainApplication {
	@SuppressWarnings("unchecked")
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Food[] breakfast = new Food[20];
		for (int i = 0; i < 20; i++) {
			System.out.println("Введите блюдо, если хотите перестать вводить данные, введите *end* ");
			String food = scanner.nextLine();
			if (food.equals("сыр")) {
				breakfast[i] = new Cheese();
			} else if (food.equals("яблоко/большое")) {
				breakfast[i] = new Apple("большое");
			} else if (food.equals("яблоко/маленькое")) {
				breakfast[i] = new Apple("маленькое");
			} else if (food.equals("молоко/1.5%")) {
				breakfast[i] = new Milk("1.5%");
			} else if (food.equals("молоко/2.5%")) {
				breakfast[i] = new Milk("2.5%");
			} else if (food.equals("молоко/5%")) {
				breakfast[i] = new Milk("5%");
			}  else break;
		}
		for (int j=0; j<breakfast.length; j++) {
			if (breakfast[j] != null)
				breakfast[j].consume();
			else break;
		}

		int apple_counter=0;
		int cheese_counter=0;
		int milk_counter=0;
		for (int i = 0; i < 20; i++) {
			if (breakfast[i] != null) {
				if(breakfast[i].equals(new Apple("большое"))) {
					apple_counter++;
				} else if(breakfast[i].equals(new Cheese())) {
					cheese_counter++;
				} else if(breakfast[i].equals(new Milk("1.5%"))) {
					milk_counter++;
				}
			}
			else break;
		}


		System.out.println("CЫР - " +cheese_counter );
		System.out.println("ЯБЛОКО - " +apple_counter );
		System.out.println("МОЛОКО - " + milk_counter);
	}
}

