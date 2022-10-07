package recursion_3;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(findFactorial(3));
        int[] recArr = {1, 2, 3};
        System.out.println(findSum(recArr, recArr.length));
        FindNum.persistence(999);             // 9 * 9 * 9 until lenth 1
    }

    private static int findFactorial(int num) {
        if (num == 1) return num;
        else {
            return num * (findFactorial(num - 1));
        }
    }

    private static int findSum(int[] arr, int n) {     // 1, 2
        if (n<=0) {
            return 0;
        } else {
            return findSum(arr, n-1) + arr[n-1];
        }
    }
}
