package lv1;

public class NewIdRecruitment {
    public static String solution(String new_id) {
        String answer = "";

        // 1단계
        new_id = new_id.toLowerCase();

        // 2단계
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        // 3단계

        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }

        StringBuilder sb = new StringBuilder();
        if (!new_id.isEmpty()) {
            for (int i = 0; i < new_id.length(); i++) {
                sb.append(new_id.charAt(i));
            }
        }

        // 4단계


        if (!sb.toString().isEmpty()) {
            if (sb.charAt(0) == '.') {
                sb.deleteCharAt(0);
            }
        }
        if (!sb.toString().isEmpty()) {
            if (sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        // 5단계
        if (sb.toString().isEmpty()) {
            sb.append("a");
        }

        // 6단계


        if (sb.length() >= 16) { //19면
            sb.delete(15, sb.length()); // 16~19
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }


        // 7단계
        if (sb.length() <= 2) {
            while (sb.length() <= 2) {
                sb.append(sb.charAt(sb.length() - 1));
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
    }
}
