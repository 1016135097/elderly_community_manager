package com.stars.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


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
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  /**
   * 姓名
   */
  private String name;
  /**
   * 性别 0:男 1:女
   */
  private long sex;
  /**
   * 年龄
   */
  private long age;
  /**
   * 电话
   */
  private String mobile;
  /**
   * 紧急联系人
   */
  private String emergencyContact;
  /**
   * 是否需要帮助 0:需要 1:不需要
   */
  private long type;
  /**
   * 创建时间
   */
  private java.sql.Timestamp createTime;
}
