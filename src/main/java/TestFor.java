public class TestFor {

    public static void main(String[] args) {

        //1到100的求和
        /*
        int sum = 0;
        for (int i = 1;i <= 100;i++){
            sum = sum + i;
        }
        System.out.println(sum);

         */
        //求数组的和
        /*
        int [] ns = {1,4,9,16,25};
        int sum = 0;
        for (int i = 0;i < ns.length;i++){
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            sum = sum + ns[i];
        }
        System.out.println(sum);

         */

        int [] ns = {1,4,9,16,25};

        for (int n :ns){
            System.out.println(n);
        }


    }
}
