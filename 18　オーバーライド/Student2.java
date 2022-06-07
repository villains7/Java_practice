public class Student2 extends Person2 {
    private int stuNo;

    public void setStuNo(int s) {
        stuNo = s;
    }
    public void display() {//Personクラスのdisplayメソッドを上書きしている。
        System.out.println("名前:" + getName());//nameはPerson内でしか使えないため、メソッドを呼び出している
        System.out.println("学籍番号:" + stuNo);
    }
}