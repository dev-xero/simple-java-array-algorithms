public class SimpleArrayAlgorithms {

    public static double findMax(double[] a) {
        double max = a[0];

        for (double i : a) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    public static double findSum(double[] a) {
        double sum = 0.0;

        for (double i : a) {
            sum += i;
        }

        return sum;
    }

    public static double findAverage(double[] a) {
        double sum = findSum(a);
        int length = a.length;

        return sum / length;
    }

    // This method works most effectively on an even-sized array
    public static double[] reverseArray(double[] a) {
        double[] reversedArray = new double[a.length];
        int size = a.length;

        for (int i = 0; i < size / 2; i++) {
            double temp = a[i];
            reversedArray[i] = a[size - 1 - i];
            reversedArray[size - 1 - i] = temp;
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        double[] a = new double[4];

        a[0] = 5.0;
        a[1] = 5.4;
        a[2] = 5.3;
        a[3] = 5.2;

        System.out.println(findMax(a));
        System.out.println(findSum(a));
        System.out.println(findAverage(a));

        System.out.println();
        double[] aReversedArray = reverseArray(a);

        for (double i : aReversedArray) {
            System.out.println(i);
        }
    }
}
