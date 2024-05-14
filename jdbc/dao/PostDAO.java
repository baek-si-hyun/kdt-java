package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.PostDTO;
import vo.PostVO;
import vo.ReplyDTO;

public class PostDAO {
   Connection connection;
   PreparedStatement preparedStatement;
   ResultSet resultSet;
   
   
//   �Խñ� ���
   public void insert(PostVO postVO) {
      String query = "INSERT INTO TBL_POST VALUES(SEQ_POST.NEXTVAL, ?, ?, ?)";
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, postVO.getPostTitle());
         preparedStatement.setString(2, postVO.getPostContent());
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
   
//   �Խñ� ��ü ���
   public List<PostDTO> selectAll(){
      String query = "SELECT P.ID, POST_TITLE, POST_CONTENT, M.MEMBER_ID, M.MEMBER_NAME "
            + "FROM TBL_MEMBER M JOIN TBL_POST P "
            + "ON M.ID = P.MEMBER_ID";

      ArrayList<PostDTO> posts = new ArrayList<PostDTO>();
      PostDTO postDTO = new PostDTO();
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         while(resultSet.next()) {
            postDTO.setId(resultSet.getLong(1));
            postDTO.setPostTitle(resultSet.getString(2));
            postDTO.setPostContent(resultSet.getString(3));
            postDTO.setMemberIdentification(resultSet.getString(4));
            postDTO.setMemberName(resultSet.getString(5));
            
            posts.add(postDTO);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
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
      
      return posts;
      
   }
   
//   �Խñ� ��ȸ(ȸ���� �̸����� ��ȸ)
   public PostDTO findById(Long id) {
      String query = "SELECT P.ID, POST_TITLE, POST_CONTENT, M.MEMBER_ID, M.MEMBER_NAME "
            + "FROM TBL_MEMBER M JOIN TBL_POST P "
            + "ON M.ID = P.MEMBER_ID AND P.ID = ?";
      PostDTO postDTO = new PostDTO();
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         resultSet = preparedStatement.executeQuery();
         
         resultSet.next();
            
         postDTO.setId(resultSet.getLong(1));
         postDTO.setPostTitle(resultSet.getString(2));
         postDTO.setPostContent(resultSet.getString(3));
         postDTO.setMemberIdentification(resultSet.getString(4));
         postDTO.setMemberName(resultSet.getString(5));
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
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
      
      return postDTO;
      
   }
   
//   �Խñ� ����(����� ���븸 ���� ����)
   public void update(PostVO postVO) {
      String query = "UPDATE TBL_POST SET POST_TITLE = ?, POST_CONTENT = ? WHERE ID = ?";
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, postVO.getPostTitle());
         preparedStatement.setString(2, postVO.getPostContent());
         preparedStatement.setLong(3, postVO.getId());
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
   
   
//   �Խñ� ����
   public void delete(Long id) {
      String query = "DELETE FROM TBL_POST WHERE ID = ?";
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
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
   
//   �Խñ� ����
   public void deleteByMemberId() {
      String query = "DELETE FROM TBL_POST WHERE MEMBER_ID = ?";
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, MemberDAO.session);
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
   
//   �Խñ� ��� �� ��� ������ ȭ�鿡 ���
   public List<ReplyDTO> getListWithReplyCount() {
      String query = "SELECT P.ID, P.POST_TITLE, P.POST_CONTENT, M.MEMBER_ID, M.MEMBER_NAME, NVL(REPLY_COUNT, 0) REPLY_COUNT FROM TBL_POST P "
            + "LEFT OUTER JOIN "
            + "("
            + "   SELECT POST_ID, COUNT(ID) REPLY_COUNT FROM TBL_REPLY "
            + "   GROUP BY POST_ID"
            + ") R "
            + "ON P.ID = R.POST_ID "
            + "JOIN TBL_MEMBER M "
            + "ON P.MEMBER_ID = M.ID";
      
//      PostVO�� POST ���̺��� �÷� ������ �����ؾ� �Ѵ�.
//      join ���� �� ���� �÷����� ����� ������ VO�� �������� �ʰ� DTO�� ���Ӱ� ���� ����Ѵ�.
      ArrayList<ReplyDTO> posts = new ArrayList<ReplyDTO>();
      ReplyDTO replyDTO = new ReplyDTO();
      
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         
         
         while(resultSet.next()) {
        	replyDTO.setId(resultSet.getLong(1));
        	replyDTO.setPostTitle(resultSet.getString(2));
        	replyDTO.setPostContent(resultSet.getString(3));
        	replyDTO.setMemberIdentification(resultSet.getString(4));
        	replyDTO.setMemberName(resultSet.getString(5));
        	replyDTO.setReplyCount(resultSet.getInt(6));
            
            posts.add(replyDTO);
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
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
      
      return posts;
   }
}



















