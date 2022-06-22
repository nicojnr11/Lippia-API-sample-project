package api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomFieldValue {

    @SerializedName("customFieldId")
    @Expose
    private String customFieldId;
    @SerializedName("timeEntryId")
    @Expose
    private String timeEntryId;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;

    public String getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(String customFieldId) {
        this.customFieldId = customFieldId;
    }

    public String getTimeEntryId() {
        return timeEntryId;
    }

    public void setTimeEntryId(String timeEntryId) {
        this.timeEntryId = timeEntryId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
