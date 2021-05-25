package wanglei_work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import wanglei_work.dto.StudentDto;
import wanglei_work.dto.StudentDto.StudentDtoBuilder;

public class TestFive {

  public static void main(final String[] args) {
    final StudentDto studentDto1 = StudentDto.builder().build();
    final StudentDto studentDto2 = StudentDto.builder().build();
    final ArrayList<StudentDto> students = new ArrayList<>();
    students.add(studentDto1);
    students.add(studentDto2);

    final List<StudentDto> students2 =
        students.stream()
            .map(
                studentDto -> {
                  final StudentDtoBuilder studentDtoBuilder = studentDto1.toBuilder();
                  return studentDtoBuilder.name("1").age(2).build();
                })
            .collect(Collectors.toList());

    System.out.println(students);
    System.out.println(students2);
  }
}
