/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shwartskopff
 */
public class Publish {
    private String namePublish;
    private String city;
    
    public Publish(String namePublish, String city) {
        setPublish(namePublish);
        setCity(city);
    }
    public String getNamePublish() {
        return namePublish;
    }
     public String getCity() {
        return city;
    }

    public void setPublish(String namePublish) {
        if(namePublish != null && ! namePublish.equals ("")){
             this.namePublish = namePublish;
        } else {
            System.out.println("Название издательства не должно быть пустым."); 
        }
    }

    public void setCity(String city) {
        if(city != null && ! city.equals("")) {  
        this.city = city;
    }
    }
}
