import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Float> nums= new ArrayList<>();
        nums.add(1.1f);
        nums.add(2.1f);
        nums.add(3.1f);
        nums.add(4.1f);
        nums.add(5.1f);
        nums.add(6.1f);
        nums.add(7.1f);
        nums.add(7.1f);
        nums.add(7.1f);
        nums.add(8.1f);

        try {
            System.out.println(MyMath.nthLargest(nums, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
