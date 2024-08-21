public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetorInsertionSort = { 0, 1, 2, 3, 4, 5 };
        int[] vetorBubbleSort = { 0, 1, 2, 3, 4, 5 };

        System.out.println("Média - Insertion Sort: " + insertionSort(vetorInsertionSort));
        System.out.println("Média - Bubble Sort: " + bubbleSort(vetorBubbleSort));

    }

    public static double insertionSort(int[] vetor) {

        double trocas = 0;
        for (int x = 1; x < vetor.length; x++) {
            int chave = vetor[x];
            int y = x - 1;

            while (y >= 0 && vetor[y] < chave) {
                vetor[y + 1] = vetor[y];
                y--;
                trocas++;
            }
            if (y + 1 != x) {
                vetor[y + 1] = chave;
                trocas++;
            }
        }
        double media = trocas / vetor.length;

        return media;
    }

    public static double bubbleSort(int[] vetor) {
        boolean trocou = true;
        double numeroDeTrocas = 0;

        while (trocou) {
            trocou = false;

            for (int x = 0; x < vetor.length - 1; x++) {
                int vX = vetor[x];
                int vx1 = vetor[x + 1];

                if (vX < vx1) {
                    vetor[x] = vx1;
                    vetor[x + 1] = vX;
                    trocou = true;
                    numeroDeTrocas++;
                }
            }
        }
        double media = numeroDeTrocas / vetor.length;
        return media;
    }
}
