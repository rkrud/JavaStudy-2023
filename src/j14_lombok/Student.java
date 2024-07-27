package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
//위에 4개를 묶어서 Data라고 함.
@Data
 
public class Student {
	private int studentCode;
	@NonNull
	private String name;
	private int StudentYear;
	private int age;
	

}
