package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 * <li>именем;
 * <li>паспортными данными;
 * <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {


    private Passport passport;
    private Address address;
    
    /* TODO (Проверка №1)
        Добавить коментарии к полям и методам класса
        Имя необходимо объявлять в классе Passport, здесь String name не должно быть
    */

    public Person( Passport passport, Address address) {
        this.passport = passport;
        this.address = address;
    }

    public Passport getPassport() {
        return passport;
    }

    public Address getPersonAddress() {
        return address;
    }
    /*
     * TODO(Студент): Создайте класс Address.
     *
     * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons. СДЕЛАНО
     *
     * 2. Создайте класс, видимый из пакета. Подумайте о том
     *    Какое имя должен иметь класс, если он объявленн в этом
     *    файле. СДЕЛАНО
     *
     * 3. Подумайте над тем, какие переменные должены быть
     *    определены в классе. СДЕЛАНО
     *
     * 4. Подумайте над тем, какие методы должны быть объявлены
     *    в классе.
     */

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */

        //  Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя, Фимилию и Отчество, разделённые пробелом.
        if (passport.getName() != null && passport.getSurname() != null && passport.getFathername() != null)
            return passport.getName() + " " + passport.getSurname() + " " + passport.getFathername();
        //  Если у человека нет Отчества, но есть второе имя, то возвращает
        // Имя, Первую букву второго имени, и Фамилию, разделённые пробелом. После Инициала второго имени должна стоять точка.
        // Например, "Джером К. Джером".
        if (passport.getFathername() == null && passport.getSecondname() != null)

            return passport.getName() + "  " + passport.getSecondname().substring(0, 1) + ".  " + passport.getSurname();

        //  Если у человека нет ни Отчества ни Второго имени, а есть только Имя и Фамилия, то возвращает их, разделённые
        // пробелом.
        if (passport.getFathername() == null && passport.getSecondname() == null && passport.getName() != null && passport.getSurname() != null)

            return passport.getName() + " " + passport.getSurname();
        
        
        return null;


    }


    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */


        Address address = passport.getAddress();

        return address.getCountry() + " " + address.getPostcode()  +
                ((address.getOblast()== null) ? " " : address.getOblast() + " ") + ((address.getDistrict()==null) ? " ":
                address.getDistrict() + " ") + address.getCity() + " " + address.getStreet() + " " +
                address.getHouse() + "  " + address.getBlock() + " " + address.getApt();
        
        /*  TODO (Проверка №1)
            При выводе адресса null не надо выводить
            Исправить логигу метода. ИСПРАВЛЕНО
        */
    }


}