public class Student5 extends Person5 {
    private int stuNo;

    public Student5(String name, int stuNo){
        super(name);
        this.stuNo = stuNo;
    }

    public void display() {
        super.display();//�p�[�\���N���X��display���\�b�h
        System.out.println("�w�Дԍ�:" + stuNo);
    }

    public void chgStuNo(int stuNo){
        this.stuNo = stuNo;
    }
}