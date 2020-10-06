package vn.techmaster.nqueen;

public class Queens {
    public static final int SIZE = 4; // The size of the chess board
    private int[] queens = {-1, -1, -1, -1};

    public int[] getQueens() {
        return queens;
    }

    /** Search for a solution */
    public int[] search() {
        // k is the current row to be considered
        int k = 0;
        while (k >= 0 && k < SIZE) {
            // Find a position to place a queen in the kth row
            int j = findPosition(k);
            if (j < 0) {
                queens[k] = -1;
                k--; // back track to the previous row
            } else {
                queens[k] = j;
                k++;
            }
        }

        if (k == -1)
            return queens; // No solution
        else {
            //print(queens);
            return queens; // A solution is found
        }
    }

    public int findPosition(int k) {
        int start = queens[k] + 1; // Search for a new placement

        for (int j = start; j < SIZE; j++) {
            if (isValid(k, j))
                return j; // (k, j) is the place to put the queen now
        }

        return -1;
    }

    /** Return true if a queen can be placed at (row, column) */
    public boolean isValid(int row, int column) {
        for (int i = 1; i <= row; i++)
            if (queens[row - i] == column // Check column
                    || queens[row - i] == column - i // Check upleft diagonal
                    || queens[row - i] == column + i) // Check upright diagonal
                return false; // There is a conflict
        return true; // No conflict
    }

    private void print(int[] arr) {
        for (int item : arr)
            System.out.print(item + "\t");
    }
}
