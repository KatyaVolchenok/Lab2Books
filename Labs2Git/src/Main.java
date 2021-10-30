/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shwartskopff
 */
public class Main {
    
    public static void main(String [] args) {
       
	        	Publish publish1 = new Publish("Проспект", "Москва");
			Publish publish2 = new Publish("Питер", "Санкт-Петербург");
			Publish publish3 = new Publish("БХВ", "Санкт-Петебург");
			Publish publish4 = new Publish("Диалектика", "Киев");
			Books[] books = {
				new Books("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[] {"Седжвик Роберт", "Уэйн Кевин"}, 2018, publish2),
				new Books("Разработка требований к программному обеспечению. 3-е издание, дополненное", "Вигерс Карл", 2019, publish3),
				new Books("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, publish4),
				new Books("C/C++. Процедурное программирование", "Полубенцева М.И.", 2017, publish3),
				new Books("Конституция РФ", 2020, publish1)
		};
                        
			
            for (Books book : books) {
                if (book.getPublish().getNamePublish().equals("БХВ")) {
                    book.getPublish().setCity("Санкт-Петербург");
                }
            }
			
			Books.printAll(books); // У издательства "БХВ" исправлено указание на город: "Санкт-Петебург" заменен на "Санкт-Петербург" 
		}

		
	}

    

