package PQ;

public class F_Unique_char {
    public static void main(String[] args) {
        String s ="shivsa";
        System.out.println(s.indexOf(s.charAt(1)));
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        for(char c: s.toCharArray()){
            if(s.indexOf(c)==s.lastIndexOf(c)) return s.indexOf(c);
        }
        return -1;
    }
}
