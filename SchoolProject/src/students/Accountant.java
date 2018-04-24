package students;

/**
 * 会計係を表すクラス
 * @author hanayo
 *
 */
public class Accountant extends Student implements IAccountable {

	public Accountant(String name, int grade, char kumi, String club) {
		super(name, grade, kumi, club);
	}

	@Override
	public void account() {
		// 会計作業
	}

}
