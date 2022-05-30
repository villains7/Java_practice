class Circle{
  public static void main(String[] args){
    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    double area;
    
    area = radius * radius * pi;
    
    //小数点第３位以降を切り捨て
    area = (int)(area * 100);//int型にキャストすることで無理やり小数点以下を切り捨てる。今回は小数点第二位まで残すのでかける１００している。
    area = area /100;//かける１００したものを元に戻す。
    System.out.println("半径：" + radius);
    System.out.println("面積：" + area);
  }
}
