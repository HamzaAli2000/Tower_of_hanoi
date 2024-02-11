public class App {
    public static void main(String[] args) {
        TowerOfHanoi hanoi = new TowerOfHanoi(10);
        hanoi.moveDisks(10, hanoi.getSource(), hanoi.getTarget(), hanoi.getAuxiliary());
    }
}
