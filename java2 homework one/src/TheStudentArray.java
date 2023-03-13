import java.util.ArrayList;
public class TheStudentArray
{
    TheStudent stu;
    ArrayList<TheStudent> STD = new ArrayList<>();
    public void addStudent(TheStudent x)
    {
        STD.add(x);
    }
    @Override
    public String toString()
    {
        return "The Students= " + STD;
    }
}