package com.javarush.task.task23.task2309;

import com.javarush.task.task23.task2309.vo.*;

import java.util.ArrayList;
import java.util.List;

/* 
Анонимность иногда так приятна!
*/
public class Solution {
    private List<User> getUsers() {
        return new AbstractDbSelectExecutor<User>() {

            public String getQuery() {
                return "SELECT * FROM USER";
            }
        }.execute();
    }

    private List<Location> getLocations() {
        return new AbstractDbSelectExecutor<Location>() {

            public String getQuery() {
                return "SELECT * FROM LOCATION";
            }
        }.execute();
    }

    private List<Server> getServers() {
        return new AbstractDbSelectExecutor<Server>() {

            public String getQuery() {
                return "SELECT * FROM SERVER";
            }
        }.execute();
    }

    private List<Subject> getSubjects() {
        return new AbstractDbSelectExecutor<Subject>() {

            public String getQuery() {
                return "SELECT * FROM SUBJECT";
            }
        }.execute();
    }

    private List<Subscription> getSubscriptions() {
        return new AbstractDbSelectExecutor<Subscription>() {

            public String getQuery() {
                return "SELECT * FROM SUBSCRIPTION";
            }
        }.execute();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        print(solution.getUsers());
        print(solution.getLocations());
    }

    public static void print(List list) {
        String format = "Id=%d, name='%s', description=%s";
        for (Object obj : list) {
            NamedItem item = (NamedItem) obj;
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }
}
