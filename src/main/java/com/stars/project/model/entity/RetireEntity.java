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
 * 退休信息
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "retire")
public class RetireEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private long userId;
  /**
   * 退休年龄
   */
  private long age;
  /**
   * 退休类型
   */
  private String type;
}
