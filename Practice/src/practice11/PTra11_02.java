package practice11;

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] books;
		books = FileReaderClass.readBookDataFile();
		System.out.println(books[1].title);

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String line = scanner.next();

		for (int i = 0; i < books.length; i++) {
			if (books[i].title.indexOf(line) != -1) {
				System.out.println(books[i].dispBookInfo());
			}

		}

	}

}
