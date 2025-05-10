public class SF {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        String str2 = "hello java world";

        // Length of string
        System.out.println("Length: " + str.length());

        // charAt
        System.out.println("Character at index 1: " + str.charAt(1));

        // toUpperCase and toLowerCase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // trim
        System.out.println("Trimmed: '" + str.trim() + "'");

        // equals and equalsIgnoreCase
        System.out.println("Equals str2: " + str.trim().equals(str2));
        System.out.println("EqualsIgnoreCase str2: " + str.trim().equalsIgnoreCase(str2));

        // compareTo
        System.out.println("CompareTo str2: " + str.trim().compareTo(str2));
        System.out.println("CompareToIgnoreCase str2: " + str.trim().compareToIgnoreCase(str2));

        // isEmpty
        System.out.println("Is empty: " + str.isEmpty());

        // Substring
        System.out.println("Substring (6 to 10): " + str.substring(6, 10));

        // indexOf and lastIndexOf
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Last index of 'l': " + str.lastIndexOf('l'));

        // contains
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // startsWith and endsWith
        System.out.println("Starts with '  He': " + str.startsWith("  He"));
        System.out.println("Ends with 'ld  ': " + str.endsWith("ld  "));

        // replace and replaceAll
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
        System.out.println("Replace all spaces: " + str.replaceAll(" ", "-"));

        // split
        String[] words = str.trim().split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // concat
        System.out.println("Concatenated: " + str.trim().concat(" is awesome!"));

        // toCharArray
        char[] chars = str.trim().toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // valueOf
        int number = 123;
        String numStr = String.valueOf(number);
        System.out.println("String from int: " + numStr);

        // format
        String formatted = String.format("My name is %s and I am %d years old.", "Jaynesh", 20);
        System.out.println("Formatted string: " + formatted);
    }
}
