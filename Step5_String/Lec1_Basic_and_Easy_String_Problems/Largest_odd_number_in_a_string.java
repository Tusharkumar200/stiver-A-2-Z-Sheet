public class Largest_odd_number_in_a_string {
    // function of largest odd number

    public String largestOddNumber(String num) {
        if ((int) num.charAt(num.length() - 1) % 2 == 1)
            return num;
        int i = num.length() - 1;
        while (i >= 0) {
            int n = Character.getNumericValue(num.charAt(i));
            if (n % 2 == 1)
                return num.substring(0, i + 1);
            i--;
        }
        return "";
    }

    public static void main(String[] args) {
        Largest_odd_number_in_a_string solution = new Largest_odd_number_in_a_string();
        String num = "4206";
        System.out.println("Largest odd number in the string \"" + num + "\": " + solution.largestOddNumber(num));

        num = "35427";
        System.out.println("Largest odd number in the string \"" + num + "\": " + solution.largestOddNumber(num));
    }
}
