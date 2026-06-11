package recursion;

public class removeduplicates {

    public static String deleteDuplicate(String str,
                                         int idx,
                                         StringBuilder sb,
                                         boolean map[]) {

        if (idx == str.length()) {
            return sb.toString();
        }

        char curr = str.charAt(idx);
        int mapIndex = curr - 'a';

        if (map[mapIndex]) {
            return deleteDuplicate(str, idx + 1, sb, map);
        } else {
            map[mapIndex] = true;
            return deleteDuplicate(str, idx + 1,
                                   sb.append(curr), map);
        }
    }

    public static void main(String args[]) {

        String str = "appnnacollege";
        boolean map[] = new boolean[26];

        System.out.println(
            deleteDuplicate(str, 0, new StringBuilder(), map)
        );
    }
}