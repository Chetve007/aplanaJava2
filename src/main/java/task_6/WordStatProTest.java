package task_6;

import java.io.File;

public class WordStatProTest {
    public static void main(String[] args) {

        File file = new File(System.getProperty("user.dir") + "/src/main/java/task_6/words.txt");

        WordStatPro wordStatPro = new WordStatPro(file);

        wordStatPro.readFileAndAddToCollection();
        wordStatPro.displayWords();
        wordStatPro.sortWords();
        wordStatPro.displayWords();
        wordStatPro.countOfWordsInFile();
        wordStatPro.theMostPopularWord();
    }
}
