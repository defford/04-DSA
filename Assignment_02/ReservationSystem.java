package Assignment_02;

import java.util.List;
import java.util.Scanner;

public class ReservationSystem {

    List<String> reservedSeats;

    public void runSystem() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to the Code Theater seat reservation system!");
    System.out.println("Please choose from the following options:");
    System.out.println("1. View seating chart");
    System.out.println("2. Reserve a seat");
    System.out.println("3. Cancel a reservation");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");

    int choice = sc.nextInt();
    switch (choice) {
        case 1:
            SeatingChart seatingChart = new SeatingChart();
            seatingChart.displaySeatingChart(reservedSeats);
            break;
        case 2:
            // Reserve a seat
            break;
        case 3:
            // Cancel a reservation
            break;
        case 4:
            // Exit
            break;
        default:
            System.out.println("Invalid choice");

        }
    }

    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        reservationSystem.runSystem();
    }
}
//    System.out.println("Please enter the seat you want to reserve: ");
