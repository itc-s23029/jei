// s23029
// Java 12以降の「->」演算子を使ってswitch文を実装するプログラム

public class d51Q26kadai {
    public static void main(String[] args) {
        int n = 1;
        String s;
        switch (n) {
            case 1 -> s = "one";
            case 2 -> s = "two";
            default -> s = "?";
        }
        System.out.println(s);
    }
}
