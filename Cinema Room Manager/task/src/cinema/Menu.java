package cinema;

import static cinema.Cinema.sc;

public class Menu {
    private final TextUI cinema;
    private final TicketPrice price;
    private boolean isExit = false;
    private int numberOfTickets;
    private int currentIncome;


    public Menu(TextUI cinema, TicketPrice price) {
        this.cinema = cinema;
        cinema.setSeatsArray();
        this.price = price;
    }

    public void start() {
        while (!isExit) {
            System.out.println("\n1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            int answer = sc.nextInt();
            switch (answer) {
                case 1 -> cinema.printRoom();
                case 2 -> buyingTicket();
                case 3 -> callStatistics();
                case 0 -> isExit = true;
            }
        }
    }

    public void buyingTicket() {
        do {
            System.out.println("\nEnter a row number:");
            int rowBook = sc.nextInt();
            System.out.println("Enter a seat number in that row:");
            int seatBook = sc.nextInt();
            char[][] seats = cinema.getSEATS();
            if (cinema.getROWS() < rowBook || cinema.getCOLS() < seatBook) {
                System.out.println("Wrong input!");
            } else if (seats[rowBook - 1][seatBook - 1] == 'B') {
                System.out.println("That ticket has already been purchased!");
            } else {
                currentIncome += price.calculatePriceOfTicket(rowBook);
                cinema.bookSEATS(rowBook, seatBook);
                numberOfTickets++;
                break;
            }
        } while (true);
    }

    public void callStatistics() {
        displayTickets();
        displayPercentage();
        currentIncome();
        totalIncome();
    }

    private void displayTickets() {
        System.out.printf("Number of purchased tickets: %d\n", numberOfTickets);
    }

    private void displayPercentage() {
        double percentage = (100 * numberOfTickets) / (double) price.getTotalSeats();
        System.out.printf("Percentage: %.2f", percentage);
        System.out.println("%");
    }

    private void currentIncome() {
        System.out.printf("Current income: $%d\n", currentIncome);
    }

    private void totalIncome() {
        int firstHalf;
        int secondHalf;

        if (price.getTotalSeats() < 60) {
            System.out.printf("Total income: $%d\n", price.getTotalSeats() * price.getDefaultPrice());
        } else {
            if (cinema.getROWS() % 2 == 0) {
                firstHalf = cinema.getROWS() / 2;
            } else {
                firstHalf = (cinema.getROWS() - 1) / 2;
            }
            secondHalf = cinema.getROWS() - firstHalf;
            int firstPrice = firstHalf * cinema.getCOLS() * price.getDefaultPrice();
            int secondPrice = secondHalf * cinema.getCOLS() * price.getDiscountedPrice();
            System.out.printf("Total income: $%d\n", firstPrice + secondPrice);
        }
    }
}
