package Lesson_9;

/*    With the help of HashMap try to calculate all of the unique words in the song Umbrella ignoring the case.
      Print all of these words to the console with the number of times they appear in the text.
      Find the most frequent word in the text and print it to the console as well.*/

import java.util.*;
import java.util.stream.Collectors;

public class RepeatedWords_1 {

    public static void main(String[] args) {
        int count, maxCount = 0;
        int i = 0;
        String word;

        String song1 = "Uh huh, uh huh Yeah, Rihanna Uh huh, uh huh Good girl gone bad Uh huh, uh huh Take three, action Uh huh, uh huh, ho No clouds in my stones Let it rain, I hydroplane into fame Comin' down at the Dow Jones When the clouds come, we gone We Rocafella We fly higher than weather In G5's or better You know me In anticipation for precipitation stack chips for the rainy day Rain man is back with little Ms. Sunshine Rihanna, where you at? You have my heart, and we'll never be worlds apart Maybe in magazines, but you'll still be my star Baby, 'cause in the dark You can't see shiny cars And that's when you need me there With you I'll always share Because When the sun shines, we shine together Told you I'll be here forever Said I'll always be your friend Took an oath that I'm a stick it out till the end Now that it's raining more than ever Know that we still have each other You can stand under my umbrella You can stand under my umbrella, ella, ella, eh, eh, eh Under my umbrella, ella, ella, eh, eh, eh Under my umbrella, ella, ella, eh, eh, eh Under my umbrella, ella, ella, eh, eh, eh, eh, eh, eh These fancy things will never come in between You're part of my entity, here for infinity When the world has took its part When the world has dealt its cards If the hand is hard, together we'll mend your heart Because When the sun shines, we shine together Told you I'll be here forever Said I'll always be your friend Took an oath that I'm a stick it out till the end Now that it's raining more than ever Know that we still have each other You can stand under my umbrella You can stand under my umbrella, ella, ella, eh, eh, eh Under my umbrella, ella, ella, eh, eh, eh Under my umbrella, ella, ella, eh, eh, eh Under my umbrella, ella, ella, eh, eh, eh, eh, eh, eh You can run into my arms It's okay, don't be alarmed Come into me) (There's no distance in between our love) So I'm gonna let the rain pour I'll be all you need and more Because When the sun shines, we shine together Told you I'll be here forever Said I'll always be your friend Took an oath that I'm a stick it out till the end Now that it's raining more than ever Know that we still have each other You can stand under my umbrella You can stand under my umbrella, ella, ella, eh, eh, eh Under my umbrella, ella, ella, eh, eh, eh Under my umbrella, ella, ella, eh, eh, eh Under my umbrella, ella, ella, eh, eh, eh, eh, eh, eh It's raining, raining Ooh, baby, it's raining, raining Baby, come into me Come into me It's raining, raining Ooh, baby, it's raining, raining You can always come into me Come into me It's pouring rain It's pouring rain Come into me Come into me It's pouring rain It's pouring rain";
        String song2 = song1.toLowerCase().replaceAll("[-+^,.!?()]*", "");
        List<String> song = new ArrayList<String>();
        song = Arrays.asList(song2.split(" "));
        //System.out.println(song);
        int size = song.size();


        Map<String, Integer> repeatedWordsMap = new HashMap<>();
        for (int word1 = 0; word1 < size; word1++) {
            count = 0;
            for (int word2 = 0; word2 < size; word2++) {
                if (song.get(word1).equals(song.get(word2))) {
                    count++;
                    repeatedWordsMap.put(song.get(word2), count);

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



