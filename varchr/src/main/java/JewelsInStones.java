import java.util.HashSet;
import java.util.Set;

public class JewelsInStones {


    /**
     *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     * <p>
     * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     * 输入: J = "aA", S = "aAAbbbb"
     * 输出: 3
     * <p>
     * 输入: J = "z", S = "ZZ"
     * 输出: 0
     */

    public static int leecode771(String J, String S) {

        /**
         * 方法一，循环遍历
         */
        int result = 0;
        /*String[] str = J.split("");
        String[] str1 = S.split("");
        for(Character s: S.toCharArray()){
            for(String j:str){
                if(s.equals(j)){
                    result++;
                }
            }
        }
        */

        /**
         * 方法二，宝石转成集合
         */
        Set<Character> Jset = new HashSet();
        for (char j : J.toCharArray())
            Jset.add(j);

        for (char s : S.toCharArray())
            if (Jset.contains(s))
                result++;

        return result;
    }

    public static void main(String[] args) {
        String j = "aA";
        String s = "aAAbbbb";
        System.out.println(leecode771(j, s));
    }
}
