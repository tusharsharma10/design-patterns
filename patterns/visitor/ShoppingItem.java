package patterns.visitor;

public interface ShoppingItem {
	public double accept(ShoppingCartVisitor visitor);
}
