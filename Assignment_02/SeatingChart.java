package Assignment_02;

import java.util.List;
import java.util.ArrayList;

public class SeatingChart {
    public String[][] allSeats = new String[10][10];
    public List<String> reservedSeats = new ArrayList<>();

    public SeatingChart() {
        this.allSeats = new String[10][10];
    }

    public SeatingChart(List<String> reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    private void initializeSeatingChart() {
        for (int i = 0; i < allSeats.length; i++) {
            for (int j = 0; j < allSeats[i].length; j++) {
                allSeats[i][j] = i + "" + j;
            }
        }
    }

    public void displaySeatingChart(List<String> reservedSeats) {
        System.out.print("   ");
        for (int seatNum = 1; seatNum < allSeats.length + 1; seatNum++) {
            System.out.print(seatNum + "  ");
        }
        for (char rowLetter = 'A'; rowLetter <= 'J'; rowLetter++) {
            System.out.println();
            System.out.print(rowLetter + " ");
            for (int seat = 0; seat < allSeats[0].length; seat++) {
                System.out.print("[ ]");
            }
        }
    }
}

