package D_01_to_12_;

public class D_05_Radomir_Lukovic {
    public static void main(String[] args) {

        String string = "ITBootCamp";

        char slovoC = 'C';

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != slovoC) {
                System.out.println(string.charAt(i));
            } else {
                continue;
            }
        }
    }
}
