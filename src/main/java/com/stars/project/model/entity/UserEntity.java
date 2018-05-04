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
   * 住址
   */
  private String address;
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
   * 是否需要帮助 0:不需要 1:需要 2:已领取
   */
  private long type;
  /**
   * 是否为孤寡老人 0:否 1:是
   */
  private long retireType;
  /**
   * 是否有医疗保险 0:没有 1:有
   */
  private long medicalType;
  /**
   * 创建时间
   */
  private java.sql.Timestamp createTime;
}
