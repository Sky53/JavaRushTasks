package com.javarush.task.task27.task2712.ad;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.NoAvailableVideoEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AdvertisementManager {
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;


    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

//    public void processVideos() throws NoVideoAvailableException {
//
//        if (storage.list().isEmpty()) {
//
//            throw new NoVideoAvailableException();
//        } else {
//            List<Advertisement> listAD = new ArrayList<>();
//            for (Advertisement advertisement : storage.list())
//                if (advertisement.getDuration() <= timeSeconds & advertisement.getHits() > 0)
//                    listAD.add(advertisement);
//
//            listAD.sort(new Comparator<Advertisement>() {
//                @Override
//                public int compare(Advertisement o1, Advertisement o2) {
//                    int result = Long.compare(o1.getAmountPerOneDisplaying(), o2.getAmountPerOneDisplaying());
//                    if (result != 0)
//                        return -result;
//
//                    long oneSecondCost1 = o1.getAmountPerOneDisplaying() * 1000 / o1.getDuration();
//                    long oneSecondCost2 = o2.getAmountPerOneDisplaying() * 1000 / o2.getDuration();
//
//                    return Long.compare(oneSecondCost1, oneSecondCost2);
//                }
//            });
//
//            int timeLeft = timeSeconds;
//            for (Advertisement advertisement : listAD) {
//                if (timeLeft < advertisement.getDuration() || advertisement.getHits() < 0) {
//                    StatisticManager.getInstance().register(new NoAvailableVideoEventDataRow(timeSeconds));
//                    continue;
//                }
//                ConsoleHelper.writeMessage(advertisement.getName() + " is displaying... "
//                        + advertisement.getAmountPerOneDisplaying() + ", "
//                        + advertisement.getAmountPerOneDisplaying() * 1000 / advertisement.getDuration());
//                StatisticManager.getInstance().register(new VideoSelectedEventDataRow(listAD, timeLeft, timeSeconds));
//                timeLeft -= advertisement.getDuration();
//                advertisement.revalidate();
//
//            }
//
//
//            if (timeLeft == timeSeconds) {
//                StatisticManager.getInstance().register(new NoAvailableVideoEventDataRow(timeLeft));
//                throw new NoVideoAvailableException();
//            }
//            StatisticManager.getInstance().register(new VideoSelectedEventDataRow(listAD,timeLeft,timeSeconds));
//
//        }
//    }
public void processVideos() {
    Collections.sort(storage.list(), new Comparator<Advertisement>() {
        @Override
        public int compare(Advertisement o1, Advertisement o2) {
            int result = Long.compare(o1.getAmountPerOneDisplaying(), o2.getAmountPerOneDisplaying());
            if (result != 0) {
                return -result;
            }
            long oneSecondCost1 = o1.getAmountPerOneDisplaying() * 1000 / o1.getDuration();
            long oneSecondCost2 = o2.getAmountPerOneDisplaying() * 1000 / o2.getDuration();

            return Long.compare(oneSecondCost1, oneSecondCost2);
        }
    });

    int timeLeft = timeSeconds;

    int sumAmount = 0;
    int sumDuration = 0;
    for (Advertisement el : storage.list())
    {
        sumAmount += el.getAmountPerOneDisplaying();
        sumDuration += el.getDuration();
    }

    StatisticManager.getInstance().register(new VideoSelectedEventDataRow(storage.list(), sumAmount, sumDuration));


    for (Advertisement advertisement : storage.list()) {

        if  (timeLeft < advertisement.getDuration())    {
            continue;
        }

        try {
            if (advertisement.getHits() > 0) {
                advertisement.revalidate();
                ConsoleHelper.writeMessage(advertisement.getName() + " is displaying... "
                        + advertisement.getAmountPerOneDisplaying() + ", "
                        + advertisement.getAmountPerOneDisplaying() * 1000 / advertisement.getDuration());

                timeLeft -= advertisement.getDuration();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    if (timeLeft == timeSeconds) {
        throw new NoVideoAvailableException();
    }


}



}