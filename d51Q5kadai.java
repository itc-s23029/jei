//s23029
//コマンドラインで実数値として指定された今月のガス使用量(単位 : m³。以下、使用量という)を受け取り、ガス料金を計算して表示するプログラムである。なお、今月の使用量が0.0m³になることもある。

public class d51Q5kadai {
	public static void main(String[] args){
		double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE};
		double[] unit = {0.0, 2.0, 3.0, 5.0};
		int[] rate = {0, 20, 18, 15};
		if(args.length != 1) {
			System.out.println("引数の個数が不正");
			return;
		}
		double amount = Double.parseDouble(args[0]);
		if(amount < 0.0) {
			System.out.println("0.0以上の使用量を入力");
			return;
		}

		int i, price = 1300;
		for(i = 1; amount >= level[i]; i++) {
			price += (int)((level[i] - level[i - 1]) /unit[i]) * rate[i];
		}
		price += (int) Math.ceil((amount - level[i - 1]) / unit[i])* rate[i];
		System.out.println("今月のガス料金" + price + "円");
	}
}
