package wanglei_work.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class StudentDto {
  String name;
  Integer age;
}
