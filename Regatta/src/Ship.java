public class Ship
{
    private int nr;
    private String name;
    private int time;
    private Person owner;

    public Ship(int nr, String name, Person owner)
    {
        this.nr = nr;
        this.name = name;
        this.owner = owner;
    }

    public int getNr()
    {
        return nr;
    }

    public void setNr(int nr)
    {
        this.nr = nr;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getTime()
    {
        return time;
    }

    public void race()
    {
        time = (int)((Math.random() * 301) + 300);
    }

    public Person getOwner()
    {
        return owner;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }
}