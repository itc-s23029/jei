// s23000 d51Q6kadai.java
// 商品コードから大分類名、小分類名、詳細コードを取得するプログラム

public class d51Q6kadai {
    public static void main(String[] args) {
        // 大分類と小分類のアイテムを定義
        Item[] majorItems = {
                new Item("AA", "魚類"),
                new Item("BB", "肉類")
        };
        Item[] minorItems = {
                new Item("A1", "さば"),
                new Item("A2", "さんま"),
                new Item("B1", "牛肉"),
                new Item("B2", "鶏肉"),
                new Item("B3", "豚肉"),
                new Item("B4", "加工肉")  // 新しい小分類アイテムを追加
        };

        // ItemMasterインスタンスを作成
        ItemMaster im = new ItemMaster(majorItems, minorItems);

        // コマンドライン引数からコードを取得
        String fullCode = args[0];
        String majorCode = fullCode.substring(0, 2);
        String minorCode = fullCode.substring(2, 4);
        String details = fullCode.substring(4);

        // 大分類名と小分類名を取得
        String majorName = im.getItemName(im.MAJOR, majorCode);
        String minorName = im.getItemName(im.MINOR, minorCode);

        // 出力結果を表示
        System.out.println("商品コード：" + fullCode);
        System.out.println("大分類名：" + majorName);
        System.out.println("小分類名：" + minorName);
        System.out.println("詳細コード：" + details);
    }
}

class Item {
    private String code;
    private String name;

    Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
}

class ItemMaster {
    public static final int MAJOR = 0;
    public static final int MINOR = 1;
    private Item[][] items;

    ItemMaster(Item[] major, Item[] minor) {
        items = new Item[2][];
        items[MAJOR] = major;
        items[MINOR] = minor;
    }

    public String getItemName(int codeLevel, String code) {
        for (Item item : items[codeLevel]) {
            if (code.equals(item.getCode())) {
                return item.getName();
            }
        }
        return null;
    }
}
