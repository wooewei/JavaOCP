package day04;

// 書的設計
public class Book {
	private String name; //書名
	private int price; //價格
	private int pages; //頁數
	
	//若沒寫建構子，Java會自動產生,所產生的建構子稱為預設建構子，其構造如下所述:
	//無參數建構子
	public Book() {
		System.out.println("呼叫Book()建構子");
		
	}
	
	//有參數建構子
	public Book(String name,int price,int pages) {
		setName(name);
		setPrice(price);
		setPages(pages);
	}
	
	//封裝 setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int p) {
		if(p > 0) {
			price = p ;
		}else {
			System.out.println("價格輸入錯誤");
		}
	}
	public void setPages(int pages) {
		if(pages>0) {
			this.pages = pages;
		}else {
			System.out.println("頁數輸入錯誤");
		}
	}
	
	//封裝 getter
	public String getName() {
		return name;
	}
	public int getPages() {
		return pages;
	}
	public int getPrice() {
		
		return price;
	}
	
	public void printInfo() {
		System.out.printf("%s $%d %d頁%n",name,price,pages);
	}
	
}
