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

    // computes the dot-product of a square matrix
    public static double[][] matrixDotProduct(double[][] matrix) {
        double[][] dotProductMatrix = new double[matrix.length][matrix.length];
        int size = dotProductMatrix.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; j < size; j++) {
                    dotProductMatrix[i][j] += matrix[i][k] * matrix[k][j];
                }
            }
        }

        return dotProductMatrix;
    }

    public static void main(String[] args) {
        double[] a = new double[4];
        double[][] matrix = new double[2][2]; // a 2x2 matrix

        a[0] = 5.0;
        a[1] = 5.4;
        a[2] = 5.3;
        a[3] = 5.2;

        matrix[0][0] = 1.2;
        matrix[0][1] = 3.3;
        matrix[1][0] = 4.2;
        matrix[1][1] = 2.4;

        System.out.println(findMax(a));
        System.out.println(findSum(a));
        System.out.println(findAverage(a));

        System.out.println();
        double[] aReversedArray = reverseArray(a);
        double[][] dotProductArray = matrixDotProduct(matrix);

        for (double i : aReversedArray) {
            System.out.println(i);
        }

        System.out.println();

        for (double[] doubles : dotProductArray) {
            for (int j = 0; j < dotProductArray.length; j++) {
                System.out.println(doubles[j]);
            }
        }
    }
}
