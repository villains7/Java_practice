class ArrayBug{
  public static void main(String[] args){
    String[] name = new String[5];
    
    name[0] = "����";
    name[1] = "�c��";
    name[2] = "����";
    name[3] = "���";
    name[4] = "����";
    
    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    System.out.println(name[4]);
  }
}
