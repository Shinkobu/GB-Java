/**
 * Жанр
 * Название песни
 * количество прослушиваний
 * <p>
 * Дай мне список популярной для сна музыки
 * <p>
 * List<Music>
 * - Название
 * - Автор
 * - Количество прослушиваний
 */

package Seminar5;

import java.util.*;

public class Music {

    public static void main(String[] args) {
//      получаем список с жанрами
        List<String> genres = CreateGenres();
//      получаем массив с названиями песен
        String[] allSongs = new String[] {"Boshki Dymyatsa","Sinimi Zheltymi Krasnymi","Highway To Hell","Sonet","Rayda","Since U Been Gone","La Grange","My Heart","Someday","Shape Of You","A cap","Passport","Controller","Notebook","Troubles","Phone","Ring","Glass water","Lemonade","A ram zam zam","MicroWave","Room","Alone","Alies","Table face","Door opening","bedroom","Bless you","Young and brave","Simple","Programming", "Summer", "poldnik", "Cause", "Sharp", "Exit", "Gift", "Defeat", "Winner", "Victory", "Quiz", "Fifa", "Telega", "Belly", "Knowledge", "AS far as i know", "Celebrate", "Person", "Dream", "English", "Disney", "Silent", "Night", "Tiger", "Amazon", "Fish", "Mac", "MC", "Fair", "Animoto", "Selfish", "Game", "Hi", "Bye", "See you", "Ghost", "Star", "War", "Yandex", "Witcher", "Loser", "End", "Sky", "Cat", "Hand", "Jewelry", "Lunch"};
//      получаем мапу (название песни, рейтинг)
        Map<String, Integer> songRates = CreateSongNames(allSongs);
//      получаем мапу
        Map<String, Map<String, Integer>> playList = FillMap(genres, songRates);
        playList = Sort(playList);
        System.out.println(playList);
        List<String> vipPlayList;
        System.out.println("Which playlist do you want listen?");
        System.out.println("Insert 1 if dance playlist is interested for you.");
        System.out.println("Insert 2 if dream playlist is interested for you. Music for sleep.");
        System.out.println("Insert 3 if you need training music.");
        Scanner choice = new Scanner(System.in);
        switch (choice.nextInt()) {
            case (1):
                vipPlayList = ResultPlaylist(playList, genres.get(0), genres.get(1));
                System.out.println("Top of the dance music:");
                System.out.println(vipPlayList);
                System.out.println(ShakeShake(vipPlayList));
                break;
            case (2):
                vipPlayList = ResultPlaylist(playList, genres.get(3), genres.get(6));
                System.out.println("Top of the music for sleep:");
                System.out.println(vipPlayList);
                System.out.println(ShakeShake(vipPlayList));
                break;
            case (3):
                vipPlayList = ResultPlaylist(playList, genres.get(5), genres.get(4));
                System.out.println("Top music for training:");
                System.out.println(vipPlayList);
                System.out.println(ShakeShake(vipPlayList));
                break;
            default:
                System.out.println("Next time insert legal number!");
        }
    }

//  создаёт List<String> с жанрами
    public static List<String> CreateGenres() {

        List<String> genres = new ArrayList<>();
        genres.add("Pop");
        genres.add("Hip-Hop");
        genres.add("Rap");
        genres.add("Classic");
        genres.add("Rock");
        genres.add("DupStep");
        genres.add("Relax");
        return genres;

    }
//  получает массив с названиями песен, делает мапу (название песни, случайный int от 0 до 1000 (рейтинг))
    public static Map<String, Integer> CreateSongNames(String[] songs) {

        Map<String, Integer> songNames = new HashMap<>();
        for (int i = 0; i < songs.length; i++) {
            songNames.put(songs[i],(int) ((Math.random() * 1001) + 1));
        }

        return songNames;

    }
//  получает список с жанрами, мапу (название песни, рейтинг)
//  создаёт мапу плейлист (
    public static Map<String, Map<String, Integer>> FillMap(List<String> genres, Map<String, Integer> songRates) {

        Map<String, Map<String, Integer>> playList = new HashMap<>();

        for (int i = 0; i < songRates.size(); i++) {

            List<String> keyList = new ArrayList<>(songRates.keySet());
            List<Integer> valueList = new ArrayList<>(songRates.values());
            Map<String, Integer> temp = new HashMap<>();

            List<String> keyPlayList = new ArrayList<>(playList.keySet());
            temp.put(keyList.get(i), valueList.get(i));

            if (playList.isEmpty()) {
                playList.put(genres.get((int) (Math.random() * genres.size())), temp);
            } else {
                boolean find = false;
                int forListGenre = (int) (Math.random() * genres.size());
                for (int j = 0; j < playList.size(); j++) {

                    if (Objects.equals(genres.get(forListGenre), keyPlayList.get(j))) {

                        playList.get(genres.get(forListGenre)).put(keyList.get(i), valueList.get(i));
                        find = true;
                    }
                }
                if (!find) {
                    playList.put(genres.get(forListGenre), temp);
                }
            }
        }
        return playList;
    }

