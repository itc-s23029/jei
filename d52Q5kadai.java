// s23029
// コマンドライン引数を基にヒストグラムを描画するプログラム

public class d52Q5kadai {
    private static final int LIMIT = 1000;  // 制限値を定義

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("引数が指定されていません。");
            return;
        }

        int max = 0;
        int[] data = new int[args.length];

        // 引数からデータを読み込み、最大値を計算
        for (int i = 0; i < args.length; i++) {
            data[i] = Integer.parseInt(args[i]);
            if (data[i] <= 0 || data[i] >= LIMIT) {
                System.out.println("データが不正です。");
                return;
            }
            if (data[i] > max) {
                max = data[i];
            }
        }

        int majormax = (max - 1) / 5 + 1;
        String majors = "+----";

        // ヒストグラムのヘッダーを表示
        System.out.print("     ");
        for (int i = 0; i < majormax; i++) {
            System.out.print(majors.charAt(i % 5));
        }
        System.out.println("");

        // ヒストグラムを表示
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%4d : ", data[i]);
            int n = (data[i] - 1) / 5;
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}
