package com.interview.singtel.animals.utils;


import com.interview.singtel.animals.service.Activities;
import com.interview.singtel.animals.service.Fly;
import com.interview.singtel.animals.service.Sing;
import com.interview.singtel.animals.service.Sound;
import com.interview.singtel.animals.service.Swim;
import com.interview.singtel.animals.service.Walk;

public class ActivitiesFactory {

    public static Class<? extends Activities> getActivity(String activity) {
        switch (activity) {
            case "fly":
                return Fly.class;
            case "walk":
                return Walk.class;
            case "swim":
                return Swim.class;
            case "sing":
                return Sing.class;
            case "talk":
                return Sound.class;
            default:
                throw new RuntimeException("Invalid animal activity");
        }
    }
}
