package com.sh.app;

import com.sh.app.animal.Bird;
import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Pig;

public class Main {

	public static void main(String[] args) {
		//컨 쉬 X : 대문자로 변경해줌
        System.out.println("HELLOW WORLD");
        System.out.println("HELLOW GIT");
        
        System.out.println("동물기능 시작!");
        new Dog().bark();
	    new Cat().jump();
	    new Pig().meat();
	    new Bird().fly();
	    
	}
	
	//테스트용 메서드
	public void test() {
		System.out.println("Main#test");
	}

}
