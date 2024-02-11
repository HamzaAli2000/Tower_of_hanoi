import java.util.Stack;
/*
  Made by Hamza Ali
  Tower of Hanoi  is a classic problem in the field of recursion and stack data structure.
*/ 
public class TowerOfHanoi {
    private Stack<Integer> source;
    private Stack<Integer> target;
    private Stack<Integer> auxiliary;

    public TowerOfHanoi() {
        source = new Stack<Integer>();
        target = new Stack<Integer>();
        auxiliary = new Stack<Integer>();

        // Initialize the source stack with some disks
        for (int i = 3; i > 0; i--) {
            source.push(i);
        }
    }

    public TowerOfHanoi(int source) {
        this.source = new Stack<Integer>();
        target = new Stack<Integer>();
        auxiliary = new Stack<Integer>();

        // Initialize the source stack with some disks
        for (int i = source; i > 0; i--) {
            this.source.push(i);
        }
    }

    

    public Stack<Integer> getSource() {
        return source;
    }

    public void setSource(Stack<Integer> source) {
        this.source = source;
    }

    public Stack<Integer> getTarget() {
        return target;
    }

    public void setTarget(Stack<Integer> target) {
        this.target = target;
    }

    public Stack<Integer> getAuxiliary() {
        return auxiliary;
    }

    public void setAuxiliary(Stack<Integer> auxiliary) {
        this.auxiliary = auxiliary;
    }

    public void moveDisks(int n, Stack<Integer> source, Stack<Integer> target, Stack<Integer> auxiliary) {
        if (n > 0) {
            moveDisks(n - 1, source, auxiliary, target);

            // Move the nth disk from the source to the target
            target.push(source.pop());

            // Print the current state of the towers
            printTowers();

            moveDisks(n - 1, auxiliary, target, source);
        }
    }

    public void printTowers() {
        System.out.println("Source: " + source);
        System.out.println("Target: " + target);
        System.out.println("Auxiliary: " + auxiliary);
        System.out.println();
    }

    
}