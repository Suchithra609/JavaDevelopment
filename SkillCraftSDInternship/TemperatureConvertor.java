package SkillCraftSDInternship;
import java.util.Scanner;
public class TemperatureConvertor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n===== TEMPERATURE CONVERTER =====");
			System.out.println("1. Celsius to Fahrenheit");
			System.out.println("2. Celsius to Kelvin");
			System.out.println("3. Fahrenheit to Celsius");
			System.out.println("4. Fahrenheit to Kelvin");
			System.out.println("5. Kelvin to Celsius");
			System.out.println("6. Kelvin to Fahrenheit");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			if (choice == 7) {
				System.out.println("Application closed.");
				break;
			}
			double temperature;
			double result;
			switch (choice) {
			case 1:
				System.out.print("Enter temperature in Celsius: ");
				temperature = sc.nextDouble();
				result = (temperature * 9 / 5) + 32;
				System.out.printf("Fahrenheit = %.2f F%n", result);
				break;
			case 2:
				System.out.print("Enter temperature in Celsius: ");
				temperature = sc.nextDouble();
				result = temperature + 273.15;
				System.out.printf("Kelvin = %.2f K%n", result);
				break;
			case 3:
				System.out.print("Enter temperature in Fahrenheit: ");
				temperature = sc.nextDouble();
				result = (temperature - 32) * 5 / 9;
				System.out.printf("Celsius = %.2f C%n", result);
				break;
			case 4:
				System.out.print("Enter temperature in Fahrenheit: ");
				temperature = sc.nextDouble();
				result = (temperature - 32) * 5 / 9 + 273.15;
				System.out.printf("Kelvin = %.2f K%n", result);
				break;
			case 5:
				System.out.print("Enter temperature in Kelvin: ");
				temperature = sc.nextDouble();
				if (temperature < 0) {
					System.out.println("Invalid Kelvin temperature.");
				} else {
					result = temperature - 273.15;
					System.out.printf("Celsius = %.2f C%n", result);
				}
				break;
			case 6:
				System.out.print("Enter temperature in Kelvin: ");
				temperature = sc.nextDouble();
				if (temperature < 0) {
					System.out.println("Invalid Kelvin temperature.");
				} else {
					result = (temperature - 273.15) * 9 / 5 + 32;
					System.out.printf("Fahrenheit = %.2f F%n", result);
				}
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}
		sc.close();
	}
}

