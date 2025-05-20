package Assignment_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ReservationSystem {

    List<String> reservedSeats = new ArrayList<>();
    SeatingChart seatingChart = new SeatingChart();
    boolean systemRunning = true;
    public void returnToMenu() {
        Scanner returnToMenu = new Scanner(System.in);
        System.out.println("Would you like to return to the main menu? (Y/N)");
        String response = returnToMenu.nextLine();
        if (response.equalsIgnoreCase("Y")) {
            runSystem();
        } else if (response.equalsIgnoreCase("N")) {
            System.out.println("Thank you for using the Code Theater seat reservation system! Good bye!");
            systemRunning = false;
        } else {
            System.out.println("Invalid response. Please try again.");
        }
    }

    public void runSystem() {


        while (systemRunning) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to the Code Theater seat reservation system!");
            System.out.println("Please choose from the following options:");
            System.out.println("1. View seating chart");
            System.out.println("2. Reserve a seat");
            System.out.println("3. Cancel a reservation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            boolean validInput = false;
            while (!validInput) {
                switch (choice) {
                    case 1:
                        seatingChart.displaySeatingChart(reservedSeats);
                        validInput = true;
                        System.out.println(" ");
                        returnToMenu();
                        break;
                    case 2:
                        Scanner selectSeat = new Scanner(System.in);
                        System.out.println("Please enter the seat you want to reserve (A1-J10): ");
                        String seat = selectSeat.nextLine();
                        String regex = "^[A-J](10|[1-9])$";
                        Pattern pattern = Pattern.compile(regex);
                        Matcher matcher = pattern.matcher(seat);
                        if (!matcher.matches()) {
                            System.out.println("Invalid seat selection. Please try again.");
                            break;
                        }
                        System.out.println("Seat " + seat + " has been reserved!");
                        reservedSeats.add(seat);
                        validInput = true;
                        returnToMenu();
                        break;
                    case 3:
                        boolean validCancelInput = false;
                        while (!validCancelInput) {
                            System.out.println("Your Reserved Seats:");
                            for (String reservedSeat : reservedSeats) {
                                System.out.println(reservedSeat + " ");
                            }
                            System.out.println("Please select which reserved seat you would like to cancel:");
                            Scanner input = new Scanner(System.in);
                            String seatToCancel = input.nextLine();
                            if (reservedSeats.contains(seatToCancel)) {
                                reservedSeats.remove(seatToCancel);
                                System.out.println("Seat " + seatToCancel + " has been canceled!");
                                validCancelInput = true;
                                returnToMenu();
                            } else {
                                System.out.println("Seat " + seatToCancel + " is not reserved.");
                            }
                        }
                        validInput = true;

                        break;
                    case 4:
                        // Exit
                        break;
                    default:
                        System.out.println("Invalid choice");

                    }
            }

        }
    }

    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        reservationSystem.runSystem();
    }
}
//    System.out.println("Please enter the seat you want to reserve: ");
