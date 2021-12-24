import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {
EnoughIsEnough enoughIsEnough = new EnoughIsEnough();
enoughIsEnough.deleteNth( new int[] { 20, 20, 20, 20 }, 1 );
      int []arr=  new int[] { };
      System.out.println(Arrays.toString(arr));
    }
}

class EnoughIsEnough {

    public int[] deleteNth(int[] elements, int maxOccurrences) {
        if (elements.equals(null) || maxOccurrences == 0) {
            return new int[] { };
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int tm : elements) {
            list.add(tm);
        }
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) == list.get(j+1)) {
                    count++;
                    if (count > maxOccurrences) {
                        list.remove(j);
                    }
                }
            }
        }
       int[] arr = new int[list.size()];
      for (int i =0; i<list.size();i++){
          arr[i] = list.get(i);
      }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

}