package com.ankita;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.m1();
	}
     public void m1()
     {
    	 List<String> list=new ArrayList<String>();
    	 list.add("red");
    	 list.add("white");
    	 list.add("blue");
    	 list.add("black");
    	 list.add("pink");
    	 list.add("yellow");
    	 System.out.println(list);
     }
}
