package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.NoVideoAvailableException;
import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.kitchen.Waiter;
import com.javarush.task.task27.task2712.statistic.StatisticManager;

public class Restaurant {
    public static void main(String[] args) throws NoVideoAvailableException {
        Cook cook = new Cook("SuperCook");
        Tablet tablet = new Tablet(1);
        Waiter noNameWaiter = new Waiter();
       // StatisticManager.getInstance().register(cook);
        cook.addObserver(noNameWaiter);
        tablet.addObserver(cook);
        tablet.createOrder();
        DirectorTablet directorTablet = new DirectorTablet();
      //  System.out.println("Static");
        directorTablet.printAdvertisementProfit();
        directorTablet.printCookWorkloading();
        directorTablet.printActiveVideoSet();
        directorTablet.printArchivedVideoSet();

//        tablet.createOrder();
//        tablet.createOrder();
//        tablet.createOrder();
//        tablet.createOrder();
    }
}
