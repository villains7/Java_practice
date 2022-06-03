class StuSample4 {
    public static void main(String[] args) {
        Student4.display();//staticメソッドを使ったので、インスタンスが作られていなくてもメソッドが呼び出せる。
        Student4 stu1 = new Student4("佐野");
        Student4.display();//staticをつけたのでクラス名.メソッド名になっている。

        Student4 stu2 = new Student4("岩城");
        Student4.display();
    }
}