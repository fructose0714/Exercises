package students;

/**
 * �Ǘ��E��\�����ۃN���X
 * @author hanayo
 *
 */
public abstract class KanriShoku extends Student{

	public KanriShoku(String name, int grade, char kumi, String club) {
		super(name, grade, kumi, club);
	}
	
	abstract public void katsudouKeikakuRitsuan();
	abstract public void introducePosition();
}
