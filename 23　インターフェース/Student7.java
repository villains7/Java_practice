public class Student7 implements Englishable {//インターフェースを作成（implements + インターフェース名）
    private String name;
    public Student7(String name) {
        this.name = name;
    }

    public void display() {//インターフェースで実装しているdisplayメソッドを定義している。
        System.out.println("名前:" + name);
    }

    public void displayEng() {
        System.out.println(Englishable.LANGUAGE);
        System.out.println("Name:" + name);
    }
}