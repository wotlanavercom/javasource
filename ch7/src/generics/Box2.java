package generics;

/* Box2<T> : 지네릭 클래스, T Box2라고 읽는다.
 * T : 타입변수 또는 타입 매개 변수
 * Box2 : 원시 타입(raw type)
 */
public class Box2<T> {
	private T item;
		
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}


}
