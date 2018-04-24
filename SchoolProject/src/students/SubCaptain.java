package students;

/**
 * 副部長を表すクラス
 * @author hanayo
 *
 */
public class SubCaptain extends KanriShoku {

	public SubCaptain(String name, int grade, char kumi, String club) {
		super(name, grade, kumi, club);
	}

	public void introducePosition() {
		System.out.println("私は副部長です！\n\n");
	}
	
	@Override
	public void selfIntroduction() {
		super.selfIntroduction();
		this.introducePosition();
	}

	@Override
	public void katsudouKeikakuRitsuan() {
		// 年間活動計画を立てる
	}
}
