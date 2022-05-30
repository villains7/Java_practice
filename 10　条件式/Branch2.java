class Branch2 {
    public static void main (String[] args) {
        int price = Integer.parseInt(args[0]);//コマンドラインに入力された文字列をint型に変える
        double rate = 0.10;
        int discount,amount;

        if (price >= 5000 ){ //値引額の条件設定
            discount = 500;
        }   else if ( price >= 3000 ){
            discount = 300;
        }   else {
            discount = 0;
        }

        amount = (int)((price - discount ) * (1 + rate));
        System.out.println("値引金額:" + discount + "円");
        System.out.println("税込金額:" + amount + "円");
    }
} 