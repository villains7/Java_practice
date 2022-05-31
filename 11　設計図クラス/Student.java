class Student {//Studentという設計図
    //メンバ変数（属性）クラス定義のすぐ下に書くこと
    String name;
    int engScore;
    int mathScore;

    //メソッド（操作）
    void display (){
        System.out.println(name + "さん");
        System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
    }
    void setScore (int eng, int math){//引数にはデータ型、変数名で宣言をすること
        engScore = eng;
        mathScore = math;
    }

    double getAvg(){
        double avg = (engScore + mathScore) / 2.0;
        return avg;//戻り値のデータ型と合わせる合わせないとコンパイルエラーが起こる
    }
}