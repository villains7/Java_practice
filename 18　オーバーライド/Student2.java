public class Student2 extends Person2 {
    private int stuNo;

    public void setStuNo(int s) {
        stuNo = s;
    }
    public void display() {//Person�N���X��display���\�b�h���㏑�����Ă���B
        System.out.println("���O:" + getName());//name��Person���ł����g���Ȃ����߁A���\�b�h���Ăяo���Ă���
        System.out.println("�w�Дԍ�:" + stuNo);
    }
}