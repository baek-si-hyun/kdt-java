package castingTask2;

//오크는 "가죽을 얻었습니다." 출력
//요정은 "날개를 얻었습니다." 출력
//인간은 "갑옷을 얻었습니다." 출력


public class Character {
	public void hunt(Monster monster) {// up casting
		if(monster instanceof Ork) {
			Ork ork = (Ork)monster;
			ork.get();
		}else if(monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			fairy.get();
		}else if(monster instanceof Humen) {
			Humen humen = (Humen)monster;
			humen.get();
		}
	}
	
	public static void main(String[] args) {
		Character character = new Character();
		Monster[] monsters = {
				new Ork(), new Fairy(), new Humen()	
		};
		for (int i = 0; i < monsters.length; i++) {
			character.hunt(monsters[i]);
		}
	}

}
