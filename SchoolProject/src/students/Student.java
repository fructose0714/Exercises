package students;

/**
 * ���k��\���N���X
 * @author hanayo
 *
 */
public class Student {
	// ���k�̖��O
	private String name;
	
	// ���k�̏�������w�N
	private int grade;
	
	// ���k�̏�������g
	private char kumi;
	
	// ���k�̏������镔����
	private String club = "";
	
	/**
	 * �������ɏ������Ȃ����k�̂��߂̃R���X�g���N�^
	 * @param name ���k��
	 * @param grade �w�N
	 * @param kumi �g
	 */
	public Student(String name, int grade, char kumi) {
		this.name = name;
		this.grade = grade;
		this.kumi = kumi;
	}
	
	/**
	 * �������ɏ������鐶�k�̂��߂̃R���X�g���N�^
	 * @param name ���k��
	 * @param grade �w�N
	 * @param kumi �g
	 * @param club ������
	 */
	public Student(String name, int grade, char kumi, String club) {
		this(name, grade, kumi);
		this.club = club;
	}
	
	/**
	 * ���ȏЉ���s�����\�b�h
	 */
	public void selfIntroduction() {
		System.out.println(this.grade + "�N" + this.kumi + "�g�A" + this.name + "�ł��B");
		if (!this.club.isEmpty()) {
			System.out.println("������������" + this.club + "�ł��B\n");
		}
	}
}
