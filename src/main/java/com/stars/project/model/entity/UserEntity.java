package com.stars.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * @Author : WuWei
 * @Date : Created on 22:02 2018/4/14
 * @Description:
 * @Version : 1.0
 * @Modified By :
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {

  private long id;
  private String name;
  private long sex;
  private long age;
  private String mobile;
  private String idNumber;
  private String emergencyContact;
  private String password;
  private long type;
  private java.sql.Timestamp createTime;
}
