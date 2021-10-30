/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.util.Arrays;
/**
 *
 * @author Shwartskopff
 */
public class Books {

    
    private String name;
    private Publish publish;
    private int year;
    private String [] autors;
    private String autor;
    
    public Books(String name, int year, Publish publish) {
        setName(name);
        setYear(year);
        setPublish(publish);
    }
    public Books(String name, String[] autors, int year, Publish publish) {
        this(name, year, publish);
        setAutors(autors);
    }
    public Books(String name, String autor, int year, Publish publish) {
        this(name, year, publish);
        setAutor(autor);
    }
        
    public String getName() {
    return name;
    }
    public Publish getPublish() {
    return publish;
    }
    public int getYear() {
    return year;
    }
    public String[] getAutors() {
    return autors;
    }
    public String getAutor() {
    return autor;
    }
    public String getAutor(int i) {
        if(i>=0 && i<autors.length) {
        return autors[i];
    }else {
           throw new IllegalArgumentException("Поля авторов не должны быть пустыми!");  
        }
    }
    
    public void setName(String name) {
        if(name != null && ! name.equals("")) {  
        this.name = name;
    } else {
           throw new IllegalArgumentException("Название книги не должно быть пустым!");
        }
    }

    public void setPublish(Publish publish) {
        if(publish != null) {  
        this.publish = publish;
    } else {
           throw new IllegalArgumentException("Название издательства не должно быть пустым!");
        }
    }
    public void setYear(int year) {
        if(year > 0) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Год издания должен быть строго больше нуля.");
        }
    }
    
    public void setAutors(String[] autors) {
        if(autors != null) {  
        this.autors = autors;
    } else {
           throw new IllegalArgumentException("Поле автора не должно быть пустым!");
        }
    }
    
    public void setAutor(String autor) {
        if(autor != null && ! autor.equals("")) {  
        this.autor = autor;
    } else {
           throw new IllegalArgumentException("Поле автора не должно быть пустым!");
        }
    }
    
    
    public void print() {
        if(getAutor() != null && ! getAutor().equals("")) {
            System.out.println("Название книги: " + name + "; Автор: " + autor + " ; Издательство: " + getPublish().getNamePublish() + "," + getPublish(). getCity() + "; Год издания: " + year);
        }
        else if(getAutors() != null && getAutors().length > 0) {
            System.out.println("Название книги: " + name + "; Автор: " + Arrays.toString(getAutors()) + " ; Издательство: " + getPublish().getNamePublish() + "," + getPublish(). getCity() + "; Год издания: " + year);
        }
        else  {
            System.out.println("Название книги: " + name + ";  Издательство: " + getPublish().getNamePublish() + "," + getPublish(). getCity() + "; Год издания: " + year);
        }
        }
             
        public static void printAll(Books[] books) {
        for(Books book: books)
            book.print();
    }
        
}

            

   
        
    
   
    
    
  

    