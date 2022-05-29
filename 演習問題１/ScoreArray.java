class ScoreArray{
  public static void main(String[] args){
    //配列の生成
    int[] score = new int[4];
    
    //配列に値を代入
    score[0] = 90;
    score[1] = 80;
    score[2] = 100;
    score[3] = 90;
    //値を表示
    System.out.println("1人目は" + score[0] + "点");
    System.out.println("2人目は" + score[1] + "点");
    System.out.println("3人目は" + score[2] + "点");
    System.out.println("4人目は" + score[3] + "点");
  }
}
