// s23029
// コマンドライン引数で与えられた整数に基づいてモードを切り替えるプログラム

public class d50Q27kadai {
    public static void main(String[] args) {
        // コマンドライン引数が指定されていない場合はエラーメッセージを表示して終了
        if (args.length < 1) {
            System.out.println("エラー: コマンドライン引数を指定してください。");
            return;
        }

        // コマンドライン引数を整数に変換
        int control = Integer.parseInt(args[0]);
        String mode;

        switch (control) {
            case 1:
                mode = "Warm";
                break;
            case 2:
                mode = "Cool";
                break;
            case 3:
                mode = "Wind";
                break;
            default:
                mode = "不明なモード";
                break;
        }

        // 結果を出力
        System.out.println(mode);
    }
}
