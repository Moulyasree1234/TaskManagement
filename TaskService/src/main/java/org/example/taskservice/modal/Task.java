package org.example.taskservice.modal;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data


public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String image;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime deadline;
    private Long assignedUserId;

    public Task() {
    }

    // 1) Mark this as an element collection
    @ElementCollection
    // 2) Define the table and the column for storing tags
    @CollectionTable(
            name = "task_tags",
            joinColumns = @JoinColumn(name = "task_id") // foreign key column in task_tags table
    )
    @Column(name = "tag") // column in task_tags table
    private List<String> tags = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public Long getAssignedUserId() {
        return assignedUserId;
    }

    public void setAssignedUserId(Long assignedUserId) {
        this.assignedUserId = assignedUserId;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Task(Long id, String title, String description, String image, TaskStatus status, LocalDateTime createdAt, LocalDateTime deadline, Long assignedUserId, List<String> tags) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.status = status;
        this.createdAt = createdAt;
        this.deadline = deadline;
        this.assignedUserId = assignedUserId;
        this.tags = tags;
    }
// ...
    // Getters/Setters if needed (Lombok @Data already generates them)
}


