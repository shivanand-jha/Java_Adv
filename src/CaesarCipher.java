public class CaesarCipher {
    public static String encrypt(String input,int key)
    {
        StringBuilder encrypted=new StringBuilder(input);
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        String sAlphabet=alphabet.substring(key)+alphabet.substring(0,key);
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar=encrypted.charAt(i);
            int idx=alphabet.indexOf(currChar);
            if (idx!=-1)
            {
                char newChar=sAlphabet.charAt(idx);
                encrypted.setCharAt(i,newChar);
            }
        }
        return encrypted.toString();
    }
    public static void main(String[] args) {
        System.out.println(encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!",23));
    }
}
