public class Start
{
    public static void main(String[] args)
    {
        Competition comp = new Competition("ShipRace");

        comp.addShip(new Ship(1, "fast", new Person("Liam", "Metzger", "")));
        comp.addShip(new Ship(2, "&", new Person("Kimi", "Schweingruber", "")));
        comp.addShip(new Ship(3, "fourious", new Person("Arunan", "Nagaraja", "")));
        comp.addShip(new Ship(4, "mokey on the bar", new Person("Alessandro", "Hauser", "")));
        comp.addShip(new Ship(5, "mokey on the car", new Person("Levin", "Schaller", "")));

        comp.start();
        comp.printResult();
    }
}
