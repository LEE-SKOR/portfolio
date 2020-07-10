package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.model.Friend;
import com.view.FriendDAOimpl;

public class DetailTest {

	@Test
	public void detailFriend() {
		FriendDAOimpl dao = new FriendDAOimpl();
		assertEquals("이명박",dao.friendDetail(25).getName()); //프렌드디테일로 25번을 불러오면 getName이 문자열과 같으면 오류가 안생긴다.
		
	}
	@Test
	public void insertFriend() {
		FriendDAOimpl dao = new FriendDAOimpl();
		Friend f = new Friend();
		f.setAddr("addrTest");
		f.setBirth("20200706");
		f.setName("test");
		f.setPhone("010");
		dao.friendInsert(f);
	}
}
