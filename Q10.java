public class Q10 {
    public static void main(String[] args) {
        int N=4;

        for (int i =1; i <=N; i++) {
            int num = i;
            for (int j=1; j <=N; j++) {

                 System.out.print(num++ +"   ");
            }


            System.out.println();
        }
    }
}
