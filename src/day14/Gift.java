package day14;

import java.util.Objects;

public class Gift {
	private String name;  // 名稱
	private String type; // 代表
	private Integer price; // 價格
	private String message; // 感謝函
	
	public Gift(String name, String type, Integer price, String message) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public Integer getPrice() {
		return price;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(message, name, price, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gift other = (Gift) obj;
		return Objects.equals(message, other.message) && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Gift [name=" + name + ", type=" + type + ", price=" + price + ", message=" + message + "]";
	}

	
	
	
}
