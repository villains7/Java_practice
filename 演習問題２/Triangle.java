class Triangle{
  public static void main(String[] args){
    int height = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);
    int area;
    
    //�ʐς̌v�Z
    area = height*width /2;
    //�����E���E�ʐς̕\��
    System.out.println("����:" + height);
    System.out.println("��:" + width);
    System.out.println("�ʐ�:" + area);
  }
}
