public class TheStudent {
    int ID;
    String Name;
    int AGE;

    public TheStudent(String Name, int AGE, int ID)
    {
        this.Name = Name;
        this.AGE = AGE;
        this.ID = ID;
    }
    public int getID()
    {
        return ID;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public int getAge()
    {
        return AGE;
    }
    public void setAge(int AGE)
    {
        this.AGE = AGE;
    }
}

