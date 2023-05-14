package com.inho.demo.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
public class BoardDTO {
	private int id;
	private String title;
	private String content;
	@Setter(onMethod_=@JsonFormat(pattern="yyyy-MM-dd HH:mm" , timezone = "Asia/Seoul"))
	private Date date;
}
