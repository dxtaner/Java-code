public class MineSweeperUtils {
    // Rastgele bir sayı üretme işlevi
    public static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
}
