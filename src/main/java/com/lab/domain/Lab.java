package com.lab.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName lab
 */
@TableName(value ="lab")
@Data
public class Lab implements Serializable {
    /**
     * 实验室id
     */
    @TableId(value = "lab_id", type = IdType.AUTO)
    private Integer lab_id;

    /**
     * 实验室编号
     */
    @TableField(value = "lab_number")
    private String lab_number;

    /**
     * 实验室名称
     */
    @TableField(value = "lab_name")
    private String lab_name;

    /**
     * 实验室类型 1：软件 2：硬件 3：网络
     */
    @TableField(value = "lab_type")
    private Integer lab_type;

    /**
     * 器材数量
     */
    @TableField(value = "equipment_count")
    private Integer equipment_count;

    /**
     * 实验室维修员id
     */
    @TableField(value = "lab_manager_id")
    private String lab_manager_id;

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
        Lab other = (Lab) that;
        return (this.getLab_id() == null ? other.getLab_id() == null : this.getLab_id().equals(other.getLab_id()))
            && (this.getLab_number() == null ? other.getLab_number() == null : this.getLab_number().equals(other.getLab_number()))
            && (this.getLab_name() == null ? other.getLab_name() == null : this.getLab_name().equals(other.getLab_name()))
            && (this.getLab_type() == null ? other.getLab_type() == null : this.getLab_type().equals(other.getLab_type()))
            && (this.getEquipment_count() == null ? other.getEquipment_count() == null : this.getEquipment_count().equals(other.getEquipment_count()))
            && (this.getLab_manager_id() == null ? other.getLab_manager_id() == null : this.getLab_manager_id().equals(other.getLab_manager_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLab_id() == null) ? 0 : getLab_id().hashCode());
        result = prime * result + ((getLab_number() == null) ? 0 : getLab_number().hashCode());
        result = prime * result + ((getLab_name() == null) ? 0 : getLab_name().hashCode());
        result = prime * result + ((getLab_type() == null) ? 0 : getLab_type().hashCode());
        result = prime * result + ((getEquipment_count() == null) ? 0 : getEquipment_count().hashCode());
        result = prime * result + ((getLab_manager_id() == null) ? 0 : getLab_manager_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lab_id=").append(lab_id);
        sb.append(", lab_number=").append(lab_number);
        sb.append(", lab_name=").append(lab_name);
        sb.append(", lab_type=").append(lab_type);
        sb.append(", equipment_count=").append(equipment_count);
        sb.append(", lab_manager_id=").append(lab_manager_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}