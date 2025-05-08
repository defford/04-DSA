package Assignment_01;

import java.util.Scanner;

public class TemperaturesUtil {

    int[] temperatureEntries;
    int numberOfEntries = 0;
    double averageTemperature;
    int numEntriesAboveAverage = 0;

    public double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < temperatureEntries.length; i++) {
            sum += temperatureEntries[i];
        }
        averageTemperature = sum / (double)temperatureEntries.length;
        System.out.println("The average temperature is: " + averageTemperature);
        return averageTemperature; 
    }

    public void findTemperaturesAboveAverage() {
        for (int i = 0; i < temperatureEntries.length; i++) {
            if (temperatureEntries[i] > averageTemperature) {
                numEntriesAboveAverage++;
            }
        }
        System.out.println("The number of temperatures above average is: " + numEntriesAboveAverage);
    }
        
    public static void main(String[] args) {
        TemperaturesUtil temperaturesUtil = new TemperaturesUtil();
        
        do {
            try {
                Scanner inputInt = new Scanner(System.in);
                System.out.print("How many temperature entries would you like to make? ");
                temperaturesUtil.numberOfEntries = inputInt.nextInt();
                if (temperaturesUtil.numberOfEntries <= 0) {
                    System.out.println("Invalid number. Please enter a valid temperature entry above 0.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid temperature entry above 0.");
            }
        } while (temperaturesUtil.numberOfEntries <= 0);
        
        temperaturesUtil.temperatureEntries = new int[temperaturesUtil.numberOfEntries];
        
        int entryIndex = 0;
        
        while (entryIndex < temperaturesUtil.numberOfEntries) {

            Scanner inputInt = new Scanner(System.in);
            System.out.print("Enter temperature entry " + (entryIndex + 1) + ": ");
            try {
                int temperature = inputInt.nextInt();
                temperaturesUtil.temperatureEntries[entryIndex] = temperature;
                entryIndex++;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid temperature entry above 0.");
            }
        }

        temperaturesUtil.calculateAverage();
        temperaturesUtil.findTemperaturesAboveAverage();
    }
}
