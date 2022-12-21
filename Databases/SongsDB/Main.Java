import model.Artist;
import model.Datasource;

import javax.xml.crypto.Data;
import java.sql.*;
import java.util.List;

public class Main {

   public static void main(String[] args) {
      Datasource datasource = new Datasource();
      if(!datasource.open()) {
         System.out.println("Can't open datasource");
         return;
      }

      List<Artist> artists = datasource.queryArtists(datasource.ORDER_BY_NONE);
      if(artists == null) {
         System.out.println("No artists!");
         return;
      }

      for(Artist artist : artists) {
         System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
      }

      datasource.close();
   }


   






}
