package ru.lesson.lessons;

/**
 * Realizarea exceptiilor personalizate
 */
public class UserException extends Exception {
    public UserException(final String message){
        super(message);
    }
}

