import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        String[] dataAgendada = { "10/01/2024", "10/10/2000", "01/04/1988" };
        String[] datasOrdenadas = ordenarData(dataAgendada);

        for (String data : datasOrdenadas) {
            System.out.println(data);
        }
    }

    public static String[] ordenarData(String[] datas) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            for (int i = 1; i < datas.length; i++) {
                String chave = datas[i];
                Date chaveData = format.parse(chave);
                int j = i - 1;
                while (j >= 0 && format.parse(datas[j]).after(chaveData)) {
                    datas[j + 1] = datas[j];
                    j--;
                }
                datas[j + 1] = chave;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return datas;
    }
}
