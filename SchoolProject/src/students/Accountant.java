package students;

/**
 * ��v�W��\���N���X
 * @author hanayo
 *
 */
public class Accountant extends Student implements IAccountable {

	public Accountant(String name, int grade, char kumi, String club) {
		super(name, grade, kumi, club);
	}

	@Override
	public void account() {
		// ��v���
	}

}
