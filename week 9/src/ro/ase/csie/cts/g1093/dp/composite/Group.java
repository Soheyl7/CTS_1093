package ro.ase.csie.cts.g1093.dp.composite;

import java.util.ArrayList;

public class Group extends AbstractNode {

	
	String name;
	ArrayList<AbstractNode> nodes = new ArrayList<>();
	
	public Group(String name) {
		super();
		this.name = name;
	}

	@Override
	public void attack(String playerName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retreat() {
		// TODO Auto-generated method stub
		for(AbstractNode node: nodes)
		{
			node.retreat();;
		}
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void addNode(AbstractNode node) {
		// TODO Auto-generated method stub
		this.nodes.add(node);
		
	}

	@Override
	public AbstractNode getNode(int index) {
		// TODO Auto-generated method stub
		return this.nodes.get(index);
	}

	@Override
	public void deleteNode(AbstractNode node) {
		// TODO Auto-generated method stub
		this.nodes.remove(node);
		
	}
	
	

}