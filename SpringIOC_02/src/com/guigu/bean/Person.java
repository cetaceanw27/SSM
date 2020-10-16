package com.guigu.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

    /*基本标签直接使用
    <property name="lastName" value="zhang3"></property>
    从纯文本自动转化到基本类型
    */

    private String lastName;
    private Integer age;
    private String gender;
    private String enail;

    private Car car;

    private List<Book> books;

    private Map<String,Object> maps;

    private Properties properties;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", enail='" + enail + '\'' +
                ", car=" + car +
                ", books=" + books +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }

    public Person() {
        System.out.println("person success");
    }

    public Person(String lastName, Integer age, String gender, String enail) {
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.enail = enail;
        System.out.println("有参构造器...");
    }

    public Person(String lastName, Integer age, String gender, String enail, Car car, List<Book> books, Map<String, Object> maps, Properties properties) {
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.enail = enail;
        this.car = car;
        this.books = books;
        this.maps = maps;
        this.properties = properties;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEnail() {
        return enail;
    }

    public void setEnail(String enail) {
        this.enail = enail;
    }
}
