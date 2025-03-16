package Step5_String.Lec1_Basic_and_Easy_String_Problems;

public class Reverse_Words_in_a_String {
    
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(i > 0 ? " " : "");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Reverse_Words_in_a_String reverser = new Reverse_Words_in_a_String();
        String input = "the sky is blue";
        String output = reverser.reverseWords(input);
        System.out.println(output);
    }
}
