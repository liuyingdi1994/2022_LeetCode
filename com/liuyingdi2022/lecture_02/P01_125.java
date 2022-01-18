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
        String filterString = _filter(s);
        String reverseString = _reverse(filterString);
        return filterString.equalsIgnoreCase(reverseString);
    }

    private static String _filter(String s) {
        return s.replaceAll("[^A-Za-z0-9]", "");
    }

    private static String _reverse(String filterString) {
        return new StringBuilder(filterString).reverse().toString();
    }

}
