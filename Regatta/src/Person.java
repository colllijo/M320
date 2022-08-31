public class Person
{
    private String firstname;
    private String lastname;
    private String residence;

    public Person(String firstname, String lastname, String residenc)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.residence = residenc;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getResidence()
    {
        return residence;
    }

    public void setResidence(String residence)
    {
        this.residence = residence;
    }
}