public class Divide2{
  public static void main(String[] args){
    try{//通常処理
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println("計算開始");
      System.out.println("a / b = " + (a / b) + " あまり " + (a % b));
      System.out.println("計算終了");
    }catch(ArrayIndexOutOfBoundsException e){//要素数が少なかった場合
      System.out.println("２つの数値を入力してください");
      System.out.println("詳細：" + e.getMessage());
      e.printStackTrace();
    }catch(Exception e){//スーパークラスの例外
      System.out.println("例外が発生しました");
      System.out.println("詳細：" + e.getMessage());
      e.printStackTrace();
    }finally{
      System.out.println("プログラムを終了します");
    }
  }
}