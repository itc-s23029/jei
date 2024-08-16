// s23029
// Temperクラスの温度を設定し、ゲッターを使って値を出力するプログラム

class Temper {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

public class d52Q2kadai {
    public static void main(String[] args) {
        Temper t = new Temper();

        // 温度を設定する
        t.setTemperature(17.2);

        // ゲッターを使って温度を取得し、表示する
        double temp = t.getTemperature();
        System.out.println(temp);
    }
}
