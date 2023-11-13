package com.sh.app;

import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Pig;

public class Main {

	public static void main(String[] args) {
		//컨 쉬 X : 대문자로 변경해줌
        System.out.println("HELLOW WORLD");
        System.out.println("HELLOW GIT");

        new Dog().bark();
	    new Cat().jump();
	    new Pig().meat();
	    
	   
	    
	}

}
