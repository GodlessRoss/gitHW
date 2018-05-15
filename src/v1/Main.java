package v1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(
				"Выберите команду: \n1.Включить;\n2.Выключить;\n3.Приготовить эспрессо;\n4.Приготовить американо;\n5.Очистка бака, отработанного кофе.\n");
		Scanner scanner =  new Scanner(System.in);
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println();
		}
	}

}
