package com.liuyingdi2022.lecture_02;

/**
 * 技巧：自顶向下的编程方式
 */
public class P01_125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        String filterString = s.replaceAll("[^A-Za-z0-9]", "");
        String reverseString = new StringBuilder(filterString).reverse().toString();
        return filterString.equalsIgnoreCase(reverseString);
    }
}
