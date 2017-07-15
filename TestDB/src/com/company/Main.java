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

        List<Artist> artists = datasourse.queryArtists();
        if(artists == null) {
            System.out.println("Нет артистов!");
            return;
        }

        for(Artist artist : artists)
        {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        datasourse.close();


    }
}
