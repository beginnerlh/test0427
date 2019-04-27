package lianxi0427;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int maxLen = 1;
        int len = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                len++;
                if (len > maxLen) {
                    maxLen = len;
                }
            } else {
                len = 1;
            }
        }
        System.out.println(maxLen);
    }
}

