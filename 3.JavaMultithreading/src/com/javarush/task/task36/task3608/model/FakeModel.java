package com.javarush.task.task36.task3608.model;


import com.javarush.task.task36.task3608.bean.User;
import java.util.*;
import java.util.ArrayList;

//public class FakeModel implements Model {
//    private ModelData modelData = new ModelData();
//
//    @Override
//    public ModelData getModelData() {
//        return this.modelData;
//    }
//
//    @Override
//    public void loadUsers() {
//        ArrayList<User> users = new ArrayList<>();
//        users.add(new User("Fedor",1000,3));
//        users.add(new User("Victor",1100,2));
//        modelData.setUsers(users);
//    }
//
//    @Override
//    public void loadDeletedUsers() {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public void loadUserById(long userId) {
//        throw new  UnsupportedOperationException();
//    }
//}

public class FakeModel implements Model{
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return this.modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(Arrays.asList(new User("A", 1, 1),
                new User("B", 2, 1)));
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}