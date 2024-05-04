public class skipastring {
    public static void main(String[] args) {
        String s = "bappleccdah";
        String result = skip(s);
        System.out.println(result);
    }

    static String skip(String input) {
        if (input.isEmpty()) {
            return ""; // Base case: Return empty string when input is empty
        }

        if (input.startsWith("apple")) {
            // If the input starts with "apple", skip this substring and continue recursively
            return skip(input.substring(5));
        } else {
            // If the input does not start with "apple", append the first character to the result
            // and continue recursively with the rest of the string
            return input.charAt(0) + skip(input.substring(1));
        }
    }
}
