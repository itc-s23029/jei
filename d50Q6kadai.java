// s23029
// 指定された範囲内の素数を求め、その素数の数も出力するプログラム

public class d50Q6kadai {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        // minとmaxの値が逆転している場合の入れ替え
        if (max < min) {
            int tmp = max;
            max = min;
            min = tmp;
        }

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.initializePrimeNumbers(max);
        int[] part = primeNumbers.getPart(min, max);

        // 素数の出力
        for (int prime : part) {
            System.out.printf("%d, ", prime);
        }
        System.out.println(); // 改行

        // 素数の数を出力
        System.out.printf("%dから%dまでの素数の数は%d個です%n", min, max, part.length);
    }
}

class PrimeNumbers {
    boolean[] isPrimeNumbers;

    // エラトステネスの篩で素数を求める
    void initializePrimeNumbers(int max) {
        isPrimeNumbers = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrimeNumbers[i] = true;
        }

        // 素数判定
        for (int p = 2; p <= Math.sqrt(max); p++) {
            if (isPrimeNumbers[p]) {
                for (int m = p * 2; m <= max; m += p) {
                    isPrimeNumbers[m] = false;
                }
            }
        }
    }

    // 指定された範囲の素数を取得
    int[] getPart(int min, int max) {
        int count = 0;
        for (int n = min; n <= max; n++) {
            if (isPrimeNumbers[n]) {
                count++;
            }
        }

        int[] part = new int[count];
        int index = 0;
        for (int n = min; n <= max; n++) {
            if (isPrimeNumbers[n]) {
                part[index++] = n;
            }
        }
        return part;
    }
}
