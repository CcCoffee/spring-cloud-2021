package com.study.cloud.model.database;

import com.study.cloud.model.constant.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(TableName.API_ROUTE)
public class ApiRoute {
  
  @Id
  private Long id;
  
  private String path;
  private String method;
  private String uri;
}
