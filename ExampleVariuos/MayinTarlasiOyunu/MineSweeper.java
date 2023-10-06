import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int rowSize = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int colSize = scanner.nextInt();

        MineSweeperGame game = new MineSweeperGame(rowSize, colSize);
        game.play();
        scanner.close();
    }
}
