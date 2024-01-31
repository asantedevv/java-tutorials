public class Fibonacci {
    // Print out the Fibonacci sequence for values < 50
    public static void main(String[] args) {
        int low = 1;

        int high = 1;

        System.out.println(low);
        while (high < 50) {
            System.out.println(high);
            high = low + high;  // new high
            low = high - low;   /* new low is (sum - old low)
                                   that is, the old high */
        }
    }
}
