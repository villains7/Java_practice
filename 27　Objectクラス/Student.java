public class Student {//extends Objectが隠れてる。
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public String toString() {
        return "私の名前は" + name + "です";
    }
}