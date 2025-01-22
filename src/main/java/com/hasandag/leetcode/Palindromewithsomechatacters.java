public class Palindromewithsomechatacters {

    public static void main(String[] args) {

        // Test cases
        // System.out.println(solution("madam")); // true
        System.out.println(solution("Arazi küçük. İz ara."));
        System.out.println(solution("appl. e")); // false
        System.out.println(solution("")); // false
        System.out.println(solution(null)); // false

    }

    // Solution method signature shouldn't be altered
    public static boolean solution(String text) {
        //text = text.replaceAll(" ", "").replaceAll(".", "");
        text = text.replaceAll("[// //.]", "").toLowerCase();

        if (text == null || text.equals("")) {
            return false;
        }

        String[] myStringArray = text.split("");
        for (int i = 0; i < text.length() - 1; i++) {
            if (!myStringArray[i].equals(myStringArray[text.length() - i - 1])) {
                return false;
            }
        }
        return true;

    }

}
