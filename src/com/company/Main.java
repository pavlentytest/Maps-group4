package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	  /*
	  Hashtable - хэш таблица
	  Пары - ключ=>значение
	  все методы synchronized - могут быть проблемы со скоростью
	  выполнение операции начинается с вычислением хэша от ключа - это фактически
	  индекс
	  Неупорядочено
	 	   */

	  Hashtable phones = new Hashtable();
	  phones.put("Ivan","4534535");
        phones.put("Petr","1111222");
        phones.put("Alex","333444");
        phones.put("Marina","4443545");
        phones.put("Olga","4534343");

        Enumeration keys = phones.keys();
        while(keys.hasMoreElements()) {
            String user = (String) keys.nextElement();
            String value = (String) phones.get(user);
            System.out.println("Key (user) = " + user + ", phone: "+ value);

        }

        /*
        HashMap - аналогично Hashtable, можно null, потоконебезопасный
        */
        Map<String, String> map = new HashMap<String,String>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");

        System.out.println(map);

        Map<String, String> map2 = new HashMap<String,String>();
        map.put("key4","value4");
        map.put("key5","value5");
        map.put("key6","value6");
        // добавление набора данных
        map.putAll(map2);
        map.remove("key5");
        // map.size(); размер hashmap
        // поиск по ключу
        String exists = (map.containsKey("key2")) ? "found" : "notfound";

        Set<Map.Entry<String,String>> set = map.entrySet();
        for(Map.Entry<String,String> me: set) {
            // me.getKey();
            // me.getValue();
        }

        /*
        LinkedHashMap
        Упорядоченная реализациия HashMap, в котором есть связь на следу и пред. эл.

         */
        Map<String,Double> linkedhashmap = new LinkedHashMap<String,Double>();
        linkedhashmap.put("USD",new Double(76.7));
        linkedhashmap.put("EUR",new Double(86.7));
        linkedhashmap.put("CZK",new Double(100.7));
        linkedhashmap.put("BAT",new Double(1.2));

        System.out.println(linkedhashmap);

        for(String key: linkedhashmap.keySet()) {
            System.out.println(key + ": " + linkedhashmap.get(key));
        }

        /*
        TreeMap - сортируется по ключам - natural ordering
        Своя сортировка - это Comparator
         */

        TreeMap<Integer,String> weekday = new TreeMap<Integer,String>();
        weekday.put(1,"Monday");
        weekday.put(2,"Tuesday");
        weekday.put(3,"Wednesday");
        weekday.put(4,"Thursday");
        weekday.put(5,"Friday");

        // множество ключей
        System.out.println(weekday.keySet());
        // значения
        System.out.println(weekday.values());
        // первый ключ и его значение
        System.out.println(weekday.get(weekday.firstKey()));











    }
}
