package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.ad.NoVideoAvailableException;
import com.javarush.task.task27.task2712.kitchen.Order;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet extends Observable {
    protected final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder() throws NoVideoAvailableException {
        Order order = null;
        AdvertisementManager advertisementManager = null;
        try {
            order = new Order(this);
            ConsoleHelper.writeMessage(order.toString());
            setChanged();
            if (!order.isEmpty()) {
                notifyObservers(order);
                new AdvertisementManager(order.getTotalCookingTime() * 60).processVideos();

            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
            return null;
        }
        catch (NoVideoAvailableException exc){
            logger.log(Level.INFO,"No video is available for the order " + order.toString());
        }
        return order;
    }


    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
