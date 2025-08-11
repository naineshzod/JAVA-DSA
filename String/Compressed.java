public class Compressed {

    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // If the current character is the same as the next one, increment the count
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Otherwise, append the character and its count to the compressed string
                compressed.append(str.charAt(i)).append(count);
                count = 1; // Reset count for the next character
            }
        }

        return compressed.toString();
    }
    public static void main(String[] args){
        String str = "aaabbbccc";
        //compress(str);
        System.out.println("Compressed string: " + compress(str));
        
    }
}
