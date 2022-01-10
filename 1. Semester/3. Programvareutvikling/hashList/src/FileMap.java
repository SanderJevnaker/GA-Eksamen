import java.io.*;
import java.util.*;

class FileMap {

    String fileName;
    HashMap<String, List<Word>> key = new HashMap<>();
    int rowCount = 0;
    int rowCountEmpty = 0;

    public FileMap(String fileName) {
        this.fileName = fileName;

    }

    public BufferedReader readFile() throws IOException {
        File file = new File(this.fileName);

        BufferedReader br = new BufferedReader(new FileReader(file));
        return br;
    }

    public void parseFile() throws IOException {

        BufferedReader br = this.readFile();
        String st;
        int colCount;
        while ((st = br.readLine()) != null) {
            colCount = 0;

            this.rowCount++;
            if (st.length() == 0) {
                this.rowCountEmpty++;
            }
            String[] splitLine = st.split("[^a-zA-Z']+");
            for (String w : splitLine) {
                if (w.length() == 0) {
                    continue;
                }
                colCount++;
                Word word = new Word(rowCount, colCount);
                if (!this.key.containsKey(w)) {
                    this.key.put(w, new ArrayList<>());
                }
                this.key.get(w).add(word);
            }
        }
    }

    public void show() throws IOException {
        this.parseFile();
        int words = 0;
        System.out.println("...");
        for (String w : this.key.keySet()) {
            System.out.printf("%s:%n", w);
            words += this.key.get(w).size();
            for (Word word : this.key.get(w)) {
                System.out.println(word.toString());
            }
        }
        System.out.println("...");
        System.out.printf("File %s has %d rows (%d empty), %d words (%d unique)%n", this.fileName, this.rowCount, this.rowCountEmpty, words, this.key.keySet().size());
    }

}

class Word {

    public int rowNdx;
    public int wordNdx;

    public Word(int rowNdx, int wordNdx) {

        this.rowNdx = rowNdx;
        this.wordNdx = wordNdx;
    }

    public String toString() {
        return String.format("    Row %d, word %d", this.rowNdx, this.wordNdx);
    }
}
