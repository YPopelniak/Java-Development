import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class NewEmployee {
    private int empId;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumbers;
}