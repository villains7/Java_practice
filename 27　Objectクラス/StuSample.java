public class StuSample{
    public static void main(String[] args){
        Student stu1 = new Student("����");
        Student stu2 = new Student("����");

        boolean result = stu1.equals(stu2);
        System.out.println(result);
        System.out.println(stu1);
    }
}
   