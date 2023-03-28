package cinema;

import java.util.Arrays;

public class TextUI {

    private final int ROWS;
    private final int COLS;
    private final char[][] SEATS;

    public TextUI(int ROWS, int COLS) {
        this.ROWS = ROWS;
        this.COLS = COLS;
        this.SEATS = new char[ROWS][COLS];
    }

    public char[][] getSEATS() {
        return SEATS;
    }

    public void bookSEATS(int rowBook, int seatBook) {
        this.SEATS[rowBook - 1][seatBook - 1] = 'B';
    }


    public void setSeatsArray() {
        for (char[] row : SEATS) {
            Arrays.fill(row, 'S');
        }
    }

    public void printRoom() {
        System.out.println();
        System.out.print("Cinema:\n ");

        for (int i = 1; i <= COLS; ++i) {
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 0; i < ROWS; ++i) {
            System.out.print(i + 1);
            for (int j = 0; j < COLS; ++j) {
                System.out.print(" " + SEATS[i][j]);
            }
            System.out.println();
        }
    }

    public int getROWS() {
        return ROWS;
    }

    public int getCOLS() {
        return COLS;
    }
}
