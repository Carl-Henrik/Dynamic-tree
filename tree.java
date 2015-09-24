package com.example.main;

public class tree {
	int summan = 0;
	node root = null;
		public void add(int item){
		
		
		
		
		
		if (root == null){
			root = new node(item);
		}
		else {
			
						
			addNode(item, root);
		}
	}
	
	
	
	
	public node addNode(int item, node current){
		if (current == null)
			return new node(item);
		
		if (item < current.key){
			current.left = addNode(item, current.left);
		
					
		}
		

		else if (item > current.key) {
			current.right = addNode(item, current.right);
		}
		
		else {current.value++;}
		
		return current;
	}
	
	public void delete(int item){
		if (root == null){return;}
		else{
			deleteNode(item, root);}
		
		
	}
	
	
	public node deleteNode(Integer item, node current){
	
	
        
            if( current == null )
                {System.out.println("null");
            	return current;} 
            
            if( item.compareTo( current.value ) < 0 )
                current.left = deleteNode( item, current.left );
           
            else if( item.compareTo( current.value ) > 0 )
                current.right = deleteNode( item, current.right );
           
            else if( current.left != null && current.right != null )
            {
            	System.out.println("två barn");
                current.value = findMin( current.right ).value;
                current.right = deleteNode( current.value, current.right );
            }
            
            
            else
            	System.out.println("inga barn");
                current = ( current.left != null ) ? current.left : current.right;
            return current;
        }
	
	
	public node findMin( node temp )
    {
        if( temp == null )
            return null;
        else if( temp.left == null )
            return temp;
        return findMin( temp.left );
    }
	
	 

	
	 

	 
	
	public void printInOrder(){
		inOrder(root);
	}
	public void inOrder(node current){
		if (current!= null){
			inOrder(current.left);
			System.out.println("tal:" + current.key + " förekommer " + current.value + " gånger.");
			inOrder(current.right);
		}
	}
	
	public void printPreOrder(){
		preOrder(root);
	}
	public void preOrder(node current){
		if (current!= null){
			System.out.println("tal:" + current.key + " förekommer " + current.value + " gånger.");
			preOrder(current.left);
			preOrder(current.right);
		}
	}
	
	
	public void printPostOrder(){
		postOrder(root);
	}
	public void postOrder(node current){
		if (current!= null){
			postOrder(current.left);
			postOrder(current.right);
			System.out.println("tal:" + current.key + " förekommer " + current.value + " gånger.");
		}
	}
	
	public void printSum(){
		summan = 0;
	System.out.println("Summan är: " + getSum(root));
	}


public int getSum(node current){
	if (current!= null){
		getSum(current.left);
		summan =  summan + (current.key * current.value);
		getSum(current.right);
	}
	
	return summan;
}
}
