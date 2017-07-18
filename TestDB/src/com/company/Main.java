package com.company;

import com.company.model.Artist;
import com.company.model.Datasourse;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Datasourse datasourse = new Datasourse();
        if(!datasourse.open())
        {
            System.out.println("БД не открывается");
            return;
        }

        List<Artist> artists = datasourse.queryArtists(5);
        if(artists == null) {
            System.out.println("Нет артистов!");
            return;
        }

        for(Artist artist : artists)
        {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String > albumsForArtists =
                datasourse.queryAlbumsForArtist("Iron Maiden", Datasourse.ORDER_BY_ASC);

        for(String album : albumsForArtists)
        {
            System.out.println(album);
        }

        datasourse.close();
    }
}
