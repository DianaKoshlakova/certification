package certification.interfaces;

public interface DateValidator {
    boolean isValid(String dateStr);
    String okDate(boolean valid);
}