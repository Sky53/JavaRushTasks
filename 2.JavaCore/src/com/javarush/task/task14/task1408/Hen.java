package com.javarush.task.task14.task1408;

public abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я - курица.";
    }
}

class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    String getDescription() {
        return  super.getDescription() + " Моя страна - "+ Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 200;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - "+ Country.UKRAINE+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 300;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - "+ Country.MOLDOVA+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
class BelarusianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 400;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - "+ Country.BELARUS+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
