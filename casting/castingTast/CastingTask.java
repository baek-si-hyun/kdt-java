package castingTast;

//넷플릭스
//애니메이션, 영화, 드라마 클래스 선언
//사용자가 선택한 영상이
//애니메이션이라면 "자막 지원" 기능 사용
//영화라면 "4D" 기능 사용
//드라마라면 "굿즈" 기능 사용
public class CastingTask {
   public void checkVideo(Video video) {//up casting
	   if(video instanceof Film) {
		   Film film = (Film)video; //down casting
		   film.shackCheir();
	   }else if(video instanceof Drama) {
		   Drama drama = (Drama)video;
		   drama.sellGoods();
	   }else if(video instanceof Animation) {
		   Animation animation = (Animation)video;
		   animation.showSubtitle();
	   }
   }
   public static void main(String[] args) {
	   CastingTask castingTask = new CastingTask();
	   castingTask.checkVideo(new Film());
	   castingTask.checkVideo(new Animation());
	   castingTask.checkVideo(new Drama());
}
   }


