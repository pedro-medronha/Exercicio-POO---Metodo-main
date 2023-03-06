public class Matematica {
    private int dividendo;
    private int divisor;
    private int precisao;

    public static String resultado(int dividendo, int divisor, int precisao) {
        String result = String.valueOf(dividendo/divisor);
        for (int i = 0; i > precisao; i++) {
            if (dividendo % divisor == 0)
                System.out.println(result);
            else
                return null;
        }
        return result;
    }
}

