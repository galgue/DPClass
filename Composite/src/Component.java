import java.util.List;

import javax.naming.OperationNotSupportedException;

public abstract class Component {

	protected String name;
	
	public abstract void addChild(Component ...c) throws OperationNotSupportedException;
	
	public abstract void removeChild(Component c) throws OperationNotSupportedException;
	
	public abstract List<Component> getChilds();
	
	public abstract void draw(String space);

	public abstract void draw();

	public abstract boolean isBinary();

	public Component(String name) {
		this.name = name;
	}
	
	
	
}
