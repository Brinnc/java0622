package com.sp.app0622.animal;

public class Bird {
/*
 메서드나 변수는 직관성이 있어야 하므로, 개발 시 신중하게 고려해야함
 하지만, 개발을 하다보면 로직이 상당히 흡사함에도 불구하고 프로그램의 원칙 상
 메서드면 중복 불가라는 이유 때문에 힘들게 정해놓은 메서드명을 또 사용할 수 없는일이 발생할 수 있음
 이러한 문제를 해결하기 위해 자바에서는 OverLoading을 지원함
 OverLoading이란 하나의 클래스 내 메서드 명을 중복 정의할 수 있는 메서드 정의 기법을 말하는데
 이때 주의할 점은 메서드의 이름은 같게하고 해당 메서드의 매개변수의 자료형이나 갯수는 틀리게 해야함. 
 그래야 구분이 가능하므로.
 */
	public void fly() {
		System.out.println("새가 난다");
	}
	
	public void fly(int level) {
		System.out.println("새가 낮게 난다");
	}
	
	public void fly(int level, int k) {
		System.out.println("새가 낮게 난다");
	}
	
	
}
