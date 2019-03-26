package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    // Объявляем переменные класса Address
    private String country;  //  Страна
    private int postcode;    //  Индекс
    private String oblast;   //  Область
    private String district; //   Район
    private String city;     //   Город
    private String street;   //   Улица
    private String house;    //   Дом
    private int block;       //   Корпус
    private int apt;         //   Квартира
    
     /* TODO (Проверка №1)    
        Добавить коментарии к полям класса  СДЕЛАНО
     */

    // создаем конструкторы, чтобы проинициализировать поля класса
   // конструктор со всеми параметрами
    public Address(String country, int postcode, String oblast, String district, String city, String street, String house, int block, int apt) {
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

    // конструктор без квартиры
    public Address(String country, int postcode, String oblast, String district, String city, String street, String house, int block) {
        this(country, postcode, oblast, district, city, street, house, block, 0);
    }
  // конструктор без корпуса, квартиры
    public Address(String country, int postcode, String oblast, String district, String city, String street, String house) {
        this(country, postcode, oblast, district, city, street, house, 0, 0);
    }

    // конструктор без района, корпуса, квартиры
    public Address(String country, int postcode, String oblast, String city, String street, String house) {
        this(country, postcode, oblast, null, city, street, house, 0, 0);
    }

    // конструктор без области, района, корпуса, квартиры
    public Address(String country, int postcode,  String city, String street, String house) {
        this(country, postcode, null, null, city, street, house, 0, 0);
    }




    
    /*  TODO (Проверка №1)
        Создать еще несколько конструкторов с меньшим количеством параметров
        (некоторые поля класса в адресе могут отсутствовать)
        Конструктор с меньшим количеством параметров вызывать через конструктор
        с большим кол. параметров или через конструктор с полным набором параметров класса.СДЕЛАНО
    */

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