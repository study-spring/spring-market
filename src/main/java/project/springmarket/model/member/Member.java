package project.springmarket.model.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Member {
    private int memberNo;
    private String memberID;
    private String memberPW;
    private int addressNo;
}
