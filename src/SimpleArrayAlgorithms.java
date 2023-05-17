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

    public static void main(String[] args) {
        double[] a = new double[5];

        a[0] = 5.0;
        a[1] = 4.4;
        a[2] = 9.8;
        a[3] = 9.6;
        a[4] = 10.5;

        System.out.println(findMax(a));
        System.out.println(findSum(a));

    }
}
