package com.ex.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieVO {
	private Integer code;
	private String Title;
	private Integer price;
	private String director;
	private String actor;
	private String poster;
	private String synopsis;

}
