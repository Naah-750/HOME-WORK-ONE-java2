public class Q_two {
    public static void main(String[] args)
    {
        TheStudent stu1 = new TheStudent("khatab",19,2021110);
        TheStudent stu2 = new TheStudent("abdulhakeem",54,010046);
        TheStudent stu3 = new TheStudent("alkhateeb",32,047540);
        TheStudentArray arr = new TheStudentArray();
        arr.addStudent(stu1);
        arr.addStudent(stu2);
        arr.addStudent(stu3);
        System.out.println(arr.toString());
    }
}