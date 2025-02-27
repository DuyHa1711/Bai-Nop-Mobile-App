package Slide5;

public class bai3{
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 1000; i++) {
            s += "hello";
        }
        long endtime = System.currentTimeMillis();
        System.out.println("Time for concat: " + (endtime - starttime) + "ms");
        starttime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            sb.append("hello");
        }
        endtime = System.currentTimeMillis();
        System.out.println("Time for append: " + (endtime - starttime) + "ms");
    }
}