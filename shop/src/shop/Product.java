package shop;

//추상클래스와 인터페이스는 new를 못함
public abstract class Product {
	private String name;
	private int price;		
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void printDetail() {
		System.out.println("제품명 : "+name);
		System.out.println("가격 : "+price);
	}
	
	public abstract void printExtra();
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

}
