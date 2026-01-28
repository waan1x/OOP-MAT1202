import java.util.*;

public class Main {

    public static boolean isPerfect(int n) {
        if (n < 6) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static ArrayList<Integer> perfectList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 6; i <= n; i++) {
            if (isPerfect(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            ArrayList<Integer> result = perfectList(n);
            System.out.println(result.size() + ", " + result);
        }

        sc.close();
    }
}