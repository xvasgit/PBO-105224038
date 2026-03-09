import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Celcius : ");
        double inputCelcius = input.nextDouble();
        System.out.printf("Kelvin = " + "%.2f", inputCelcius + 273.15);
        System.out.printf("\nFahrenheit = " + "%.2f", inputCelcius * 9 / 5 + 32);
        System.out.printf("\nReamur = " + "%.2f", inputCelcius * 4 / 5);


        input.close();
    }
}