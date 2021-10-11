package project.springmarket.model.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor

public class MemberAddressOnly {
    private String memberLoginID;
    private int addressCodeNo;
}
