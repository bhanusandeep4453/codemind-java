import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            l1.add(scanner.nextInt());
        }

        for (int i = 0; i < b; i++) {
            l2.add(scanner.nextInt());
        }

        Set<Integer> s1 = new HashSet<>(l1);
        Set<Integer> s2 = new HashSet<>(l2);

        Set<Integer> symmetricDifference = new HashSet<>(s1);
        symmetricDifference.addAll(s2);
        
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);

        symmetricDifference.removeAll(intersection);

        System.out.println(symmetricDifference.size());
    }
}
