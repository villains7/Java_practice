public class Person3 {
    private String name;

    public Person3(String name) {
        this.name = name;//メンバ変数のnameに引数を代入してあげる
    }

    public void display() {
        System.out.println("名前:" + name);
    }
}