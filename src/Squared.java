import java.util.ArrayList;
import java.util.List;

public class Squared {
    public static void main(String[] args) {
        SqInRect sqInRect = new SqInRect();
        List<Integer> list = sqInRect.sqInRect(5, 3);
        System.out.println(list);
    }
}

class SqInRect {
    public List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) {
            return null;
        }
        int sqw = lng * wdth;
        int max = lng;
        int min = wdth;
        List<Integer> list = new ArrayList<>();
        while (sqw > 0) {
            if (max < min) {
                int defoult = max;
                max = min;
                min = defoult;
            }
            sqw = sqw - min * min;
            list.add(min);
            max = max - min;
        }
        return list;
    }
}
