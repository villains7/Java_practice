class Student {//Student�Ƃ����݌v�}
    //�����o�ϐ��i�����j�N���X��`�̂������ɏ�������
    String name;
    int engScore;
    int mathScore;

    //���\�b�h�i����j
    void display (){
        System.out.println(name + "����");
        System.out.println("�p��" + engScore + "�_�E���w" + mathScore + "�_");
    }
    void setScore (int eng, int math){//�����ɂ̓f�[�^�^�A�ϐ����Ő錾�����邱��
        engScore = eng;
        mathScore = math;
    }

    double getAvg(){
        double avg = (engScore + mathScore) / 2.0;
        return avg;//�߂�l�̃f�[�^�^�ƍ��킹�鍇�킹�Ȃ��ƃR���p�C���G���[���N����
    }
}