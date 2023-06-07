package co.develhope.interceptorsmiddleware2.entities;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "months")
public class Month {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int monthNumber;
   private String englishName;
   private String italianName;
   private String germanName;

      public Month(int monthNumber, String englishName, String italianName, String germanName) {
      this.monthNumber = monthNumber;
      this.englishName = englishName;
      this.italianName = italianName;
      this.germanName = germanName;
   }

   public Month(){}

   public int getMonthNumber() {
      return monthNumber;
   }

   public void setMonthNumber(int monthNumber) {
      this.monthNumber = monthNumber;
   }

   public String getEnglishName() {
      return englishName;
   }

   public void setEnglishName(String englishName) {
      this.englishName = englishName;
   }

   public String getItalianName() {
      return italianName;
   }

   public void setItalianName(String italianName) {
      this.italianName = italianName;
   }

   public String getGermanName() {
      return germanName;
   }

   public void setGermanName(String germanName) {
      this.germanName = germanName;
   }

   @Override
   public String toString() {
      return "Month{" +
              "monthNumber=" + monthNumber +
              ", englishName='" + englishName + '\'' +
              ", italianName='" + italianName + '\'' +
              ", germanName='" + germanName + '\'' +
              '}';
   }
}