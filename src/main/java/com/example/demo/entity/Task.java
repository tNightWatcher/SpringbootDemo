package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * description:任务实体类
 *
 * @package:com.example.demo.entity
 * @author:HP
 * @date:2019/7/8
 * @time:14:41
 */
@Document(collection = "task")
public class Task {
    @Id
    private String id;
    @Field("task_name")
    private String taskName;
    @Field("publisher")
    private String publisher;
    @Field("principal")
    private String principle;
    @Field("publish_time")
    private Date publishTime;
    @Field("expected_time")
    private Date expected_Time;
    @Field("task_overview")
    private String taskOverview;
    @Field("task_detail")
    private String taskDetail;
    @Field("premise")
    private String premise;
    @Field("schedule")
    private String schedule;
    @Field("accomplishment")
    private String accomplishment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getExpected_Time() {
        return expected_Time;
    }

    public void setExpected_Time(Date expected_Time) {
        this.expected_Time = expected_Time;
    }

    public String getTaskOverview() {
        return taskOverview;
    }

    public void setTaskOverview(String taskOverview) {
        this.taskOverview = taskOverview;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public String getPremise() {
        return premise;
    }

    public void setPremise(String premise) {
        this.premise = premise;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getAccomplishment() {
        return accomplishment;
    }

    public void setAccomplishment(String accomplishment) {
        this.accomplishment = accomplishment;
    }
}
