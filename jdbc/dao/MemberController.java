package dao;

public class MemberController {
	MemberDAO memberDAO = new MemberDAO();
	PostDAO postDAO = new PostDAO();
	
	public void withdraw() {
		try {
			postDAO.deleteByMemberId();
			memberDAO.delete();
//			Ä¿¹Ô
		} catch (Exception e) {
			e.printStackTrace();
//			·Ñ¹é
		}
		
	}
}
