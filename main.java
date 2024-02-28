package certification;

import certification.interfaces.DateValidator;
import certification.operation.DateValidatorUsingDateFormat;
import certification.operation.GiveInformationAboutString;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку для записи в файл в формате:" +
                " Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона(7 или 11 цифр)" +
                " пол(f(женский) или m(мужской))\nВсе данные нужно вводить через пробел.");
        String s = sc.nextLine();

        GiveInformationAboutString testString = new GiveInformationAboutString();
        DateValidator validator = new DateValidatorUsingDateFormat("dd.MM.yyyy");
        testString.isTheDataEnteredCorrect(s);
        String[] arrayTestString = testString.devideStringToArray(s);
        System.out.println(testString.getName(arrayTestString));
        System.out.println(validator.okDate(validator.isValid(testString.getDate(arrayTestString))));
        testString.isNumber(testString.getPhoneNumber(arrayTestString));
        testString.isSex(testString.getSex(arrayTestString));
        FileWriter fileWriter = new FileWriter(testString.getSurname(arrayTestString), true);
        fileWriter.write(s + "\n");
        fileWriter.close();
        sc.close();

    }

}