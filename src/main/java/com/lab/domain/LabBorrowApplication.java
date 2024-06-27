package com.lab.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName lab_borrow_application
 */
@TableName(value ="lab_borrow_application")
@Data
public class LabBorrowApplication implements Serializable {
    /**
     * 学生申请实验室借用id
     */
    @TableId(value = "lba_id", type = IdType.AUTO)
    private Integer lba_id;

    /**
     * 学生id
     */
    @TableField(value = "student_id")
    private Integer student_id;

    /**
     * 学期id
     */
    @TableField(value = "year_semester_id")
    private Integer year_semester_id;

    /**
     * 使用周次 第几周使用
     */
    @TableField(value = "apply_use_week")
    private Integer apply_use_week;

    /**
     * 申请的实验室id
     */
    @TableField(value = "lab_id")
    private Integer lab_id;

    /**
     * 申请理由
     */
    @TableField(value = "reason")
    private String reason;

    /**
     * 申请日期
     */
    @TableField(value = "apply_date")
    private Date apply_date;

    /**
     * 状态 0未审核 1驳回 2通过
     */
    @TableField(value = "status")
    private Integer status;

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
        LabBorrowApplication other = (LabBorrowApplication) that;
        return (this.getLba_id() == null ? other.getLba_id() == null : this.getLba_id().equals(other.getLba_id()))
            && (this.getStudent_id() == null ? other.getStudent_id() == null : this.getStudent_id().equals(other.getStudent_id()))
            && (this.getYear_semester_id() == null ? other.getYear_semester_id() == null : this.getYear_semester_id().equals(other.getYear_semester_id()))
            && (this.getApply_use_week() == null ? other.getApply_use_week() == null : this.getApply_use_week().equals(other.getApply_use_week()))
            && (this.getLab_id() == null ? other.getLab_id() == null : this.getLab_id().equals(other.getLab_id()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getApply_date() == null ? other.getApply_date() == null : this.getApply_date().equals(other.getApply_date()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getWeekday() == null ? other.getWeekday() == null : this.getWeekday().equals(other.getWeekday()))
            && (this.getSlot() == null ? other.getSlot() == null : this.getSlot().equals(other.getSlot()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLba_id() == null) ? 0 : getLba_id().hashCode());
        result = prime * result + ((getStudent_id() == null) ? 0 : getStudent_id().hashCode());
        result = prime * result + ((getYear_semester_id() == null) ? 0 : getYear_semester_id().hashCode());
        result = prime * result + ((getApply_use_week() == null) ? 0 : getApply_use_week().hashCode());
        result = prime * result + ((getLab_id() == null) ? 0 : getLab_id().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getApply_date() == null) ? 0 : getApply_date().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", lba_id=").append(lba_id);
        sb.append(", student_id=").append(student_id);
        sb.append(", year_semester_id=").append(year_semester_id);
        sb.append(", apply_use_week=").append(apply_use_week);
        sb.append(", lab_id=").append(lab_id);
        sb.append(", reason=").append(reason);
        sb.append(", apply_date=").append(apply_date);
        sb.append(", status=").append(status);
        sb.append(", weekday=").append(weekday);
        sb.append(", slot=").append(slot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}