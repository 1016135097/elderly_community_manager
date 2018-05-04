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
 * 疾病情况表
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "illness")
public class IllnessEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private long userId;
  /**
   * 疾病名称
   */
  private String name;
  /**
   * 疾病状态
   */
  private String state;
  /**
   * 主治医院
   */
  private String hospital;
  /**
   * 是否有疾病
   */
  private long isillness;
}
