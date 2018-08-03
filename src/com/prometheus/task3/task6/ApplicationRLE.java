package com.prometheus.task3.task6;


public class ApplicationRLE {


    public static void main(String[] args) {
        if (args[0]!= null && !args[0].equals("")){
            if (args.length == 0 || args.length > 1) System.out.println("");
            else {
                StringBuilder str = new StringBuilder();
                char[] newString = args[0].toCharArray();
                int cnt = 1;
                char ch = newString[0];
                str.append(newString[0]);
                if (newString.length > 1) {
                    for (int i = 1; i < newString.length; i++) {
                        if (newString[i] == ch) {
                            if (cnt < 9) {
                                cnt++;
                            } else {
                                str.append(cnt);
                                cnt = 1;
                                str.append(newString[i]);
                            }
                        } else {
                            if (cnt > 1)str.append(cnt);
                            cnt = 1;
                            str.append(newString[i]);
                        }
                        ch = newString[i];
                    }
                    if (cnt > 1) str.append(cnt);
                }
                System.out.println(str);
            }
        }
    }
}
