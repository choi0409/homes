package com.kpc.homes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpc.homes.AptVO;
import com.kpc.mapper.AptMapper;

@Service
public class AptServiceImpl implements AptService {

	@Autowired
	AptMapper dao;	//BoardMapper라는 namespace에 있는 id를 가져오게된다




	@Override
	public ArrayList<AptVO> svcAptlist(String searchKey, String searchStr) {
		ArrayList<AptVO> list = dao.aptlist(searchKey, searchStr);
		return list;
	}

	@Override
	public ArrayList<AptVO> svcAptview(String aptStr, String areaStr) {
		System.out.println("Service 실행.....");
		ArrayList<AptVO> list = dao.aptview(aptStr, areaStr);
		return list;
	}

	@Override
	public String svcAptCount() {
		System.out.println("성공");
		String num = dao.aptCount();
		return num;
	}

	@Override
	public ArrayList<AptVO> svcGooglemap(String searchKey, String searchStr) {
		ArrayList<AptVO> list = dao.googlemap(searchKey, searchStr);
		return list;
	}
	

}
