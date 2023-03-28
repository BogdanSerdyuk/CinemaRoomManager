package cinema;

public class TicketPrice {

    private final int ROWS;
    private final int COLS;
    private final int totalSeats;
    private final int defaultPrice = 10;
    private final int discountedPrice = 8;


    public TicketPrice(int ROWS, int COLS) {
        this.ROWS = ROWS;
        this.COLS = COLS;
        this.totalSeats = ROWS * COLS;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getDefaultPrice() {
        return defaultPrice;
    }

    public int getDiscountedPrice() {
        return discountedPrice;
    }

    public int calculatePriceOfTicket(int rowBook) {
        int totalSeats = ROWS * COLS;
        int firstHalf;

        if (totalSeats < 60) {
            System.out.printf("Ticket price: $%d\n", defaultPrice);
            return defaultPrice;
        } else {
            if (ROWS % 2 == 0) {
                firstHalf = ROWS / 2;
            } else {
                firstHalf = (ROWS - 1) / 2;
            }
        }

        if (rowBook > firstHalf) {
            System.out.printf("Ticket price: $%d\n", discountedPrice);
            return discountedPrice;
        } else {
            System.out.printf("Ticket price: $%d\n", defaultPrice);
            return defaultPrice;
        }
    }
}
