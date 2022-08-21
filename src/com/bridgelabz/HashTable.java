package com.bridgelabz;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> hashTable = new Hashtable<>();
        String message = "Paranoids are not paranoid because they are paranoid but because " +
                "they keep putting themselves deliberately into paranoid avoidable situations";

        String[] messageArray = message.toLowerCase().split(" ");

        for (String word : messageArray){
            Integer value = hashTable.get(word);

            if (value == null)
                value = 1;
            else
                value = value + 1;
            hashTable.put(word, value);
        }
        System.out.println(hashTable);
    }
}
