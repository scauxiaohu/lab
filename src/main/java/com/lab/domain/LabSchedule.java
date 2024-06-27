package com.lab.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lab_schedule
 */
@TableName(value ="lab_schedule")
@Data
public class LabSchedule implements Serializable {
    /**
     * 老师申请排课id
     */
    @TableId(value = "ea_id", type = IdType.AUTO)
    private Integer ea_id;

    /**
     * 学期id
     */
    @TableField(value = "year_semester_id")
    private Integer year_semester_id;

    /**
     * 老师id
     */
    @TableField(value = "teacher_id")
    private Integer teacher_id;

    /**
     * 课程id
     */
    @TableField(value = "course_id")
    private Integer course_id;

    /**
     * 实验室类型：1软件 2硬件 3网络
     */
    @TableField(value = "lab_type_required")
    private Integer lab_type_required;

    /**
     * 班级id
     */
    @TableField(value = "class_id")
    private Integer class_id;

    /**
     * 开始周
     */
    @TableField(value = "start_week")
    private Integer start_week;

    /**
     * 持续周
     */
    @TableField(value = "continue_week")
    private Integer continue_week;

    /**
     * 实验室id
     */
    @TableField(value = "lab_id")
    private Integer lab_id;

    /**
     * 星期几：1：星期1 2：星期2 类推
     */
    @TableField(value = "weekday")
    private Integer weekday;

    /**
     * 节次： 1代表1-2，2代表3-4 类推 一共6节
     */
    @TableField(value = "slot")
    private Integer slot;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LabSchedule other = (LabSchedule) that;
        return (this.getEa_id() == null ? other.getEa_id() == null : this.getEa_id().equals(other.getEa_id()))
            && (this.getYear_semester_id() == null ? other.getYear_semester_id() == null : this.getYear_semester_id().equals(other.getYear_semester_id()))
            && (this.getTeacher_id() == null ? other.getTeacher_id() == null : this.getTeacher_id().equals(other.getTeacher_id()))
            && (this.getCourse_id() == null ? other.getCourse_id() == null : this.getCourse_id().equals(other.getCourse_id()))
            && (this.getLab_type_required() == null ? other.getLab_type_required() == null : this.getLab_type_required().equals(other.getLab_type_required()))
            && (this.getClass_id() == null ? other.getClass_id() == null : this.getClass_id().equals(other.getClass_id()))
            && (this.getStart_week() == null ? other.getStart_week() == null : this.getStart_week().equals(other.getStart_week()))
            && (this.getContinue_week() == null ? other.getContinue_week() == null : this.getContinue_week().equals(other.getContinue_week()))
            && (this.getLab_id() == null ? other.getLab_id() == null : this.getLab_id().equals(other.getLab_id()))
            && (this.getWeekday() == null ? other.getWeekday() == null : this.getWeekday().equals(other.getWeekday()))
            && (this.getSlot() == null ? other.getSlot() == null : this.getSlot().equals(other.getSlot()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEa_id() == null) ? 0 : getEa_id().hashCode());
        result = prime * result + ((getYear_semester_id() == null) ? 0 : getYear_semester_id().hashCode());
        result = prime * result + ((getTeacher_id() == null) ? 0 : getTeacher_id().hashCode());
        result = prime * result + ((getCourse_id() == null) ? 0 : getCourse_id().hashCode());
        result = prime * result + ((getLab_type_required() == null) ? 0 : getLab_type_required().hashCode());
        result = prime * result + ((getClass_id() == null) ? 0 : getClass_id().hashCode());
        result = prime * result + ((getStart_week() == null) ? 0 : getStart_week().hashCode());
        result = prime * result + ((getContinue_week() == null) ? 0 : getContinue_week().hashCode());
        result = prime * result + ((getLab_id() == null) ? 0 : getLab_id().hashCode());
        result = prime * result + ((getWeekday() == null) ? 0 : getWeekday().hashCode());
        result = prime * result + ((getSlot() == null) ? 0 : getSlot().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ea_id=").append(ea_id);
        sb.append(", year_semester_id=").append(year_semester_id);
        sb.append(", teacher_id=").append(teacher_id);
        sb.append(", course_id=").append(course_id);
        sb.append(", lab_type_required=").append(lab_type_required);
        sb.append(", class_id=").append(class_id);
        sb.append(", start_week=").append(start_week);
        sb.append(", continue_week=").append(continue_week);
        sb.append(", lab_id=").append(lab_id);
        sb.append(", weekday=").append(weekday);
        sb.append(", slot=").append(slot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}