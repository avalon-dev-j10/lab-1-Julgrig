package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */
  /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'. С
         */

        Person ivanov = null;
        Person smith = null;

        Passport ivanovPassport = new Passport("АК", 543246, "Иван", "Иванов", "", null,
                LocalDate.of(1970, 03, 20), LocalDate.of(2015, 04, 30), "OVD", new Address("Россия", 132245, null, null,
                "Москва", "Ленинский проспект", "25А", 3, 125 ) );
        Address ivanovAddress = new Address("Россия", 192236, null, null, "Санкт-Петербург", "Невский проспект",
                "100", 0, 100 );
        ivanov = new Person(ivanovPassport, ivanovAddress);

        Passport smithPassport = new Passport("RE", 444444, "John", "Smith", null, "Edvard", LocalDate.of(1980, 04, 12),
                LocalDate.of(2018, 03, 30), "UK", new Address("The USA", 7777, null, null, "New York",
                "Brighton Street", "12", 0, 23) );
        Address smithAddress = new Address("The United Kingdom", 44444, null, null, "London", "Queen's Street",
                "12", 0, 34);
        smith = new Person(smithPassport, smithAddress);
        
        /* TODO (Проверка №1)
            Имя объявляется в классе Passport, в классе Person его не надо повторять
            Исправить!  СДЕЛАНО
        */


        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        String ivanovFullName = ivanov.getFullName();
        System.out.println( ivanovFullName );

        String smithFullName =smith.getFullName();
        System.out.println(smithFullName);

        String ivanovFullAddress = ivanov.getAddress();
        System.out.println(ivanovFullAddress);

        String smithFullAddress = smith.getAddress();
        System.out.println(smithFullAddress);


        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
