public class Rotate_String {
    
    public boolean rotateString(String s, String goal) {
        int m = s.length();
        int n = goal.length();

        if(m !=n){
            return false;
        }

        return (s+s).contains(goal);
    }
    public static void main(String[] args) {
        Rotate_String rs = new Rotate_String();
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rs.rotateString(s, goal));
    }
}
