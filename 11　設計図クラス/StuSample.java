class StuSample {//���s�p�̃N���X
    public static void main (String[] args) {
        Student stu1 = new Student();

        stu1.name = "����";
        stu1.setScore(90,80);

        stu1.display();
        System.out.println("����" + stu1.getAvg() +"�_");
    }
}