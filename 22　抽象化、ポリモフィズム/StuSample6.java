public class StuSample6 {
    public static void main(String[] args){
        TandF taf = new TandF("���㋣�Z��");
        Football fb = new Football("�T�b�J�[��");

        Student6 stu1 = new Student6("����",taf);
        stu1.display();
        stu1.practice();

        Student6 stu2 = new Student6("���",fb);
        stu2.display();
        stu2.practice();
    }
}