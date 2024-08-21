public class Exercicio4 {
    public static void main(String[] args) {
        int[] vetorInsertionSort = { 5, 4, 3, 2, 1, 0 };
        int[] vetorBubbleSort = { 5, 4, 3, 2, 1, 0 };

        System.out.println("Número de Trocas - Insertion Sort: " + insertionSort(vetorInsertionSort));
        System.out.println("Número de Trocas - Bubble Sort: " + bubbleSort(vetorBubbleSort));

        for (int i = 0; i < vetorInsertionSort.length; i++) {
            System.out.println(vetorInsertionSort[i]);
        }
    }

    public static int insertionSort(int[] vetor) {

        int trocas = 0;
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
        return trocas;
    }

    public static int bubbleSort(int[] vetor) {
        boolean trocou = true;
        int numeroDeTrocas = 0;

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

        return numeroDeTrocas;
    }
}
