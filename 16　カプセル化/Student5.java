public class Student5 {
    private String name;
    private int score;
    //privateを設定すれば大人数の開発でも思い通りにシステムが作れる。ほかのクラスでは使えないから、修正するときも楽。

    public Student5(String n) {
        name = n;
    }

    public void setScore(int s) {//値が正しいか確認する。
        if (0 <= s && s <= 100) {
            score = s;
        } else {
            System.out.println(name + "さんの点数が範囲外です");
        }
    }
    void display() {
        System.out.println(name + "さん:" + score + "点");
    }
}