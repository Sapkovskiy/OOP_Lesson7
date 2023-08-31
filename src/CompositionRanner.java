public class CompositionRanner {
    public static void main(String[] args) {
        Computer computer = new Computer(new Ram(1000), new Ssd(500));
        computer.printState();

    }
}
