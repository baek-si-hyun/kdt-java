package view;

import dao.MemberDAO;
import dao.PostDAO;
import dao.ReplyDAO;
import vo.MemberVO;
import vo.PostVO;
import vo.ReplyVO;

public class View {
	public static void main(String[] args) {
		 PostDAO postDAO = new PostDAO();
	     System.out.println(postDAO.getListWithReplyCount());
		PostVO postVO = new PostVO();
		
		ReplyVO replyVO = new ReplyVO();
//		�Խñ� ���
//		
//		System.out.println(postDAO.selectAll());
		
//		�Խñ� �ۼ�		
//		postVO.setPostTitle("�׽�Ʈ ����2");
//		postVO.setPostContent("�׽�Ʈ ����2");
//		
//		��� �ۼ�
//		ReplyDAO replyDAO = new ReplyDAO();
//		
//		replyVO.setReplyContent("��� ����3");
//		replyVO.setPostId(63L);
		
		MemberDAO memberDAO = new MemberDAO();
		
		MemberVO memberVO = new MemberVO();
//		�α���
		memberVO.setMemberId("hds1234");
		memberVO.setMemberPassword("1234");
		
		if(memberDAO.login(memberVO)) {
			System.out.println("�α��� ����");
			replyDAO.replyInsert(replyVO);
			
		}else {
			System.out.println("�α��� ����");
		}
//		
		
//		
////		����������
		System.out.println(memberDAO.findById());
//		
//		memberDAO.logout();
//		System.out.println(memberDAO.session);
		
//		ȸ������
//		memberVO.setMemberId("hds1234");
//		memberVO.setMemberPassword("1234");
//		memberVO.setMemberName("�ѵ���");
//		memberVO.setMemberAddress("��⵵ �����ֽ�");
//		
//		if(memberDAO.checkId(memberVO.getMemberId())) {
//			System.out.println("��� ������ ���̵�");
//			
//			memberDAO.join(memberVO);
//			System.out.println("ȸ������ ����");
//			
//		}else {
//			System.out.println("�ߺ��� ���̵�");
//		}
	}
}















