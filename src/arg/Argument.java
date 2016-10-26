//package arg;

public class Argument {
    public static void main (String []args) {
        for (int i=0; i<args.length; i++){
            if (args[i].equals(reverse(args[i])))
                System.out.println(args[i] +" Polindrom");
            else
                System.out.println(reverse(args[i]));
    }}



public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
        temp = in[begin];
        in[begin]=in[end];
        in[end] = temp;
        end--;
        begin++;
        }
        return new String(in);
        }}