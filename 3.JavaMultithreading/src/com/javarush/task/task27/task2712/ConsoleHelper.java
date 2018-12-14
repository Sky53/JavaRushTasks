package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    volatile static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishesTmp = new ArrayList<>();
        ConsoleHelper.writeMessage("доступны блюда :");
        ConsoleHelper.writeMessage(Dish.allDishesToString());
        ConsoleHelper.writeMessage("Наберите название блюда в заказ (exit для завершения заказа)");
        String choosenDishString = readString();
        while (!choosenDishString.equals("exit") ) {
            ConsoleHelper.writeMessage("Наберите название блюда в заказ (exit для завершения заказа)");
            try {
                dishesTmp.add(Dish.valueOf(choosenDishString));
            } catch (IllegalArgumentException e) {
                ConsoleHelper.writeMessage("такого блюда тен в меню. пробуй еще раз");
            }
            choosenDishString = readString();
        }
        return  dishesTmp;
    }
}
