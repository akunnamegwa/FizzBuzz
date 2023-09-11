public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 1000; i++){
            boolean multipleof3 = i % 3 == 0;
            boolean multipleof5 = i % 5 == 0;
            if (multipleof3 || multipleof5) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
