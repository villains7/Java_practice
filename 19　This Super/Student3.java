public class Student3 extends Person3 {
    private int stuNo;

    public Student3(String name) {
        this(name,999);//this��Student3�ɕς��C���[�W
    }

    public Student3 (String name, int stuNo) {
        super(name);
        this.stuNo = stuNo;
    }

    public void display() {//�X�[�p�[�N���X��display���\�b�h���I�[�o�[���C�h
        super.display();
        System.out.println("�w�Дԍ�:"+stuNo);
    }
}