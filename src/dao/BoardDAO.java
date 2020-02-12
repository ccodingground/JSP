package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.BoardDTO;

public class BoardDAO {
	SqlSessionFactory sqlSessionFactory;
	SqlSession sqlSession;

	public BoardDAO(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory=sqlSessionFactory;
		//System.out.println("sqlSessionFactory : "+sqlSessionFactory);
	}

	public List<BoardDTO> selectBoardList() {
		sqlSession=sqlSessionFactory.openSession();
		//mapper에 있는 namespace.id 쿼리실행
		//실행후 결과 List<BoardDTO>로 리턴
		List<BoardDTO> result=sqlSession.selectList("board.selectBoardList");
		sqlSession.close();
		return result;
	}

	public BoardDTO selectBoardOne(int no) {
		sqlSession=sqlSessionFactory.openSession();
		//조회수 증가처리
		sqlSession.update("board.updateBoardCount", no);
		sqlSession.commit();
		//조회결과 갖고오기
		BoardDTO boardDTO=sqlSession.selectOne("board.selectBoardOne",no);
		sqlSession.close();
		return boardDTO;
	}

	public void deleteBoard(int no) {
		sqlSession=sqlSessionFactory.openSession();
		sqlSession.delete("board.deleteBoard", no);//no에 해당하는 글 삭제
		//db 데이터가 변경이 되었다면... commit을 해야합니다.
		sqlSession.commit();
		sqlSession.close();
	}
	
	
}
