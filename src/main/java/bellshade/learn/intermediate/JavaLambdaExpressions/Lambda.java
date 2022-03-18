package bellshade.learn.intermediate.JavaLambdaExpressions;



public class Lambda {
    // Membuat interface
    interface PrintNumbers{
        void print(Integer number);
    }
    public static void main(String[] args) {
        // pada ekspresi berikut nilai n akan melakukan perulangan sampai batasnya yaitu 20
        // dimana n merupakan parameter dan perulangan merupakan fungsi yang akan dilakukan
        PrintNumbers p = n -> {
            while(n <= 20) {
                System.out.println(n++);
            }
        };
        // akan mencetak angka 1 sampai dengan 20
        p.print(1);
    }
}
