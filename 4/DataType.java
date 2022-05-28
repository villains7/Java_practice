class DataType {
    public static void main (String[] args) {
        int month = 12;
        int day = 29;
        float weight = 48.3f; //float型の後には必ずｆつける
        double height = 158.5;
        char bloodType = 'A'; //シングルコーテーションで囲む

        String name = "坂田";

        System.out.println("こんにちは！" + name + "です。");
        System.out.println("身長は" + height + "㎝、体重は" + weight + "kg, ");
        System.out.println("血液型は" + bloodType + "型です。"); 
    }
}