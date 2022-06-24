public class StuSample{
    public static void main(String[] args){
        Student stu1 = new Student("²–ì");
        Student stu2 = new Student("²–ì");

        boolean result = stu1.equals(stu2);
        System.out.println(result);
        System.out.println(stu1);
    }
}
   