public class Divide2{
  public static void main(String[] args){
    try{//�ʏ폈��
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println("�v�Z�J�n");
      System.out.println("a / b = " + (a / b) + " ���܂� " + (a % b));
      System.out.println("�v�Z�I��");
    }catch(ArrayIndexOutOfBoundsException e){//�v�f�������Ȃ������ꍇ
      System.out.println("�Q�̐��l����͂��Ă�������");
      System.out.println("�ڍׁF" + e.getMessage());
      e.printStackTrace();
    }catch(Exception e){//�X�[�p�[�N���X�̗�O
      System.out.println("��O���������܂���");
      System.out.println("�ڍׁF" + e.getMessage());
      e.printStackTrace();
    }finally{
      System.out.println("�v���O�������I�����܂�");
    }
  }
}