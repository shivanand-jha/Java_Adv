public class WordPlay {
    public  static boolean isVowel(Character ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')  return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isVowel('a'));
        System.out.println(replaceVowels("hello world",'*'));
        System.out.println(emphasize("hello world",'l'));
    }
    public static String replaceVowels(String s , char ch)
    {
        char c[]=s.toCharArray();
        String s1="";
        for (int i = 0; i < c.length; i++)
        {
            if (c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
            {
                c[i]=ch;
            }
          s1=String.valueOf(c);
        }
       return s1;
    }
    public static String emphasize(String phrase, char ch)
    {
        char[] c=phrase.toCharArray();
        for (int i = 0; i < phrase.length(); i++) {
            if(c[i]==ch)
            {
                if (i%2!=0) c[i]='*';
                else c[i]='+';
            }

        }
        phrase=String.valueOf(c);
        return phrase;
    }
}
