package students;

/**
 * ��������\���N���X
 * @author hanayo
 *
 */
public class SubCaptain extends KanriShoku {

	public SubCaptain(String name, int grade, char kumi, String club) {
		super(name, grade, kumi, club);
	}

	public void introducePosition() {
		System.out.println("���͕������ł��I\n\n");
	}
	
	@Override
	public void selfIntroduction() {
		super.selfIntroduction();
		this.introducePosition();
	}

	@Override
	public void katsudouKeikakuRitsuan() {
		// �N�Ԋ����v��𗧂Ă�
	}
}
