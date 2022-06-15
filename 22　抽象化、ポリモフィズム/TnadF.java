public class TnadF extends Club {
    public TandF(String name) {//コンストラクタを定義
        super(name);
    }
    public void practice() {//スーパークラスの抽象メソッドを定義
        System.out.println("ウォームアップ");
        System.out.println("インターバル");
        System.out.println("筋肉トレーニング");
    }
}