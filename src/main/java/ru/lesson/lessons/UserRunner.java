package ru.lesson.lessons;

import java.util.*;

/**
 * Runner pentru clasa User
 *
 * @author Ticau Vasile
 * @since 03.01.2018
 */
public class UserRunner {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        List<User> usersA = new ArrayList<User>();
        usersA.add(new User("1", "first"));
        usersA.add(new User("2", "two"));
        usersA.add(new User("1", "first"));

        for (User user : usersA) {
            System.out.println(user);
        }

        System.out.println("LinkedList");
        List<User> usersL = new LinkedList<User>();
        usersL.add(new User("1", "first"));
        usersL.add(new User("2", "two"));
        usersL.add(new User("1", "first"));

        for (User user : usersL) {
            System.out.println(user);
        }

        System.out.println("HashSet");
        Set<User> usersH = new HashSet<User>();
        usersH.add(new User("1", "first"));
        usersH.add(new User("2", "two"));
        usersH.add(new User("1", "first"));

        for (User user : usersH) {
            System.out.println(user);
        }

        System.out.println("HashMap");
        Map<String, User> usersM = new HashMap<String, User>();
        usersM.put("1", new User("1", "first"));
        usersM.put("2", new User("2", "two"));
        usersM.put("1", new User("1", "first"));

        for (Map.Entry<String, User> user : usersM.entrySet()) {
            System.out.println(user);
        }

    }
}