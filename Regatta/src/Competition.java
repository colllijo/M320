public class Competition
{
    private String name;
    private Ship[] ships = new Ship[5];


    public Competition(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void addShip(Ship ship)
    {
        for(int i = 0; i < ships.length; i++)
        {
            if (ships[i] == null)
            {
                ships[i] = ship;
                return;
            }
        }
        System.out.println("All spots are already full.");
    }

    public void start()
    {
        for(int i = 0; i < ships.length; i++)
        {
            ships[i].race();
        }
    }

    public void printResult()
    {
        QuickSort.quickSortRaceTimes(ships);

        for(int i = 1; i <= ships.length; i++)
        {
            System.out.println(i + ". is " + ships[i - 1].getOwner().getFirstname() + " " + ships[i - 1].getOwner().getLastname() +
                    " with their ship " + ships[i - 1].getName() + " with a time of " + "00:" + String.format("%2s", ships[i - 1].getTime()/60).replace(" ", "0") + ":" + String.format("%2s", ships[i - 1].getTime()%60).replace(" ", "0") + ".");
        }
    }
}
