package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    private String country;
    private int postcode;
    private String oblast;
    private String district;
    private String city;
    private String street;
    private String house;
    private int block;
    private int apt;


    // создаем конструктор, чтобы проинициализировать поля класса
    public Address(String country, int postcode, String oblast, String district, String city, String street,
                   String house, int block, int apt) {
        this.country = country;
        this.postcode = postcode;
        this.oblast = oblast;
        this.district = district;
        this.city = city;
        this.street = street;
        this.house = house;
        this.block = block;
        this.apt = apt;
    }

    // создаем геттеры, чтобы обратиться к переменным этого класса
    public String getCountry() {
        return country;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getOblast() {
        return oblast;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public int getBlock() {
        return block;
    }

    public int getApt() {
        return apt;
    }

}






/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons. СДЕЛАНО
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле. СДЕЛАНО , класс  public виден другим пакетам
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе. СДЕЛАНО
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе. СДЕЛАНО Конструктор и геттеры
 */