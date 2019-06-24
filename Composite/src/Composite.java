import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composite extends Component{

	List<Component> children = new ArrayList<Component>(); 
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void addChild(Component ...allC) {
		children.addAll(Arrays.asList(allC));
	}

	@Override
	public void removeChild(Component c) {
		children.remove(c);	
	}

	@Override
	public List<Component> getChilds() {
		return children;
	}

	@Override
	public void draw(String space) {
		System.out.println(space + this.name);
		for (Component c : this.children) {
			c.draw(space + "    ");
		}
	}

	@Override
	public void draw() {
		System.out.println(this.name);
		for (Component c : this.children) {
			c.draw( "    ");
		}
	}

	@Override
	public boolean isBinary() {
		boolean isBinary =  children.size() < 3;

		for (Component c : this.children) {
			isBinary = isBinary && c.isBinary();
		}

		return isBinary;

	}

}
