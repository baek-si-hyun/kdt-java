package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.PostVO;
import vo.ReplyVO;

public class ReplyDAO {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
//	1. ��� ���
	public void replyInsert(ReplyVO replyVO) {
		String query = "INSERT INTO TBL_REPLY VALUES(SEQ_REPLY.NEXTVAL, ?, ?, ?)";
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getPostId());
			preparedStatement.setLong(3, MemberDAO.session);
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		
	}
	
//	2. ��� ���
	public void replyList() {
		String query = "SELECT ID, REPLY_CONTENT";
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	3. ��� ����
	
	
//	4. ��� ����
	
	
//	5. �Խñ� ��� �� ��� ������ ȭ�鿡 ���
	

}
