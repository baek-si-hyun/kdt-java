package anonymous;

public class Building {
   public static void main(String[] args) {
      Starbucks gangnam = new Starbucks();
//      잠실점 오픈
      Starbucks jamsil = new Starbucks();
//      무료나눔 행사중
      jamsil.register(new FormAdapter() {
    	@Override
    	public String[] getMenu() {
    		return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
    	}
      });
      
      gangnam.register(new Form() {
         
         @Override
         public void sell(String menu) {
            String[] menus = getMenu();
            
            for (int i = 0; i < menus.length; i++) {
               if(menus[i].equals(menu)) {
                  System.out.println(menus[i] + "판매완료");
                  break;
               }
            }
            
         }
         
         @Override
         public String[] getMenu() {
            return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
         }
      });
   }
}

