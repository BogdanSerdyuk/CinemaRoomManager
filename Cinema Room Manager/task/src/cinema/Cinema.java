package cinema;

import java.util.Scanner;

public class Cinema {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        int ROWS = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int COLS = sc.nextInt();
        Menu menu = new Menu(new TextUI(ROWS, COLS), new TicketPrice(ROWS, COLS));
        menu.start();
    }
}