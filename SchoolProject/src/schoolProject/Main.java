package schoolProject;

import students.*;

public class Main {

	public static void main(String[] args) {
		/**
		 * �R���X�g���N�^�̃I�[�o�[���[�h�̌���
		 */
		// Student�N���X��`���Ă݂āA�ȉ����l���Ă��������B
		
		// �������ɏ������Ȃ����k�𐶐��B
		Student mobu = new Student("�r�����Ԏq", 1, 'A');
		mobu.selfIntroduction();
		
		// �������ɏ������鐶�k�𐶐��B
		Student niko = new Student("���V�ɂ�", 1, 'B', "�A�C�h����");
		niko.selfIntroduction();		
		
		// �ƁA�ȏ�̂悤�ɁA�����̐��ɉ����ăC���X�^���X�𐶐����邱�Ƃ��ł��܂��ˁB
		// �f�t�H���g�R���X�g���N�^���u����͒�`���Ȃ��������Łv�ȉ��̂悤�Ɂu�������̐��k�v����������Ȃ��悤�ɂȂ��Ă��܂��B
		// Student nanashi = new Student();
		
		
		/**
		 * �X�[�p�[�N���X�Œ�`�����R���X�g���N�^���T�u�N���X�Ŏg������
		 */
		// Accountant, SubCaptain, Captain�N���X��`���āA�ȉ����l���Ă��������B
		
		// ��v�W
		Accountant pana = new Accountant("����ԗz", 1, 'B', "�A�C�h����");
		// ������
		SubCaptain umi = new SubCaptain("���c�C��", 2, 'A', "�A�C�h����");
		// ����
		Captain hono = new Captain("�����T��", 2, 'A', "�A�C�h����");
		// �ƁA�ȏ�̂悤�ɁA�X�[�p�[�N���X�Œ�`�����A����4�����̃R���X�g���N�^�́A�T�u�N���X�ł�������g����錾���Ă���̂ŁA�g���Ă܂��ˁB
		// �eAccountant, SubCaptain, Captain��`���Ă���������Ƃ킩��܂����A
		// 3�����̃R���X�g���N�^���`���Ă��Ȃ��̂ŁA�ȉ��̓G���[�ɂȂ�܂��B
		// �܂�A�������ɏ������Ȃ����k�́A��v�W�E�������E�����Ƃ��Đ����ł��Ȃ��Ƃ������Ƃł��B
		// Accountant rin = new Accountant("����z", 1 'B');
		
		/**
		 * ���ȏЉ�ɂ���(�I�[�o�[���C�h)
		 */
		pana.selfIntroduction();
		umi.selfIntroduction();
		hono.selfIntroduction();
		// ���s���Ă݂�Ƃ킩��܂����Aumi��hono�́A���g�̖�E�����ȏЉ�Ő錾���܂��B
		// �����Student�̎����ȏЉ�̃��\�b�hselfIntroduction()���ASubCaptain�ŃI�[�o�[���C�h���Ă��邩��ł���A
		// ���������u���͕������ł��I�v�ƌ����̂ɑ΂��āA�����́u���͕����ł��I�v�ƌ����悤�ɂȂ��Ă���̂́A
		// Captain��SubCaptain�̎���E�Љ�\�b�hintroducePosition()���ACaptain�ŃI�[�o�[���C�h���Ă��邩��ł��B
		
		/**
		 * �X�[�p�[�N���X�Œ�`���ꂽ���\�b�h�̗��p
		 */
		// SubCaptain���A���̃T�u�N���X�ł���Captain���A��l�Ƃ������v�旧�Ă��s�����Ƃ��ł��܂��B
		umi.katsudouKeikakuRitsuan();
		hono.katsudouKeikakuRitsuan();
		
		/**
		 * �ޕ��葱���ɂ��āi���̈�����Student�^�ł��邱�ƁA�Ђ��Ă̓X�[�p�[�N���X�̕ϐ����T�u�N���X�̃I�u�W�F�N�g���������Ƃ��ł��邱�Ƃɂ��āj
		 */
		// Captain�̎����\�b�htaibuTetsuduki�̈����́AStudent�^�ł��ˁE�E�E
		
		// Student�^�ł���niko�̑ޕ��葱���͓��R�\�ł��B�B
		hono.taibuTetsuduki(niko);
		
		// ���������i�c�O�Ȃ���j�ޕ����邱�Ƃ�����܂��I
		// SubCaptain��Student�̃T�u�N���X�Ȃ̂ŁA�ϐ�umi��taibuTetsuduki�̈����ɂ��邱�Ƃ��ł��܂��B
		// umi��Student�^����Ȃ��̂ɂȂ�ŁH�ƌ���Ȃ��ł��������B
		// �J��Ԃ��ɂȂ�܂����ASubCaptain��Student�̃T�u�N���X�Ȃ̂ŁAStudent�^�̕ϐ��ň������Ƃ��ł���̂ł��B
		hono.taibuTetsuduki(umi);
		
		/**
		 * �C���^�[�t�F�[�X�̎���
		 */
		// IAccountable�C���^�[�t�F�[�X��`���āA�ȉ����l���Ă�������
		pana.account();
		hono.account();
		// IAccountable�C���^�[�t�F�[�X�����������A��v�W�ƕ����́A��v��Ƃ��s�����Ƃ��ł��܂��B
		
		/**
		 * ��v�č��ɂ��āi�����̌^�ɃC���^�[�t�F�[�X�������Ƃ̈Ӗ��j
		 */
		// ��ԉ��Œ�`����Ă��郁�\�b�hkaikeiKansa�����Ȃ���A�l���Ă��������B
		
		// �ϐ�pana�͉�v�W�Ȃ̂ŁA��������v�č��̑ΏۂƂł��܂��B
		kaikeiKansa(pana);
		// Captain��IAccountable�C���^�[�t�F�[�X�����������N���X�Ȃ̂ŁA�ϐ�hono����v�č��̑ΏۂƂł��܂��I
		kaikeiKansa(hono);
		// ���̂������Ƃ̂Ȃ��C���^�[�t�F�[�X�i���ۃN���X�j��ϐ��̌^�ɂ���͕̂s�v�c��������܂��񂪁A
		// �ȏ�̂悤�Ȃ��Ƃ��ł���̂����ꂵ���̂ł��B
	}
	
	// �C���^�[�t�F�[�X�������̌^�Ƃ��邱�ƂŁA�u��v��Ƃ��s�����Ƃ̂ł���l�v�������Ɏ��A�Ƃ����\�����ł��Ă���B
	// ���̈����̌^��Accountant�ɂ��Ă��܂��ƁA��������v�č��̑Ώۂɂł��Ȃ��Ȃ��Ă��܂����Ƃɒ��ӂ��Ă��������I
	public static void kaikeiKansa(IAccountable a) {
		// ��v�č�
	}
}
