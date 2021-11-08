package annotation;

public class AnnotationEx {
	public static void main(String[] args) {
		NewClass nc = new NewClass();

		nc.oldField = 10;
		System.out.println(nc.getOldField());
	}
}

class Parent {
	void parentMethod() {
	}
}

class Child extends Parent {

	@Override // 오버라이드할 메소드명이 조상 메소드명과 같은지 체크.
	void parentMethod() {

	}

}

class NewClass {
	int newField;

	int getNewField() {
		return newField;
	}

	@Deprecated
	int oldField;

	@Deprecated
	int getOldField() {
		return oldField;
	}
}

@interface WhatIdo{
	
}










