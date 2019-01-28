/**
 * 剑指offer第一题
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Parc1 {
    public static boolean solution(int target,int[][] a){
        int r = 0;
        int c = a[0].length - 1;
        while (r <= a.length - 1 && c >= 0){
            if (target > a[r][c])
                r ++;
            else if (target < a[r][c])
                c --;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 7;
        boolean flag = solution(target,arr);
        System.out.println(flag);
    }
}
