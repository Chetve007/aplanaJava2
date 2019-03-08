package task_6;

import java.io.*;
import java.util.*;

public class WordStatPro {

    private File file;
    private List<String> list;

    public WordStatPro(File file) {
        this.file = file;
    }

    public void readFileAndAddToCollection() {
        list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String[] words = br.readLine().split("\\s");
            for (String word : words)
                list.add(word);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortWords() {
        Collections.sort(list);
    }

    public void displayWords() {
        for (String word : list)
            System.out.print(word + " ");
        System.out.println();
    }

    public void countOfWordsInFile() {
        for (Map.Entry<String, Integer> map : countOfWords().entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }
    }

    public void theMostPopularWord() {
        Map<String, Integer> popWords = countOfWords();
        String popWord = null;
        int count = 1;
        for (String word : popWords.keySet()) {
            if (popWords.get(word) > count) {
                count = popWords.get(word);
                popWord = word;
            }
        }
        if (count == 1) throw new RuntimeException("All words in the file occur no more than once!");
        System.out.println("The word '" + popWord + "' occurs '" + count + "' times in file");
    }

    private HashMap<String, Integer> countOfWords() {
        HashMap<String, Integer> words = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (words.containsKey(list.get(i)))
                words.replace(list.get(i), words.get(list.get(i))+1);
            else
                words.put(list.get(i), 1);
        }
        return words;
    }

    public void uniqueWords() {
        Set<String> unWords = new HashSet<>(list);
        System.out.println("The number of unique words in the file is equal to '" + unWords.size() + "'");
    }
}