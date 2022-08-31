package application;

import java.util.Scanner;

/**
 * Below is the contact class implementation for the CRM prototype.
 * @author Kiril
 * @param1 contactName: This holds the name of the client
 * @param2 contactEmail: This holds the email of the client. Note that
 * this parameter should and will be used as a primary key for sorting.
 * @param3 contactAddress: Holds the address of the client.
 * @param4 contactPhoneNum: Holds the phone number of the client
 * @param5 contactTasks: Holds the tasks associated with the contact.
 */
public class Contact {
    private String contactName;
    private String contactEmail;
    private String contactAddress;
    private String contactPhoneNum;
    private task contactTasks[];

    public Contact() {
        this.contactName = null;
        this.contactEmail = null;
        this.contactAddress = null;
        this.contactPhoneNum = null;
        this.contactTasks = null;
    }

    public Contact(String name, String email, String address, String phone) {
        setContactName(name);
        setContactEmail(email);
        setContactAddress(address);
        setContactPhoneNum(phone);
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactPhoneNum() {
        return contactPhoneNum;
    }

    public void setContactPhoneNum(String contactPhoneNum) {
        this.contactPhoneNum = contactPhoneNum;
    }

    public task[] getContactTasks() {
        return contactTasks;
    }

    public void setContactTasks(task contactTasks[]) {
        this.contactTasks = contactTasks;
    }

    public Contact setBasic(String[] parts, Contact con) {
        con.setContactName(parts[0]);
        con.setContactEmail(parts[1]);
        con.setContactAddress(parts[2]);
        con.setContactPhoneNum(parts[3]);
        return con;
    }

    public Contact grabContact(Scanner readFile) {
        Contact data = new Contact();
        String input;

        if(readFile.hasNext()) {
            input = readFile.nextLine();
            String[] parts = input.split("[|]", 4);
            data = setBasic(parts, data);
            data.setContactTasks(grabTasks(readFile));
        }
        return data;
    }

    private task[] grabTasks(Scanner readFile) {

        return null;
    }
}
