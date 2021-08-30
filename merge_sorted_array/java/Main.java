import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

//        int[] nums1 = new int[]{1};
//        int m = 1;
//        int[] nums2 = new int[]{};
//        int n = 0;

//        int[] nums1 = new int[]{0};
//        int m = 0;
//        int[] nums2 = new int[]{1};
//        int n = 1;

        int[] result = main.merge(nums1, m, nums2, n);
        for (int a : result) {
            System.out.println(a);
        }

    }

    protected int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int x1 = 0, x2 = 0;
        int[] result = new int[m + n];
        for (int i = 0; i < m + n; i++) {
            Integer var1 = m > x1 ? nums1[(x1)] : null;
            Integer var2 = n > x2 ? nums2[(x2)] : null;
            if ((Objects.nonNull(var1) && Objects.nonNull(var2) && var1 <= var2) ||
                    (Objects.nonNull(var1) && Objects.isNull(var2))) {
                result[i] = var1;
                x1++;
            } else {
                result[i] = var2;
                x2++;
            }
        }
        return result;
    }

}
