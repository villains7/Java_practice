class Branch3 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);//入力された値をint型に変換
        switch (num) {
            case 1 :
                System.out.println("入園料金: 8400円");
                break;//処理から抜け出す
            case 2 :
                System.out.println("入園料金: 7000円");
                break;
            case 3 :
                System.out.println("入園料金: 5000円");
                break;
            default://条件外の数値が入力された場合
                System.out.println("1:一般,2:中・高校生,3:小学生・幼児");
        }
    }
}