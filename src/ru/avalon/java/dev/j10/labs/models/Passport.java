package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

import java.time.LocalDate;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 * <li> серию и номер документа;
 * <li> имя;
 * <li> фамилию;
 * <li> отчество;
 * <li> второе имя;
 * <li> день рождения;
 * <li> дату выдачи;
 * <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    private String series;  // Серия паспорта
    private int passportNumber; //  Номер паспорта
    private String name;  // Имя
    private String surname; // Фамилия
    private String fatherName; // Отчество
    private String secondName; //  Второе имя
    private LocalDate dateOfBirth; // Дата рождения
    private LocalDate dateOfIssue;   // Дата выдачи паспорта
    private String placeOfIssuing; // Место выдачи паспорта
    private Address address; // Адрес
    
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

    // Конструктор со всеми параметрами
    public Passport(String series, int passportNumber, String name, String surname, String fatherName, String secondName,
                    LocalDate dateOfBirth, LocalDate dateOfIssue, String placeOfIssuing, Address address) {
        this.series = series;
        this.passportNumber = passportNumber;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfIssue = dateOfIssue;
        this.placeOfIssuing = placeOfIssuing;
        this.address = address;
    }

    // Конструктор без Отчества
    public Passport(String series, int passportNumber, String name, String surname, String secondName,
                    LocalDate dateOfBirth, LocalDate dateOfIssue, String placeOfIssuing, Address address) {
        this(series, passportNumber, name, surname, null, secondName,
                dateOfBirth, dateOfIssue, placeOfIssuing, address);

    }

    // Конструктор без Отчества и Второго имени
    public Passport(String series, int passportNumber, String name, String surname,
                    LocalDate dateOfBirth, LocalDate dateOfIssue, String placeOfIssuing, Address address) {
        this(series, passportNumber, name, surname, null, null,
                dateOfBirth, dateOfIssue, placeOfIssuing, address);
    }

    // Конструктор без второго имени

    public Passport(Address address, String series, int passportNumber, String name, String surname, String fatherName,
                    LocalDate dateOfBirth, LocalDate dateOfIssue, String placeOfIssuing) {
        this(series, passportNumber, name, surname, fatherName, null,
                dateOfBirth, dateOfIssue, placeOfIssuing, address);
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
        return passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFathername() {
        return fatherName;
    }

    public String getSecondname() {
        return secondName;
    }

    public LocalDate getDateofbirth() {
        return dateOfBirth;
    }

    public LocalDate getDateofissue() {
        return dateOfIssue;
    }

    public String getPlaceofissuing() {
        return placeOfIssuing;
    }

    public Address getAddress() {
        return address;
    }
}


