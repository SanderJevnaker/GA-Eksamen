import java.io.IOException;

/**
 * 	OPPGAVE: Les filen ./resources/BlowinInTheWind.txt og lag en nøkkel for alle unike ord
 *
 *      Opprett class FileMap // DONE
 *          Opprett constructor FileMap(fileName) // DONE
 *              Opprett class Word(int rowNdx, int wordNdx) som en lokal klasse // DONE
 *              Opprett HashMap<String, List<Word>> key // DONE
 *              Opprett metode readFile(fileName) som leser og returner innholdet i fileName // DONE.
 *              Parse innholdet i rader og ord
 *              Bygg HashMap key med word som key og List<Word> som value
 *              Opprett metode show() som viser key i dette formatet:
 *                  ...
 *                  it:
 *      	            Row 26, word 6
 *                  my:
 *      	            Row 9, word 2
 *      	            Row 19, word 2
 *      	            Row 29, word 2
 *                  ...
 *
 *                  File ./resources/BlowinInTheWind.txt has 31 rows (6 empty), 189 words (83 unique)
 *
 *              Utfør koden ved å kalle den fra main:
 *                  new FileMap("./resources/BlowinInTheWind.txt").show();
 */
public class Main {
    public static void main(String[] args) throws IOException {
        new FileMap("./resources/BlowinInTheWind.txt").show();

    }
}