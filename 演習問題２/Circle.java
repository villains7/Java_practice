class Circle{
  public static void main(String[] args){
    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    double area;
    
    area = radius * radius * pi;
    
    //�����_��R�ʈȍ~��؂�̂�
    area = (int)(area * 100);//int�^�ɃL���X�g���邱�ƂŖ�����菬���_�ȉ���؂�̂Ă�B����͏����_���ʂ܂Ŏc���̂ł�����P�O�O���Ă���B
    area = area /100;//������P�O�O�������̂����ɖ߂��B
    System.out.println("���a�F" + radius);
    System.out.println("�ʐρF" + area);
  }
}
