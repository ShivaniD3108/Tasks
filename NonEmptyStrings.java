package com.java.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonEmptyStrings {
public static void main(String[] args) {
	List<String> letters=Arrays.asList("abc","","bc","efg","abcd","","jkl");
	List<String> nonempty=new ArrayList();
	for(String check:letters) {
		if(check.isEmpty()) {
			continue;
		}
		else {
			nonempty.add(check);
		}
	}
	System.out.println(nonempty);
}
}
