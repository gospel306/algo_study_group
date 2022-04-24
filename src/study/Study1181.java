import java.util.*;

public class Study1181 {
    public static void main(String[] args) {
        StringBuffer result = new StringBuffer();


        Scanner scan = new Scanner(System.in);
        List<String> inputStrings = new ArrayList<>();
        int countWords = scan.nextInt();
        for(int i=0;i<countWords;i++){
            String input = scan.next();
            if(!inputStrings.contains(input)){
                inputStrings.add(input);
            }
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        Collections.sort(inputStrings, comparator);
        for(int i=0;i<inputStrings.size();i++){
            System.out.println(inputStrings.get(i));
        }

    }
}
