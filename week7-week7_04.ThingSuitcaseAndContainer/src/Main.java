
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        int index = 0;
        while(index < 100) {
            Thing brick = new Thing("Brick", index+1);
            Suitcase suitcase = new Suitcase(101);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            index++;
        }
    }

}
