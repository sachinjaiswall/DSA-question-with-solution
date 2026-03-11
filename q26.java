public class q26 {
    public static String moveHashes(String str) {
        int count = 0;
        StringBuilder result = new StringBuilder();

        // Count hashes and collect non-hash characters
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                count++;
            } else {
                result.append(ch);
            }
        }

        // Add hashes at the beginning
        StringBuilder finalStr = new StringBuilder();
        for (int i = 0; i < count; i++) {
            finalStr.append('#');
        }

        finalStr.append(result);
        return finalStr.toString();
    }

    public static void main(String[] args) {
        String str = "ab#c#d#";
        System.out.println(moveHashes(str));
    }
}
    

