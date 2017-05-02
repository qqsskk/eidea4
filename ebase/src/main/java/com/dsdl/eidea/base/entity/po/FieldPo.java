
/**
* 版权所有 刘大磊 2013-07-01
* 作者：刘大磊
* 电话：13336390671
* email:ldlqdsd@126.com
*/
package com.dsdl.eidea.base.entity.po;

import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
/**
* table name core_field
*            字段表
* Date:2017-05-02 15:47:35
**/
@Getter
@Setter
@Entity(name = "core_field")
public class FieldPo implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[id]")
    @Id
    private Integer id;
    /**
    * 名称
    **/
    @Column(name = "[name]",length =200 )
    private String name;
    /**
    * 字段名
    **/
    @Column(name = "[field_name]",length =200 )
    private String fieldName;
    /**
    * 列id
    **/
    @Column(name = "[column_id]" )
    private Integer columnId;
    /**
    * 是否必填
    **/
    @Column(name = "[required]",length =1 )
    private String required;
    /**
    * 是否有效
    **/
    @Column(name = "[isactive]",length =1 )
    private String isactive;
    /**
    * 创建时间
    **/
    @Column(name = "[created]",length =19 )
    private Date created;
    /**
    * 创建人
    **/
    @Column(name = "[createdby]" )
    private Integer createdby;
    /**
    * 修改时间
    **/
    @Column(name = "[updated]",length =19 )
    private Date updated;
    /**
    * 修改人
    **/
    @Column(name = "[updatedby]" )
    private Integer updatedby;
    /**
    * 描述
    **/
    @Column(name = "[description]",length =500 )
    private String description;
    /**
    * 
    **/
    @Column(name = "[input_type]" )
    private Integer inputType;
}