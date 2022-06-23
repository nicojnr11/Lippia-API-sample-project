package api.model.TimeEntry;

import api.model.TimeEntry.CustomFieldValue;
import api.model.TimeEntry.TimeInterval;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UpdateTimeEntryResponse{

    @SerializedName("billable")
    @Expose
    private String billable;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("isLocked")
    @Expose
    private String isLocked;
    @SerializedName("projectId")
    @Expose
    private String projectId;
    @SerializedName("tagIds")
    @Expose
    private List<String> tagIds = null;
    @SerializedName("taskId")
    @Expose
    private String taskId;
    @SerializedName("timeInterval")
    @Expose
    private TimeInterval timeInterval;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("workspaceId")
    @Expose
    private String workspaceId;
    @SerializedName("customFieldValues")
    @Expose
    private List<CustomFieldValue> customFieldValues = null;

    public String getBillable() {
        return billable;
    }

    public void setBillable(String billable) {
        this.billable = billable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(String isLocked) {
        this.isLocked = isLocked;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public List<CustomFieldValue> getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(List<CustomFieldValue> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

}
