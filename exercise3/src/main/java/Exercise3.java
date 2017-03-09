import org.apache.commons.lang.ArrayUtils;

import java.util.*;

/**
 * Created by djeremias on 3/7/17.
 */
public class Exercise3 {

    public static void main(String[] args) {
        System.out.print("startTime: " + System.currentTimeMillis() + " \n");

        List<Integer> list1 = generateRandomNumbers();
        List<Integer> list2 = generateRandomNumbers();
        Set<Integer> dupes = getDuplicates(list1, list2);

        if (dupes.isEmpty()) {
            System.out.println("there are no common numbers between the 2 data sets");
            System.exit(0);
        } else {
            System.out.println("there are " + dupes.size() + " unique common numbers between the 2 data sets\n");
        }

        outputResults(dupes);

        System.out.print("\nendTime: " + System.currentTimeMillis());
        System.exit(0);
    }

    private static void outputResults(Set<Integer> dups) {
        // sort the list in asc order
        Integer[] integerArray =  dups.toArray(new Integer[dups.size()]);
        int[] sortList = ArrayUtils.toPrimitive(integerArray);
        Arrays.sort(sortList);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sortList.length; i++) {
            sb.append(sortList[i]);
            sb.append(", ");
        }
        System.out.print(sb.toString());
    }

    private static List<Integer> generateRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            int num = r.nextInt((10000 - 1) + 1) + 1;
            numbers.add(num);
        }

        //System.out.print("returning total count: " + numbers.size() + "\n");

        return numbers;
    }

    private static Set<Integer> getDuplicates(List<Integer> list1, List<Integer> list2) {
       /*Set<Integer> dupes = new HashSet<>();

        for (Integer num : list1) {
            if (list2.contains(num)) {
                dupes.add(num);
            }
        }*/
        List<Integer> list = new ArrayList<>(list1);
        list.retainAll(list2);

        return new HashSet<>(list);
    }
}
