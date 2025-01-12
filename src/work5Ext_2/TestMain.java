package work5Ext_2;

public class TestMain {

	public static void main(String[] args) {
		Poppy poppy = new Poppy("波比");
		poppy.setAttackBehavior(new AttackFire());
		poppy.setDefendBehavior(new DefendSheild());
		poppy.setRunBehavior(new Run());
		
		poppy.attack();
		poppy.defend();
		poppy.run();
		System.out.println(poppy.name);

		System.out.println("==================");
		
		Tahmkench tahmkench = new Tahmkench("貪啃奇");
		tahmkench.setAttackBehavior(new AttackWeak());
		tahmkench.setDefendBehavior(new DefendSheild());
		tahmkench.setRunBehavior(new Run());
		
		tahmkench.attack();
		tahmkench.defend();
		tahmkench.run();
		System.out.println(tahmkench.name);
	}

}
