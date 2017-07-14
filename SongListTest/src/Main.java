import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Album album = new Album("Hybrid Theory", "Linkin Park");

        album.addSong("Papercut", 3.05);
        album.addSong("One Step Closer", 2.36);
        album.addSong("With You", 3.23);
        album.addSong("Points of Authority", 3.20);
        album.addSong("Crawling", 3.29);
        album.addSong("Runaway", 3.03);
        album.addSong("By Myself", 3.10);
        album.addSong("In The End", 3.36);
        albums.add(album);


        Album anotherAlbum = new Album("Back in Black", "AC/DC");

        anotherAlbum.addSong("Hells Bells", 5.12);
        anotherAlbum.addSong("Shoot to Thrill", 5.17);
        anotherAlbum.addSong("What Do You Do For Money Honey", 3.35);
        anotherAlbum.addSong("Givin The Dog A Bone", 3.32);
        anotherAlbum.addSong("Let Me Put My Love into You", 4.15);
        anotherAlbum.addSong("Back in Black", 4.15);
        albums.add(anotherAlbum);


        List<Song> playList = new ArrayList<>();
        albums.get(0).addToPlayList(1, playList);
        albums.get(0).addToPlayList(2, playList);
        albums.get(0).addToPlayList(3, playList);
        albums.get(0).addToPlayList(4, playList);
        albums.get(0).addToPlayList(5, playList);
        albums.get(0).addToPlayList(6, playList);
        albums.get(0).addToPlayList(7, playList);
        albums.get(0).addToPlayList(8, playList);


        List<Song> playList2 = new ArrayList<>();
        albums.get(1).addToPlayList(1, playList2);
        albums.get(1).addToPlayList(2, playList2);
        albums.get(1).addToPlayList(3, playList2);
        albums.get(1).addToPlayList(4, playList2);
        albums.get(1).addToPlayList(5, playList2);
        albums.get(1).addToPlayList(6, playList2);

        playAlbum(playList, playList2);

    }

    private static void playAlbum(List<Song> playList, List<Song> playList2) {
        boolean quit = false;
        if (playList.size() == 0)
        {
            System.out.println("Нет плейлистов");
            return;
        }
        else
        {
            printAlbumMenu();
        }

        while (!quit) {
            int chooseAlbum = scanner.nextInt();
            scanner.nextLine();

            switch (chooseAlbum) {
                case 0:
                    System.out.println("Плейлист закончен");
                    quit = true;
                    break;
                case 1:
                    play(playList);
                    quit = true;
                    break;
                case 2:
                    play(playList2);
                    quit = true;
                    break;
                case 3:
                    printAlbumMenu();
                    break;
            }
        }
    }


    private static void play(List<Song> playList) {
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0)
        {
            System.out.println("Нет песен в плейлисте");
            return;
        }
        else
        {
            System.out.println("Сейчас играет: " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Плейлист закончен");
                    quit = true;
                    break;
                case 1:
                    if(!forward)
                    {
                        if(listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext())
                    {
                        System.out.println("Сейчас играет: " + listIterator.next().toString());
                    }
                    else
                    {
                        System.out.println("Мы в конце плейлиста");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward)
                    {
                        if (listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Сейчас играет: " + listIterator.previous().toString());
                    }
                    else
                    {
                        System.out.println("Мы в начале плейлиста");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward)
                    {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Сейчас играет: " + listIterator.previous().toString());
                            forward = false;
                        }
                        else
                        {
                            System.out.println("Мы в начале плейлиста");
                        }
                    }
                    else
                    {
                        if (listIterator.hasNext())
                        {
                            System.out.println("Сейчас играет: " + listIterator.next().toString());
                            forward = true;
                        }
                        else
                        {
                            System.out.println("Мы в конце плейлиста");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0)
                    {
                        listIterator.remove();
                        if(listIterator.hasNext())
                        {
                            System.out.println("Сейчас играет: " + listIterator.next());
                        }
                        else if (listIterator.hasPrevious())
                        {
                            System.out.println("Сейчас играет: " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Доступные действия: \nнажмите" );
        System.out.println("0 - для выхода \n" +
                "1 - чтобы воспроизвести следующую песню\n" +
                "2 - чтобы воспроизвести предыдущую песню\n" +
                "3 - для повтора текущей песни\n" +
                "4 - список песен в плейлисте\n" +
                "5 - вывести список действий\n" +
                "6 - удалить текущую песню из плейлиста\n"
                );
    }

    private static void printAlbumMenu() {
        System.out.println("Доступные действия: \nнажмите" );
        System.out.println("0 - для выхода \n" +
                "1 - для перехода в альбом: Linkin Park\n" +
                "2 - для перехода в альбом: AC/DC\n" +
                "3 - вывести список действий\n");
    }

    private static void printList(List<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===========================");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("===========================");
    }
}
