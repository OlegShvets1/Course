package Lesson_9;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class RepeatedWords {

    public static void main(String[] args) throws IOException {
        String line, word = "";
        int count = 0;


        FileReader file = new FileReader("C:/JAVA/song.txt");
        BufferedReader br = new BufferedReader(file);
        List<String> words = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            String string[] = line.toLowerCase().replaceAll("[-+^,.!?()]", "").split(" ");
            for (String s : string) {
                words.add(s);

            }
        }
        //System.out.println(words);
        int size = words.size();


        Map<String, Integer> repeatedWordsMap = new HashMap<String, Integer>();
        for (int word1 = 0; word1 < size; word1++) {
            count = 0;
            for (int word2 = 0; word2 < size; word2++) {
                if (words.get(word1).equals(words.get(word2))) {
                    count++;
                    repeatedWordsMap.put(words.get(word1), count);
                }

            }

        }
        Map.Entry<String, Integer> lastEntry = null;
        Map<String, Integer> sortedMap = repeatedWordsMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        lastEntry = sortedMap.entrySet().stream().reduce((one, two) -> two).get();
        System.out.println("The most frequent word in the text is - " + lastEntry);
        System.out.println();
        System.out.println("Words with the number of times they appear in song : " + repeatedWordsMap);

    }

}
