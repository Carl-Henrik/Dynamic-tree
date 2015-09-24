package com.example.main;

public class tester {
	tree tree = new tree();
	
	public tester(){
		
		tree.add(7);
		tree.add(23);
		tree.add(8);
		tree.add(34);
		tree.add(76);
		tree.add(34);
		tree.add(2);
		tree.add(4);
		tree.add(34);
		tree.add(8);
		
		tree.printInOrder();
		tree.printPreOrder();
		tree.printPostOrder();
		tree.printSum();
		
		tree.delete(76);
		tree.delete(4);
		
		
		
		System.out.println("");
		tree.printInOrder();
		tree.printSum();
	}
	
}
