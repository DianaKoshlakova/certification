package certification.exception;

public class NumberPhoneException extends RuntimeException{
    public NumberPhoneException() {
        super("Введен неправильный номер. Пожалуйста введите номер в формате 7 или 11 цифр.");
    }

    public NumberPhoneException(String message) {
        super(message);
    }
}
