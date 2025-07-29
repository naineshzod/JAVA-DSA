public class compress {
    public static void docompress(String inp)
    {
        String str = "";
        int count = 1;
        for (int i = 0; i < inp.length(); i++) {
            if (i + 1 < inp.length() && inp.charAt(i) == inp.charAt(i + 1)) {
                count++;
            } else {
                str += inp.charAt(i);
                if (count > 1) {
                    str += count;
                }
                count = 1;
            }
        }
        System.out.println(str);
        
        
        }
    
    public static void main(String[] args) {
        String inp = "aaabbbcccdde";

        docompress(inp);        
    }               
}