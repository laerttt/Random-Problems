import java.util.HashMap;

public class longestSubString {
    public static void main(String args[]){
        //Example 1
        String a = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(a));
        //Example 2
        String b = "bbbbb";
        System.out.println(lengthOfLongestSubstring(b));
        //Example 3
        String c = "pwwkew";
        System.out.println(lengthOfLongestSubstring(c));

        //Expected output
        //3
        //1
        //3
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1){
            return 1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int size = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (map.get(c)==null){
                map.put(c,0);
            }
            for (int j = i+1; j < s.length(); j++){
                char x = s.charAt(j);
                if(map.get(x)==null){
                    map.put(x,0);
                    if(map.size()>size){
                        size = map.size();
                    }
                }
                else{
                    if (map.size() > size){
                        size = map.size();
                    }
                    map.clear();
                    break;
                }
            }
        }
        return size;
    }
}