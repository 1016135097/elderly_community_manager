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
 * 子女信息
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "children")
public class ChildrenEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private long userId;
  /**
   * 姓名
   */
  private String name;
  /**
   * 年龄
   */
  private long age;
  /**
   * 手机号
   */
  private String mobile;
  /**
   * 住址
   */
  private String address;
}
