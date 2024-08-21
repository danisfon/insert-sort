public class Exercicio1 {
    public static void main(String[] args) {
        double[] vetor = { 5.5, 4.4, 3.3, 2.2, 1.1, 0.0 };
        for (double v : insertDouble(vetor)) {
            System.out.println(v + " ");
        }
    }

    public static double[] insertDouble(double[] vetor) {
        for (int x = 1; x < vetor.length; x++) {
            double chave = vetor[x];
            int y = x - 1;
            while (y >= 0 && vetor[y] > chave) {
                vetor[y + 1] = vetor[y];
                y--;
            }
            vetor[y + 1] = chave;
        }
        return vetor;
    }
}
