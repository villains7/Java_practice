class Student2 {
    String name;
    int engScore;
    int mathScore;

    void setData(String n){
        name = n;
    }

    void setData(String n, int e, int m){
        name = n;
        engScore = e;
        mathScore =m;
    }

    void setScore(int e, int m) {
        engScore = e;
        mathScore =m;
    }

    void display() {
        System.out.println(name + "����");
        System.out.println("�p��" + engScore +"�_�E���w"+ mathScore +"�_");
    }
}