package hust.soict.dsai.Lab01;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

       
        System.out.println("Nhập ma trận thứ nhất:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

      
        System.out.println("Nhập ma trận thứ hai:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

      
        int[][] result = addMatrices(matrix1, matrix2);

       
        System.out.println("Kết quả của phép cộng hai ma trận:");
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}
