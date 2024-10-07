import java.io.*;
import java.util.ArrayList;

public class TXTManager {
    private String filePath;

    public TXTManager(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Salvar dados no meu documento TXT
     */
    public void save(ArrayList<String> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.filePath, true))) {
            for (String value : data) {
                bw.write(value);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Listar dados do meu documento TXT
     */
    public ArrayList<String> list() {
        ArrayList<String> valuesTxt = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(this.filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                valuesTxt.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return valuesTxt;
    }

    /**
     * Limpar dados do meu documento TXT
     */
    public void clear() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.filePath, false))) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
