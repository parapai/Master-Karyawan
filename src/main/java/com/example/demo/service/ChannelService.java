package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.example.demo.vo.JsonVo;

@Service
public class ChannelService {

	public String findChannel(String channel) {
		
		List<JsonVo> voList = new ArrayList<>();
		String result = "";
		JsonVo vo = new JsonVo();
		vo.setChannel("ATM");
		vo.setFormat("ISO8583");
		voList.add(vo);
		
		JsonVo vo1 = new JsonVo();
		vo1.setChannel("MOB");
		vo1.setFormat("JSON");
		
		voList.add(vo1);
		
		JsonVo vo2 = new JsonVo();
		vo2.setChannel("SMS");
		vo2.setFormat("FTEX");
		
		voList.add(vo2);
		
		
		for (int i = 0; i < voList.size(); i++) {
			if(channel.equalsIgnoreCase(voList.get(i).getChannel())) {
				result = voList.get(i).getFormat();
			};
		}
		
		if(StringUtils.isEmpty(result)) {
			result = "Data tidak ditemukan";
		}
		
		return result;

	}

}
