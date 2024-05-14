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
//		게시글 목록
//		
//		System.out.println(postDAO.selectAll());
		
//		게시글 작성		
//		postVO.setPostTitle("테스트 제목2");
//		postVO.setPostContent("테스트 내용2");
//		
//		댓글 작성
//		ReplyDAO replyDAO = new ReplyDAO();
//		
//		replyVO.setReplyContent("댓글 내용3");
//		replyVO.setPostId(63L);
		
		MemberDAO memberDAO = new MemberDAO();
		
		MemberVO memberVO = new MemberVO();
//		로그인
		memberVO.setMemberId("hds1234");
		memberVO.setMemberPassword("1234");
		
		if(memberDAO.login(memberVO)) {
			System.out.println("로그인 성공");
			replyDAO.replyInsert(replyVO);
			
		}else {
			System.out.println("로그인 실패");
		}
//		
		
//		
////		마이페이지
		System.out.println(memberDAO.findById());
//		
//		memberDAO.logout();
//		System.out.println(memberDAO.session);
		
//		회원가입
//		memberVO.setMemberId("hds1234");
//		memberVO.setMemberPassword("1234");
//		memberVO.setMemberName("한동석");
//		memberVO.setMemberAddress("경기도 남양주시");
//		
//		if(memberDAO.checkId(memberVO.getMemberId())) {
//			System.out.println("사용 가능한 아이디");
//			
//			memberDAO.join(memberVO);
//			System.out.println("회원가입 성공");
//			
//		}else {
//			System.out.println("중복된 아이디");
//		}
	}
}















