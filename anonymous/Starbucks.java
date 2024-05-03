package anonymous;

public class Starbucks {
   
   public void register(Form form) {
      String[] menu = form.getMenu();
      for (int i = 0; i < menu.length; i++) {
         System.out.println(i + 1 + "." + menu[i]);
      }
      
//      무료나눔 행사 중이라면, "무료나눔 행사 승인" 출력
      if(form instanceof FormAdapter) {
    	  System.out.println("무료나눔 행사 승인");
//        무료나눔 행사 중이 아니라면, 판매 방식 검토
      }else {
    	  form.sell("아메리카노");
      }
      
      
   }

}
