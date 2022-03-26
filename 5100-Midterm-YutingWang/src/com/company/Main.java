package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //Question 1
        System.out.println(" ");
        System.out.println("**************");

        Student sample = new Student();
        Student s1 = new Student(sample);
        s1.setName("Amy");
        s1.setId(001);
        s1.setGpa(3.9);
        Student s2 = new Student("bob",002,4.0);
        Student s3 = s2;
        s3.setName("Cindy");

        System.out.println("deep copy:");
        sample.printDetails();
        s1.printDetails();
        System.out.println("shallow copy:");
        s2.printDetails();
        s3.printDetails();


        //Question 2 ✅
        System.out.println(" ");
        System.out.println("*************");
        System.out.println("The difference between abstract class and interface : ");
        System.out.println("An abstract class permits you to make functionality that subclasses can implement or override whereas an interface only permits you to state functionality but not to implement it. A class can extend only one abstract class while a class can implement multiple interfaces.");

        //Question 3 ✅
        System.out.println(" ");
        System.out.println("*************");
        Moody sad = new Sad();
        Moody happy = new Happy();
        Psychiatrist p = new Psychiatrist();
        p.examine(happy);
        p.observe(happy);
        p.examine(sad);
        p.observe(sad);

        //Question 4 ✅
        System.out.println(" ");
        System.out.println("**************");
        System.out.println("Answer is in the Client Class");

        //Question 5 ✅
        System.out.println(" ");
        System.out.println("**************");
        Camera cam1 = Camera.getInstance();
        cam1.setCameraName("Camera 1");
        Camera cam2 = Camera.getInstance();
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());
        cam2.setCameraName("Camera 2");
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());


        //Question 6 ✅
        System.out.println(" ");
        System.out.println("**************");
        System.out.println(LengthOfLongestSubstring("abcabcbb"));
        System.out.println(LengthOfLongestSubstring("bbbbb"));
        System.out.println(LengthOfLongestSubstring("pwwkew"));

    }

    public static int LengthOfLongestSubstring(String s){
        if(s == null || s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        int left = 0;
        int right = 1;
        int len = 1;
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0),0);
        while(right < s.length()){
            if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),right);
                len = Math.max(right - left + 1, len);
                right++;
            }else{
                map.remove(s.charAt(left));
                left++;
            }
        }
        return len;
    }
}
