import java.util.Random;
import java.util.Scanner;

public class MineSweeperGame {
    private int rowSize;
    private int colSize;
    private int[][] board;
    private boolean[][] revealed;
    private int mineCount;

    public MineSweeperGame(int rowSize, int colSize) {
        this.rowSize = rowSize;
        this.colSize = colSize;
        this.board = new int[rowSize][colSize];
        this.revealed = new boolean[rowSize][colSize];
        this.mineCount = (rowSize * colSize) / 4;
        placeMines();
    }

    private void placeMines() {
        Random random = new Random();
        int minesPlaced = 0;

        while (minesPlaced < mineCount) {
            int row = random.nextInt(rowSize);
            int col = random.nextInt(colSize);

            if (board[row][col] != -1) {
                board[row][col] = -1;
                minesPlaced++;
            }
        }
    }

    private boolean isValidPoint(int row, int col) {
        return row >= 0 && row < rowSize && col >= 0 && col < colSize;
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        int[][] directions = {
                { -1, -1 }, { -1, 0 }, { -1, 1 },
                { 0, -1 }, { 0, 1 },
                { 1, -1 }, { 1, 0 }, { 1, 1 }
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isValidPoint(newRow, newCol) && board[newRow][newCol] == -1) {
                count++;
            }
        }

        return count;
    }

    private void printBoard() {
        System.out.println("Mayın Tarlası Oyunu");
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                if (revealed[row][col]) {
                    if (board[row][col] == -1) {
                        System.out.print("X "); // Mayın
                    } else {
                        System.out.print(board[row][col] + " ");
                    }
                } else {
                    System.out.print(". "); // Henüz seçilmemiş
                }
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        while (!gameOver) {
            printBoard();
            System.out.print("Satırı seçin (0 - " + (rowSize - 1) + "): ");
            int row = scanner.nextInt();
            System.out.print("Sütunu seçin (0 - " + (colSize - 1) + "): ");
            int col = scanner.nextInt();

            if (!isValidPoint(row, col) || revealed[row][col]) {
                System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                continue;
            }

            if (board[row][col] == -1) {
                gameOver = true;
                System.out.println("Oyunu kaybettiniz! Mayına bastınız.");
            } else {
                revealed[row][col] = true;
                int adjacentMines = countAdjacentMines(row, col);
                if (adjacentMines == 0) {
                    revealEmptyCells(row, col);
                }
                if (checkWin()) {
                    gameOver = true;
                    System.out.println("Tebrikler! Oyunu kazandınız.");
                }
            }
        }
        scanner.close();
    }

    private void revealEmptyCells(int row, int col) {
        int[][] directions = {
                { -1, -1 }, { -1, 0 }, { -1, 1 },
                { 0, -1 }, { 0, 1 },
                { 1, -1 }, { 1, 0 }, { 1, 1 }
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isValidPoint(newRow, newCol) && !revealed[newRow][newCol]) {
                revealed[newRow][newCol] = true;
                int adjacentMines = countAdjacentMines(newRow, newCol);
                if (adjacentMines == 0) {
                    revealEmptyCells(newRow, newCol);
                }
            }
        }
    }

    private boolean checkWin() {
        int unrevealedCount = 0;
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                if (!revealed[row][col] && board[row][col] != -1) {
                    unrevealedCount++;
                }
            }
        }
        return unrevealedCount == mineCount;
    }
}
