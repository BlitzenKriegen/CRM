package application;

/**
 * Below is the task class implementation for the CRM prototype.
 * @author Kiril
 * @param1 content: This is the text contained within a given task
 * @param2 dateCreated: This is the date of creation for the task. Used for
 * chronological ordering of the tasks within the GUI of the CRM.
 */
public class task {
    private String content;
    private String dateCreated;

    public task() {
        this.content = null;
        this.dateCreated = null;
    }

    public task(String con) {
        setContent(con);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
