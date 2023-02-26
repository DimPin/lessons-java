// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. 
// Пример вывода доски 8x8

// 0x000000
// 0000x000
// 00x00000

public class Program3 {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        board[0][0] = 1;
        board[1][6] = 1;
        board[2][4] = 1;
        board[3][7] = 1;
        board[4][1] = 1;
        board[5][3] = 1;
        board[6][5] = 1;
        board[7][2] = 1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }

        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < board.length; k++) {
                        if (board[i][k] == 1 && k != j) {
                            result = false;
                        }
                    }
                    for (int k1 = 0; k1 < board.length; k1++) {
                        if (board[k1][j] == 1 && k1 != i) {
                            result = false;
                        }
                    }
                    int k2 = i;
                    int k3 = j;
                    while (k2 < board.length && k3 < board.length) {
                        if (board[k2][k3] == 1 && (k2 != i && k3 != j)) {
                            result = false;
                        }
                        k2++;
                        k3++;
                    }
                    k2 = i;
                    k3 = j; 
                    while (k2 > 0 && k3 > 0) {
                        if (board[k2][k3] == 1 && (k2 != i && k3 != j)) {
                            result = false;
                        }
                        k2--;
                        k3--;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
