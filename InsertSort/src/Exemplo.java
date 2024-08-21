public class Exemplo {
    public static void main(String[] args) {
        int[] vetor = { 5, 4, 3, 2, 1, 0 };
        for (int v : insertExemple(vetor)) {
            System.out.println(v + " ");
        }
    }

    public static int[] insertExemple(int[] vetor) {
        for (int x = 1; x < vetor.length; x++) {
            int chave = vetor[x];
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
