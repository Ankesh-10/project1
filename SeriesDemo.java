/*Design an interface called Series with the following methods
i) getNext (returns the next number in series)
ii) reset(to restart the series)
iii) setStart (to set the value from which the series should start)
Design a class named ByTwos that implements Series such that it generates a series
of numbers, each two greater than the previous one. Also design a class which will
include the main method for referencing the interface.*/
// Series.java
interface Series {
    int getNext();      // Returns the next number in series
    void reset();       // To restart the series
    void setStart(int start);  // To set the starting value
}// ByTwos.java
 class ByTwos implements Series {
    private int start;
    private int current;
    
    public ByTwos() {
        this.start = 0;
        this.current = 0;
    }
    
    @Override
    public int getNext() {
        current += 2;
        return current;
    }
    
    @Override
    public void reset() {
        current = start;
    }
    
    @Override
    public void setStart(int start) {
        this.start = start;
        this.current = start;
    }
}// SeriesDemo.java
public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();
        
        // Demonstrate the Series interface methods
        System.out.println("Starting series from default (0):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value: " + byTwos.getNext());
        }
        
        System.out.println("\nResetting the series:");
        byTwos.reset();
        for (int i = 0; i < 3; i++) {
            System.out.println("Next value: " + byTwos.getNext());
        }
        
        System.out.println("\nSetting start to 10:");
        byTwos.setStart(10);
        for (int i = 0; i < 4; i++) {
            System.out.println("Next value: " + byTwos.getNext());
        }
        
        System.out.println("\nResetting after start was set to 10:");
        byTwos.reset();
        System.out.println("Next value after reset: " + byTwos.getNext());
    }
}