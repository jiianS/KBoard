package com.k.board.service;

import java.util.HashMap;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

public class BoardDAOService implements BoardDAOInterface {

	@Resource(name = "sqlSession")
	SqlSession session;

	@Override
	public HashMap<String, Object> boardCall(HashMap<String, Object> param) {
		String sql = param.get("sql").toString();
		String sqlType = param.get("sqlType").toString();

		// HashMap 타입으로 결과값을 result에 담아 보내기
		HashMap<String, Object> result = new HashMap<String, Object>();

		// 해당 파라미터 값과 동일했을때, 다음과 같이 실행시키기 위한 조건문.
		if ("selectBoardList".equals(param.get("type"))) {
			result.put("result", session.selectList("board.selectBoardList"));

		} else if ("selectBoardOne".equals(param.get("type"))) {
			result.put("result", session.selectOne("board.selectBoardOne", param.get("param")));

		} else if ("insertBoard".equals(param.get("type"))) {
			result.put("result", session.insert("board.insertBoard", param.get("param")));

		} else if ("updateBoard".equals(param.get("type"))) {
			result.put("result", session.update("board.updateBoard", param.get("param")));

		} else if ("deleteBoard".equals(param.get("type"))) {
			result.put("result", session.update("board.deleteBoard", param.get("param")));
		}

		return result;
	}

}
