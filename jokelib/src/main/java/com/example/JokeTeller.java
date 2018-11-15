package com.example;
import java.util.Random;

public class JokeTeller {
    //create an arry of jokes

    private static final  String jokes[]={
            "The programmer to his son: “Here, I brought you a new basketball.”\nSon: “Thank you, daddy, but where is the user’s guide?”",
            "Two threads walk into a bar. The barkeeper looks up and yells, “hey, I don’t want any conditions race like the time last!\"",
            "3 Database Admins walked into a NoSQL bar. A little later, they walked out because they couldn’t find a table.",
            "I love pressing F5. It\'s so refreshing.",
            "The worst thing about a broadcast joke is that you have to tell it to everyone in order to find the one person who gets it.",
            "An SEO couple had twins. For the first time, they were happy with duplicate content.",
            "There are only 10 types of people in the world: \nThose who understand binary, and those who don\'t.",
            " How many programmers does it take to change a light bulb?  None, that\'s a hardware problem."

    };
    public static String getJoke(){
        int size=jokes.length;
        Random r=new Random();
        int index=r.nextInt(size);
        return jokes[index];
    }

}
