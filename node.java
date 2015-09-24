package com.example.main;

public class node {

	public Integer key;
	public Integer value;
	public node left;
	public node right;
	
	
	public node(int x){
	
		key = x;
		value = 1;
		left = null;
		right = null;
		
}
	public void setKey(int x){ key = x;}
	public void setLeft(node x){ left = x;}
	public void setRight(node x){ left = x;}
	
}
