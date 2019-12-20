import java.util.ArrayList;

public class ValodParentheses {
    public boolean isValid(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                arr.add(s.charAt(i));
            } else if (arr.isEmpty()) return false;
            else if (s.charAt(i) == ']' && arr.get(arr.size() - 1) == '[' ||
                    s.charAt(i) == '}' && arr.get(arr.size() - 1) == '{' ||
                    s.charAt(i) == ')' && arr.get(arr.size() - 1) == '(') {
                arr.remove(arr.size() - 1);
            }
        }
        return arr.size() == 0;

    }
}
