public class StuSample{
    public static void main(String[] args){
        Student stu1 = new Student("佐野");
        Student stu2 = new Student("佐野");

        boolean result = stu1.equals(stu2);//equalメソッドはインスタンスの住所が同じかどうか比べている。
        System.out.println(result);
        System.out.println(stu1);
    }
}
   