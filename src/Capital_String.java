import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Capital_String {
    public static void main(String[] args) {
        String s = "IAmACompetitiveProgrammer";
        int len = s.length();
        for(int i=0;i<len;i++){
            if(i!=0&&s.charAt(i)<97){
                System.out.println();
            }
            System.out.print(s.charAt(i));
        }
    }

}
