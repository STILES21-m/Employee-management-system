package za.ac.cput.factory;

import za.ac.cput.entity.ContactType;
import za.ac.cput.util.Helper;

public class ContactTypeFactory {
    public static ContactType createContactType(String email, String phoneNumber){
        String id= Helper.generateID();
        String validEmail= String.valueOf(Helper.IsValidEmail(email));

        ContactType cntTyp= new ContactType.Builder().setContactId(id).setEmail(validEmail)
                .setPhoneNumber(phoneNumber).build();
        return cntTyp;
}
}