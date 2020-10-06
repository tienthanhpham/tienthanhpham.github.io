package vn.techmaster.nqueen;

public class Queen {
    public int[] x = new int[16];
    private boolean place(int k, int i) {
        for (int j = 1; j <= k - 1; j++)
            if ((x[j-1] == i) ||
                    (Math.abs(x[j-1] - i) == Math.abs(j - k)))
                return false;
            return true;
    }

    public void nQueen(int k, int n) {
        for (int i = 1; i <= n; i++) {
            if (place(k, i)) {
                x[k-1] = i;
                if (k == n) {
                    print(x);
                } else
                    nQueen(k + 1, n);
            }
        }
    }

    private void print(int[] arr) {
        int count = 0;
        for (int item : arr) {
            if (item != 0) {
                System.out.print(item + "\t");
                count++;
                if (count == 4)
                    System.out.println();
            }
        }
    }
}
