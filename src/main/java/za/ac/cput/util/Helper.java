package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {
    public static String generateID()
    {
        return UUID.randomUUID().toString();
    }

}
