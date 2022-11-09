package work;

import java.util.Scanner;

public class work0 {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.sum();
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome());
    }
}
class Sum{
    int [] nums = {1,2,7,8,9,11,15};
    int target = 9;
    public void sum(){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    System.out.println("[" + i + "," + j + "]");
                    return;
                }
            }
        }
    }
}
class Palindrome{
    Scanner scanner = new Scanner(System.in);
    public boolean isPalindrome(){
        int x = scanner.nextInt();
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        int res = 0;
        int y = x;
        //取X的反数
        while (y != 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }
        return res == x;
    }
}