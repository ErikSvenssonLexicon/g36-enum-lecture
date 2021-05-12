package org.example.models;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public enum WeekDay {
    MONDAY(LocalTime.parse("08:00"), LocalTime.parse("18:00")),
    TUESDAY(LocalTime.parse("08:00"), LocalTime.parse("19:00")),
    WEDNESDAY(LocalTime.parse("08:00"), LocalTime.parse("16:00")),
    THURSDAY(LocalTime.parse("06:00"), LocalTime.parse("18:00")),
    FRIDAY(LocalTime.parse("08:00"), LocalTime.parse("18:00")),
    SATURDAY(LocalTime.parse("08:00"), LocalTime.parse("11:00")),
    SUNDAY(null, null){
        @Override
        public long getOpeningHours() {
            return 0;
        }
    };

    private LocalTime openingHour;
    private LocalTime closingHour;

    WeekDay(LocalTime openingHour, LocalTime closingHour) {
        this.openingHour = openingHour;
        this.closingHour = closingHour;
    }

    public LocalTime getOpeningHour() {
        return openingHour;
    }

    public LocalTime getClosingHour() {
        return closingHour;
    }

    public long getOpeningHours(){
        return ChronoUnit.HOURS.between(openingHour, closingHour);
    }


}
