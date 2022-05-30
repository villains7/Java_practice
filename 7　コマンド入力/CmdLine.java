class CmdLine{//コンパイル後に文字を入力してそれを表示させるプログラム
    public static void main (String[] args) { //文字列の配列を作るという意味args入力データを受け取るString型の配列
        System.out.println("args[0]: " + args[0]);
        System.out.println("args[1]: " + args[1]);
        System.out.println("args.length: " + args.length);
    }
}