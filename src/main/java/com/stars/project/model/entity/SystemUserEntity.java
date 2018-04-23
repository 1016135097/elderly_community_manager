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
@Table(name = "system_user")
public class SystemUserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  /**
   * 用户姓名
   */
  private String userName;
  /**
   * 0:男 1:女
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
   * 身份证
   */
  private String idNumber;
  /**
   * 邮箱
   */
  private String email;
  /**
   * 密码
   */
  private String password;
  /**
   * 用类型0:普通 1：管理员
   */
  private long type;
  /**
   * 创建时间
   */
  private java.sql.Timestamp createTime;

}
