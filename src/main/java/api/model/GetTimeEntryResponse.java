package api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetTimeEntryResponse {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("tagIds")
    @Expose
    private Object tagIds;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("billable")
    @Expose
    private Boolean billable;
    @SerializedName("taskId")
    @Expose
    private Object taskId;
    @SerializedName("projectId")
    @Expose
    private Object projectId;
    @SerializedName("timeInterval")
    @Expose
    private TimeInterval timeInterval;
    @SerializedName("workspaceId")
    @Expose
    private String workspaceId;
    @SerializedName("isLocked")
    @Expose
    private Boolean isLocked;
    @SerializedName("customFieldValues")
    @Expose
    private List<Object> customFieldValues = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getTagIds() {
        return tagIds;
    }

    public void setTagIds(Object tagIds) {
        this.tagIds = tagIds;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getBillable() {
        return billable;
    }

    public void setBillable(Boolean billable) {
        this.billable = billable;
    }

    public Object getTaskId() {
        return taskId;
    }

    public void setTaskId(Object taskId) {
        this.taskId = taskId;
    }

    public Object getProjectId() {
        return projectId;
    }

    public void setProjectId(Object projectId) {
        this.projectId = projectId;
    }

    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public List<Object> getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(List<Object> customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

}
