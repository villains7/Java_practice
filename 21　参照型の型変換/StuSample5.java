public class StuSample5 {
    public static void main (String[] args) {
        Student5 stu1 = new Student5("����",1);
        Person5 psn = stu1;//�T�u����X�[�p�[�ւ̕ϊ��̂��ߎ���
        psn.display();
        //psn.chgStuNo(1001);

        /* �⑫�Finstanceof�L�[���[�h
       �I�u�W�F�N�g�̃N���X����肷��
       �ΏۃI�u�W�F�N�g instanceof �N���X�� */

       if (psn instanceof Student5) {
           Student5 stu2 = (Student5)psn;
           stu2.chgStuNo(1001);
           stu.display();
       }
    }
}
