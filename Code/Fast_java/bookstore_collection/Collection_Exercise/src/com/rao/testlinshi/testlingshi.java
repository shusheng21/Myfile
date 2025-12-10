package com.rao.testlinshi;

public class testlingshi {
    public static void main(String[] args) {
        String p = "D:\\soft\\wechet";
        String[] mysplit = p.split("\\\\");
        for (int i = 0; i < p.length(); i++) {
            System.out.println(mysplit[i]);
        }
    }
}
