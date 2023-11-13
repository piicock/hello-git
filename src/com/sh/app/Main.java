package com.sh.app;

import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Pig;

public class Main {

	public static void main(String[] args) {
        System.out.println("hellow world");
        System.out.println("hellow git");
	
	    new Dog().bark();
	    new Cat().jump();
	    new Pig().meat();
	    
	}

}
