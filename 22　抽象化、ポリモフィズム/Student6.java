public class Student6 {
    private String name; //����
    private Club club;  //Club�I�u�W�F�N�g
    public Student6(String name, Club club){
        this.name = name;
        this.club = club;
    }

    public void display() {
        System.out.println("���O : " + name);
        club.display();
    }

    public void practice() {
        club.practice();//�N���u�̃��\�b�h���Ăяo���Ă���
    }
}