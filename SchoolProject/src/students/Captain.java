package students;

/**
 * 部長を表すクラス
 * @author hanayo
 *
 */
public class Captain extends SubCaptain implements IAccountable{

	public Captain(String name, int grade, char kumi, String club) {
		super(name, grade, kumi, club);
	}

	@Override
	public void introducePosition() {
		System.out.println("私は部長です！");
	}
	
	public void nyubuTetsuduki(Student student) {
		// 入部手続き
	}
	
	public void taibuTetsuduki(Student student) {
		// 退部手続き
	}

	@Override
	public void account() {
		// 会計作業
		
	}
}
