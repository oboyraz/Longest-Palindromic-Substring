import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // https://leetcode.com/problems/longest-palindromic-substring/
    static List<String> palindromicList = new ArrayList<>();
    public static void main(String[] args) {

        String input = "cbbbdcbb";
        //String input = "babad";

        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <input.length() ; j++) {
                if (input.charAt(i)==input.charAt(j)){
                    String data = input.substring(i,j+1);
                    palControl(data);
                }
            }
        }
        int palSize;
        int maxPalSize = 0;
        int palSizeIndex = -1;
        for (int i = 0; i <palindromicList.size() ; i++) {
            palSize = palindromicList.get(i).length();
            if (maxPalSize<palSize){
                maxPalSize = palSize;
                palSizeIndex = i;
            }
        }
        System.out.println(palindromicList.get(palSizeIndex));
    }

    private static List<String> palControl(String data) {
        StringBuffer reverseData = new StringBuffer(data);
        reverseData = reverseData.reverse();
        if (reverseData.toString().equals(data)){
            palindromicList.add(reverseData.toString());
        }

        return palindromicList;
    }
}