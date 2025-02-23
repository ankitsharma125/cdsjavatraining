package StringConcept;

public class reversestring {
 
        public static void main(String[] args) {
            String original = "Ankit Sharma";
            System.out.println("Original string: " + original);
    
            String reversed = reverseString(original);
            System.out.println("Reversed string: " + reversed);
        }
    
        public static String reverseString(String str) {
            char[] charArray = str.toCharArray();
            int left = 0;
            int right = charArray.length - 1;
    
            while (left < right) {
                // Swap the characters
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                left++;
                right--;
            }
    
            return new String(charArray);
        }
    }
