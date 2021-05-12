package org.example;

import org.example.models.WeekDay;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WeekDay today = WeekDay.WEDNESDAY;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal());
        WeekDay day = WeekDay.values()[today.ordinal()];
        System.out.println(day);

        for(WeekDay weekDay : WeekDay.values()){
            System.out.println(weekDay.getOpeningHours());
        }

        boolean equal = today == day;
        boolean equalWithMethod = today.equals(day);
        System.out.println(equal);
        System.out.println(equalWithMethod);

    }
}
