/*Here is a simple **Java program** that defines a **custom `StringClass`** to perform three operations:  
- `equals` (string comparison),  
- `reverse` the string,  
- change case (to uppercase and lowercase). [w3schools](https://www.w3schools.com/java/ref_string_equalsignorecase.asp)

### Java code: User‑defined String class

*/

import java.util.Scanner;

// Custom String class
class StringClass {
    private String str;

    // Constructor to initialize the string
    public StringClass(String str) {
        this.str = str;
    }

    // Method to check if two strings are equal (case‑sensitive)
    public boolean isEqual(StringClass other) {
        return this.str.equals(other.str);
    }

    // Method to reverse the string
    public String reverse() {
        StringBuilder reversed = new StringBuilder(this.str);
        return reversed.reverse().toString();
    }

    // Method to convert string to uppercase
    public String toUpper() {
        return this.str.toUpperCase();
    }

    // Method to convert string to lowercase
    public String toLower() {
        return this.str.toLowerCase();
    }

    // Method to change case (toggle: upper ↔ lower)
    public String changeCase() {
        StringBuilder sb = new StringBuilder();
        for (char ch : this.str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }
        return sb.toString();
    }

    // Getter for original string
    public String getString() {
        return str;
    }
}

// Main class to test
public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        StringClass str1 = new StringClass(s1);
        StringClass str2 = new StringClass(s2);

        // Equals check
        System.out.println("Are strings equal? " + str1.isEqual(str2));

        // Reverse
        System.out.println("Reverse of first string: " + str1.reverse());

        // Change case
        System.out.println("First string (UPPER): " + str1.toUpper());
        System.out.println("First string (lower): " + str1.toLower());
        System.out.println("First string (toggle case): " + str1.changeCase());

        sc.close();
    }
}


/* What each part does

- `isEqual(StringClass other)` compares two objects’ strings using standard `equals`. [stackoverflow](https://stackoverflow.com/questions/4446643/java-string-equalsignorecase-vs-switching-everything-to-upper-lower-case)
- `reverse()` reverses the stored string using `StringBuilder.reverse()`. [geeksforgeeks](https://www.geeksforgeeks.org/java/reverse-a-string-in-java/)
- `toUpper()` and `toLower()` convert the string to uppercase and lowercase respectively. [howtodoinjava](https://howtodoinjava.com/java/string/string-equalsignorecase-method/)
- `changeCase()` toggles each character’s case (upper↔lower). [youtube](https://www.youtube.com/watch?v=1VcZiHHsvUY)

Save this as `StringDemo.java`, compile with `javac StringDemo.java`, then run with `java StringDemo`. [igulms.iqdigit](https://igulms.iqdigit.com/storage/15654/string-operations.docx)*/