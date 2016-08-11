package com.spring.demo;

/**
 * Created by ttnd on 2/4/16.
 */
public class Database {
    private String name;
    private Integer port;


    public  void setName(String name)
    {

        this.name =name;
    }
    public  void setPort(Integer port)
    {

        this.port =port;
    }

    public String getName() {
        return name;
    }

    public Integer getPort() {
        return port;
    }

    public Database(String name, Integer port) {
        this.name = name;
        this.port = port;
    }

    public Database() {

    }

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }
}
