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

	@Override // �������̵��� �޼ҵ���� ���� �޼ҵ��� ������ üũ.
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










