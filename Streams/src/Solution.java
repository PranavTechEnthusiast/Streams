import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Solution {
    public int solution(int A, int B, int C, int D) {
        // write your code in Java SE 8
        List<Integer> list = Arrays.asList(A, B, C, D);
        List<String> strList = list.stream().map(String::valueOf).collect(toList());
        List<String> combinations =
                strList.stream().flatMap(n1 -> strList.stream().filter(n5 -> Integer.valueOf(n5)< 3).flatMap(n2 ->
                        strList.stream().flatMap(
                                n3 -> strList.stream().flatMap(n4 -> Stream.of(n1 + n2 + n3 + n4))))

                ).collect(toList());
        System.out.println(combinations);

        return combinations.stream().map(Integer::valueOf).filter(val -> val < 2360).collect(Collectors.toList()).size();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(1, 8, 3, 2));
    }
}