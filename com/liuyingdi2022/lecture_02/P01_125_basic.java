package com.liuyingdi2022.lecture_02;

/**
 * 技巧：自顶向下的编程方式
 */
public class P01_125_basic {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String filterString = "";
        for (int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);
            if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z')) {
                filterString += ch;
            }
        }
        String reverseString = "";
        for (int index = filterString.length() - 1; index >= 0; index--) {
            reverseString += filterString.charAt(index);
        }
        return filterString.equals(reverseString);
    }
}
