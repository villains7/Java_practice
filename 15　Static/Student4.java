class Student4 {
    String name;
    static int counter = 0; //������C���X�^���X�̐��𐔂���

    Student4(String n) {
        name = n;
        counter++;
        System.out.println(name + "������C���X�^���X�����܂����B");
    }

    static void display() {
        System.out.println(counter + "�l�ł�");
    }
}