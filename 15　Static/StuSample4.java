class StuSample4 {
    public static void main(String[] args) {
        Student4.display();//static���\�b�h���g�����̂ŁA�C���X�^���X������Ă��Ȃ��Ă����\�b�h���Ăяo����B
        Student4 stu1 = new Student4("����");
        Student4.display();//static�������̂ŃN���X��.���\�b�h���ɂȂ��Ă���B

        Student4 stu2 = new Student4("���");
        Student4.display();
    }
}