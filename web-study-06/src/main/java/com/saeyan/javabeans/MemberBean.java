package com.saeyan.javabeans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberBean {
	
	private String name;
	private String userid;
	private String nickname;
	private String pwd;
	private String email;
	private String phone;
	
	
}
