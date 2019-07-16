package com.javarush.task.task23.task2309;


import com.javarush.task.task23.task2309.Vo.*;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        print(solution.getUsers());
        print(solution.getLocations());
        print(solution.getServers());
        print(solution.getSubjects());
        print(solution.getSubscriptions());
    }

    public List<User> getUsers() {
return new AbstractDbSelectExecutor<User>(){
    @Override
    public String getQuery() {
        return "select * from user";
    }
}.execute();

    }

    public List<Location> getLocations() {
        return new AbstractDbSelectExecutor<Location>(){
            @Override
            public String getQuery() {
                return "select * from location";
            }
        }.execute();

    }

    public List<Server> getServers() {
        return new AbstractDbSelectExecutor<Server>(){
            @Override
            public String getQuery() {
                return "select * from server";
            }
        }.execute();

    }

    public List<Subject> getSubjects() {
        return new AbstractDbSelectExecutor<Subject>(){
            @Override
            public String getQuery() {
                return "select * from subject";
            }
        }.execute();

    }

    public List<Subscription> getSubscriptions() {
        return new AbstractDbSelectExecutor<Subscription>(){
            @Override
            public String getQuery() {
                return "select * from subscription";
            }
        }.execute();

    }


    public static void print(List list) {
        String format = "Id=%d, name='%s', description=%s";
        for (Object obj : list) {
            NamedItem item = (NamedItem) obj;
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }
}
