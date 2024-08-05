import java.util.Date;
import java.util.List;

public class CreateContentItemParameters {
    private String title;
    private String description;
    private List<String> tags;
    private String createdBy;
    private Date createdAt;

    // Constructor
    public CreateContentItemParameters(String title, String description, List<String> tags, String createdBy) {
        this.title = title;
        this.description = description;
        this.tags = tags;
        this.createdBy = createdBy;
        this.createdAt = new Date(); // current date and time
    }

    // Getters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public List<String> getTags() { return tags; }
    public String getCreatedBy() { return createdBy; }
    public Date getCreatedAt() { return createdAt; }
}
