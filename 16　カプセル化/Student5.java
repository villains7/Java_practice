public class Student5 {
    private String name;
    private int score;
    //private��ݒ肷��Α�l���̊J���ł��v���ʂ�ɃV�X�e��������B�ق��̃N���X�ł͎g���Ȃ�����A�C������Ƃ����y�B

    public Student5(String n) {
        name = n;
    }

    public void setScore(int s) {//�l�����������m�F����B
        if (0 <= s && s <= 100) {
            score = s;
        } else {
            System.out.println(name + "����̓_�����͈͊O�ł�");
        }
    }
    void display() {
        System.out.println(name + "����:" + score + "�_");
    }
}