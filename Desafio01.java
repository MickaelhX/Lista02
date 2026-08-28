package Lista02;

public class Desafio01 {
    public static void main(String[] args) {

        int primeiro = 0;
        int segundo = 1;

        while (primeiro <= 500) {
            System.out.println(primeiro);

            int proximo = primeiro + segundo;

            primeiro = segundo;
            segundo = proximo;
        }
    }
}
