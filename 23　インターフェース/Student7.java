public class Student7 implements Englishable {//�C���^�[�t�F�[�X���쐬�iimplements + �C���^�[�t�F�[�X���j
    private String name;
    public Student7(String name) {
        this.name = name;
    }

    public void display() {//�C���^�[�t�F�[�X�Ŏ������Ă���display���\�b�h���`���Ă���B
        System.out.println("���O:" + name);
    }

    public void displayEng() {
        System.out.println(Englishable.LANGUAGE);
        System.out.println("Name:" + name);
    }
}