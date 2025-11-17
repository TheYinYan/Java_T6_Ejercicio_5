public class App {
    public static void main(String[] args) throws Exception {
        int max = 0;
        int min = 199;
        int media = 0;
        for (int i = 1; i <= 50; i++) {
            int num = (int) (Math.random() * 100 + 100);
            System.out.print(num + " ");
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
            
            media += num;
        }
        media/=50;
        System.out.println();
        System.out.printf("Minimo: %d%n", min);
        System.out.printf("Maximo: %d%n", max);
        System.out.printf("Media: %d", media);


    }
}
