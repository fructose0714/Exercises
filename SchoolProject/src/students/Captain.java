package students;

/**
 * ������\���N���X
 * @author hanayo
 *
 */
public class Captain extends SubCaptain implements IAccountable{

	public Captain(String name, int grade, char kumi, String club) {
		super(name, grade, kumi, club);
	}

	@Override
	public void introducePosition() {
		System.out.println("���͕����ł��I");
	}
	
	public void nyubuTetsuduki(Student student) {
		// �����葱��
	}
	
	public void taibuTetsuduki(Student student) {
		// �ޕ��葱��
	}

	@Override
	public void account() {
		// ��v���
		
	}
}
