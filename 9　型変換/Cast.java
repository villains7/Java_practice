class Cast {
    public static void main (String [] args) {
        int price = Integer.parseInt(args [0]);//コマンドラインで入力された文字列をint型に変換
        double rate = 0.08; //消費税率８％
        int amount;

        amount = (int) (price * (1 + rate));//double型のrateは64ビットの箱の中に入っている。int型は（32ビット）のためにキャストしている
        System.out.println("税込金額:" + amount + "円");
    }
}