package students;

/**
 * 生徒を表すクラス
 * @author hanayo
 *
 */
public class Student {
	// 生徒の名前
	private String name;
	
	// 生徒の所属する学年
	private int grade;
	
	// 生徒の所属する組
	private char kumi;
	
	// 生徒の所属する部活動
	private String club = "";
	
	/**
	 * 部活動に所属しない生徒のためのコンストラクタ
	 * @param name 生徒名
	 * @param grade 学年
	 * @param kumi 組
	 */
	public Student(String name, int grade, char kumi) {
		this.name = name;
		this.grade = grade;
		this.kumi = kumi;
	}
	
	/**
	 * 部活動に所属する生徒のためのコンストラクタ
	 * @param name 生徒名
	 * @param grade 学年
	 * @param kumi 組
	 * @param club 部活名
	 */
	public Student(String name, int grade, char kumi, String club) {
		this(name, grade, kumi);
		this.club = club;
	}
	
	/**
	 * 自己紹介を行うメソッド
	 */
	public void selfIntroduction() {
		System.out.println(this.grade + "年" + this.kumi + "組、" + this.name + "です。");
		if (!this.club.isEmpty()) {
			System.out.println("所属部活動は" + this.club + "です。\n");
		}
	}
}
