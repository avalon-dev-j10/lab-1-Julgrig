package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;

import java.time.LocalDate;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    private String series;
    private int passportnumber;
    private String name;
    private String surname;
    private String fathername;
    private String secondname;
    private LocalDate dateOfBirth;
    private LocalDate DateOfIssue;
    private String placeofissuing;
    private Address address;
    
     /* TODO (Проверка №1)    
        Добавить коментарии к полям класса
        Исправить неправильное написание перемменых.
     */

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты/переменные класса.СДЕЛАНО
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра? Геттеры
     *
     * 3. Создайте все необходимые конструкторы класса. ОПределим по заданиям класса  main
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.    Ю : Поставить модификатор доступа  public к классу СДЕЛАНО
     */




    public Passport(String series, int passportnumber, String name, String surname, String fathername, String secondname,
                    LocalDate dateofbirth, LocalDate dateofissue, String placeofissuing, Address address) {
        this.series = series;
        this.passportnumber = passportnumber;
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.secondname = secondname;
        this.dateOfBirth = dateofbirth;
        this.DateOfIssue = dateofissue;
        this.placeofissuing = placeofissuing;
        this.address = address;
    }
    
    /*  TODO (Проверка №1)
        Создать еще несколько конструкторов с меньшим количеством параметров
        (некоторые поля класса в паспорт могут отсутствовать - второе имя, отчество, ...)
        Конструктор с меньшим количеством параметров вызывать через конструктор
        с большим кол. параметров или через конструктор с полным набором параметров класса.
    */

    public String getSeries() {
        return series;
    }

    public int getPassportnumber() {
        return passportnumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFathername() {
        return fathername;
    }

    public String getSecondname() {
        return secondname;
    }

    public LocalDate getDateofbirth() {
        return dateOfBirth;
    }

    public LocalDate getDateofissue() {
        return DateOfIssue;
    }

    public String getPlaceofissuing() {
        return placeofissuing;
    }

    public Address getAddress() {
        return address;
    }
}