    public static Map<String, Map<String, Integer>> Sort(Map<String, Map<String, Integer>> noSorted) {

        Map<String, Map<String, Integer>> sorted = new LinkedHashMap<>();
        List<String> stringList = new ArrayList<>(noSorted.keySet());
        int count = 0;
        for (Map.Entry<String, Map<String, Integer>> item : noSorted.entrySet()) {

            List<String> listOfKeys = new ArrayList<>(item.getValue().keySet());
            List<Integer> listOfValues = new ArrayList<>(item.getValue().values());
            Map<String , Integer> songs = new LinkedHashMap<>(SortLists(listOfKeys, listOfValues));
            List<String> newListOfKeys = new ArrayList<>(songs.keySet());
            List<Integer> newListOfValues = new ArrayList<>(songs.values());
            if(sorted.containsKey(stringList.get(count))) {
                sorted.get(stringList.get(count)).put(newListOfKeys.get(count),newListOfValues.get(count));
            } else {
                sorted.put(stringList.get(count), songs);
            }

            count++;
        }
        return sorted;
    }

    public static Map<String , Integer> SortLists(List<String> keys, List<Integer> values) {

        Map<String , Integer> result = new LinkedHashMap<>();
        List<String> newKeys = new ArrayList<>();
        List<Integer> newValues = new ArrayList<>();

        while (!values.isEmpty()) {

            int max = values.get(0);
            int indexMax = 0;

            for (int i = 0; i < values.size(); i++) {

                if (max < values.get(i)) {
                    max = values.get(i);
                    indexMax = i;
                }
            }
            newValues.add(max);
            newKeys.add(keys.get(indexMax));
            values.remove(indexMax);
            keys.remove(indexMax);
        }

        for (int i = 0; i < newValues.size(); i++) {
            result.put(newKeys.get(i), newValues.get(i));

        }
        return result;
    }

    public static List<String> ResultPlaylist (Map<String ,Map<String , Integer>> MusicData, String genre1, String genre2) {

        Map<String , Integer> hipHop = new LinkedHashMap<>(MusicData.get(genre1));
        List<String> listKeysHipHop = new ArrayList<>(hipHop.keySet());
        List<Integer> listValuesHipHop = new ArrayList<>(hipHop.values());

        Map<String , Integer> pop = new LinkedHashMap<>(MusicData.get(genre2));
        List<String> listKeysPop = new ArrayList<>(pop.keySet());
        List<Integer> listValuesPop = new ArrayList<>(pop.values());

        List<String> result = new ArrayList<>();

        if(listValuesHipHop.get(0)>=listValuesPop.get(0)) {
            for (int i = 0; i < 5; i++) {

                result.add(listKeysHipHop.get(i));
                result.add(listKeysPop.get(i));

            }
        } else {
            for (int i = 0; i < 5; i++) {

                result.add(listKeysPop.get(i));
                result.add(listKeysHipHop.get(i));

            }
        }
        return result;
    }

    public static List<String> ShakeShake (List<String> sorted) {

        List<String> shaked = new ArrayList<>();
        while (!sorted.isEmpty()) {
            int random = (int) (Math.random()* sorted.size());
            shaked.add(sorted.get(random));
            sorted.remove(random);
        }
        return shaked;
    }
}