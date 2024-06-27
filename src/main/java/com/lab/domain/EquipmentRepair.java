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
 * @TableName equipment_repair
 */
@TableName(value ="equipment_repair")
@Data
public class EquipmentRepair implements Serializable {
    /**
     * 主键id
     */
    @TableId(value = "er_id", type = IdType.AUTO)
    private Integer er_id;

    /**
     * 提交修理的老师id
     */
    @TableField(value = "teacher_id")
    private Integer teacher_id;

    /**
     * 实验室id
     */
    @TableField(value = "lab_id")
    private Integer lab_id;

    /**
     * 实验损坏描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 维修状态0未维修 1已维修
     */
    @TableField(value = "repair_status")
    private Integer repair_status;

    /**
     * 维修提交日期
     */
    @TableField(value = "repair_date")
    private Date repair_date;

    /**
     * 修理描述 1的时候有内容
     */
    @TableField(value = "repair_description")
    private String repair_description;

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
        EquipmentRepair other = (EquipmentRepair) that;
        return (this.getEr_id() == null ? other.getEr_id() == null : this.getEr_id().equals(other.getEr_id()))
            && (this.getTeacher_id() == null ? other.getTeacher_id() == null : this.getTeacher_id().equals(other.getTeacher_id()))
            && (this.getLab_id() == null ? other.getLab_id() == null : this.getLab_id().equals(other.getLab_id()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getRepair_status() == null ? other.getRepair_status() == null : this.getRepair_status().equals(other.getRepair_status()))
            && (this.getRepair_date() == null ? other.getRepair_date() == null : this.getRepair_date().equals(other.getRepair_date()))
            && (this.getRepair_description() == null ? other.getRepair_description() == null : this.getRepair_description().equals(other.getRepair_description()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEr_id() == null) ? 0 : getEr_id().hashCode());
        result = prime * result + ((getTeacher_id() == null) ? 0 : getTeacher_id().hashCode());
        result = prime * result + ((getLab_id() == null) ? 0 : getLab_id().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getRepair_status() == null) ? 0 : getRepair_status().hashCode());
        result = prime * result + ((getRepair_date() == null) ? 0 : getRepair_date().hashCode());
        result = prime * result + ((getRepair_description() == null) ? 0 : getRepair_description().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", er_id=").append(er_id);
        sb.append(", teacher_id=").append(teacher_id);
        sb.append(", lab_id=").append(lab_id);
        sb.append(", description=").append(description);
        sb.append(", repair_status=").append(repair_status);
        sb.append(", repair_date=").append(repair_date);
        sb.append(", repair_description=").append(repair_description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}