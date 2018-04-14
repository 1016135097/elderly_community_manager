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
@Table(name = "residence")
public class ResidenceEntity {

  private long id;
  private long userId;
  private String address;
  private String mobile;

}
