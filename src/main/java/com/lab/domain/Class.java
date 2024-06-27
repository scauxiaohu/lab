package com.lab.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName class
 */
@TableName(value ="class")
@Data
public class Class implements Serializable {
    /**
     * 班级id
     */
    @TableId(value = "class_id", type = IdType.AUTO)
    private Integer class_id;

    /**
     * 班级名字
     */
    @TableField(value = "class_name")
    private String class_name;

    /**
     * 班级人数
     */
    @TableField(value = "class_number")
    private Integer class_number;

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
        Class other = (Class) that;
        return (this.getClass_id() == null ? other.getClass_id() == null : this.getClass_id().equals(other.getClass_id()))
            && (this.getClass_name() == null ? other.getClass_name() == null : this.getClass_name().equals(other.getClass_name()))
            && (this.getClass_number() == null ? other.getClass_number() == null : this.getClass_number().equals(other.getClass_number()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClass_id() == null) ? 0 : getClass_id().hashCode());
        result = prime * result + ((getClass_name() == null) ? 0 : getClass_name().hashCode());
        result = prime * result + ((getClass_number() == null) ? 0 : getClass_number().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", class_id=").append(class_id);
        sb.append(", class_name=").append(class_name);
        sb.append(", class_number=").append(class_number);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}