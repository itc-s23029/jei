// s23029
// コマンドライン引数で与えられた整数をソートし、途中経過と最終結果を出力するプログラム

public class d50Q5kadai {
    public static void main(String[] args) {
        int[] num = new int[args.length];

        // コマンドライン引数を整数に変換して配列に格納
        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        // 挿入ソートによる配列のソートと途中経過の出力
        int tmp;
        for (int i = 1; i < num.length; i++) {
            for (int j = i - 1; j >= 0 && num[j] > num[j + 1]; j--) {
                tmp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = tmp;
            }
            // ソート途中の配列内容を出力
            System.out.print("ソート途中:");
            for (int val : num) {
                System.out.print(val + " ");
            }
            System.out.println(); // 改行を追加
        }

        // ソート結果の出力
        System.out.println("-------------------");
        System.out.print("ソート結果:");
        for (int val : num) {
            System.out.print(val + " ");
        }
        System.out.println(); // 改行を追加
    }
}
