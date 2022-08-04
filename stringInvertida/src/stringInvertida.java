public class stringInvertida {
    public static void main(String[] args) {
        String str = "Invertido";
        System.out.println("String normal: " + str);
        StringBuilder stringBuilder = new StringBuilder(str);
        str = stringBuilder.reverse().toString();
        System.out.println("String invertida: " + str);
    }
}
