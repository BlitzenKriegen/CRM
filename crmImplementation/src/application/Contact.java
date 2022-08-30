package application;
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

    public void setBasic(String[] parts) {
        int len = parts.length;
        this.contactName = parts[0];
        this.contactEmail = parts[1];
        this.contactAddress = parts[2];
        this.contactPhoneNum = parts[3];
    }
}
