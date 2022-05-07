package com.company;

import java.util.*;

public class Main {
    //-----------Final Exam No.1------------
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for(char c : s.toCharArray()){
            if(c == '(' ||c == '['||c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(c != map.get(top)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //----------Final Exam No.2----------
    public static String compress(String str) {
        String str1 = str.toLowerCase();
        char current = str1.toCharArray()[0];
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(current);
        for(char c : str1.toCharArray()){
            if(c == current){
                count ++;
            }else{
                sb.append(count);
                current = c;
                count = 1;
                sb.append(current);
            }
        }
        sb.append(count);
        String now = sb.toString();
        if(now.length() >= str.length()){
            return str;
        }else{
            return now;
        }
    }

    //----------Final Exam No.3-----------
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int left = 0;
        int right = 1;
        int len = 1;
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);
        while (right < s.length()) {
            if (!map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), right);
                len = Math.max(right - left + 1, len);
                right++;
            } else {
                map.remove(s.charAt(left));
                left++;
            }
        }
        return len;
    }

    //----------Final Exam No.4-----------
    public static int[] sumZero(int n) {
            int[] ans = new int[n];
            int i = 0;
            if(n % 2 == 1){
                ans[0] = 0;
                i = 1;
            }
            int j = 1;
            while(i < n){
                ans[i] = j;
                ans[i+1] = 0-j;
                i = i + 2;
                j ++;
            }
            return ans;
        }

    //----------Final Exam No.5-------------
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums){
            pq.add(n);
            if(pq.size() > k){
                pq.remove();
            }
        }
        return pq.remove();
    }

    public static void main(String[] args) {
        //Tests for the results
        //-----------No.1
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("[()]"));
        //-----------No.2
        System.out.println(compress("Aabcccccaaa"));
        System.out.println(compress("abcd"));
        System.out.println(compress("Aaa"));
        //-----------No.3
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("bbbb"));
        //-----------No.4
        System.out.println(sumZero(5)[0]);
        System.out.println(sumZero(5)[1]);
        System.out.println(sumZero(5)[2]);
        System.out.println(sumZero(5)[3]);
        System.out.println(sumZero(5)[4]);
        //-----------No.5
        int[] nums = new int[]{3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
        int[] nums1 = new int[]{3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums1,4));
    }
}
