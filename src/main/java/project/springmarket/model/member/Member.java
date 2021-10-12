package project.springmarket.model.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Member {
    private int memberNo;
    private String memberLoginID;
    private String memberLoginPW;
    private int addressCodeNo;
}
