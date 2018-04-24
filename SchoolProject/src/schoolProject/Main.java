package schoolProject;

import students.*;

public class Main {

	public static void main(String[] args) {
		/**
		 * コンストラクタのオーバーロードの効果
		 */
		// Studentクラスを覗いてみて、以下を考えてください。
		
		// 部活動に所属しない生徒を生成。
		Student mobu = new Student("喪舞もぶ子", 1, 'A');
		mobu.selfIntroduction();
		
		// 部活動に所属する生徒を生成。
		Student niko = new Student("矢澤にこ", 1, 'B', "アイドル部");
		niko.selfIntroduction();		
		
		// と、以上のように、引数の数に応じてインスタンスを生成することができますね。
		// デフォルトコンストラクタを「今回は定義しないおかげで」以下のように「名無しの生徒」が生成されないようになっています。
		// Student nanashi = new Student();
		
		
		/**
		 * スーパークラスで定義したコンストラクタをサブクラスで使うこと
		 */
		// Accountant, SubCaptain, Captainクラスを覗いて、以下を考えてください。
		
		// 会計係
		Accountant pana = new Accountant("小泉花陽", 1, 'B', "アイドル部");
		// 副部長
		SubCaptain umi = new SubCaptain("園田海未", 2, 'A', "アイドル部");
		// 部長
		Captain hono = new Captain("高坂穂乃果", 2, 'A', "アイドル部");
		// と、以上のように、スーパークラスで定義した、特に4引数のコンストラクタは、サブクラスでもそれを使えと宣言しているので、使えてますね。
		// 各Accountant, SubCaptain, Captainを覗いていただけるとわかりますが、
		// 3引数のコンストラクタを定義していないので、以下はエラーになります。
		// つまり、部活動に所属しない生徒は、会計係・副部長・部長として生成できないということです。
		// Accountant rin = new Accountant("星空凛", 1 'B');
		
		/**
		 * 自己紹介について(オーバーライド)
		 */
		pana.selfIntroduction();
		umi.selfIntroduction();
		hono.selfIntroduction();
		// 実行してみるとわかりますが、umiとhonoは、自身の役職を自己紹介で宣言します。
		// それはStudentの持つ自己紹介のメソッドselfIntroduction()を、SubCaptainでオーバーライドしているからであり、
		// 副部長が「私は副部長です！」と言うのに対して、部長は「私は部長です！」と言うようになっているのは、
		// CaptainはSubCaptainの持つ役職紹介メソッドintroducePosition()を、Captainでオーバーライドしているからです。
		
		/**
		 * スーパークラスで定義されたメソッドの利用
		 */
		// SubCaptainも、そのサブクラスであるCaptainも、二人とも活動計画立案を行うことができます。
		umi.katsudouKeikakuRitsuan();
		hono.katsudouKeikakuRitsuan();
		
		/**
		 * 退部手続きについて（その引数がStudent型であること、ひいてはスーパークラスの変数がサブクラスのオブジェクトを扱うことができることについて）
		 */
		// Captainの持つメソッドtaibuTetsudukiの引数は、Student型ですね・・・
		
		// Student型であるnikoの退部手続きは当然可能です。。
		hono.taibuTetsuduki(niko);
		
		// 副部長も（残念ながら）退部することがあります！
		// SubCaptainはStudentのサブクラスなので、変数umiもtaibuTetsudukiの引数にすることができます。
		// umiはStudent型じゃないのになんで？と言わないでください。
		// 繰り返しになりますが、SubCaptainはStudentのサブクラスなので、Student型の変数で扱うことができるのです。
		hono.taibuTetsuduki(umi);
		
		/**
		 * インターフェースの実装
		 */
		// IAccountableインターフェースを覗いて、以下を考えてください
		pana.account();
		hono.account();
		// IAccountableインターフェースを実装した、会計係と部長は、会計作業を行うことができます。
		
		/**
		 * 会計監査について（引数の型にインターフェースを持つことの意味）
		 */
		// 一番下で定義されているメソッドkaikeiKansaを見ながら、考えてください。
		
		// 変数panaは会計係なので、もちろん会計監査の対象とできます。
		kaikeiKansa(pana);
		// CaptainはIAccountableインターフェースを実装したクラスなので、変数honoも会計監査の対象とできます！
		kaikeiKansa(hono);
		// 実体を持つことのないインターフェース（抽象クラス）を変数の型にするのは不思議かもしれませんが、
		// 以上のようなことができるのがうれしいのです。
	}
	
	// インターフェースを引数の型とすることで、「会計作業を行うことのできる人」を引数に取る、という表現ができている。
	// この引数の型をAccountantにしてしまうと、部長が会計監査の対象にできなくなってしまうことに注意してください！
	public static void kaikeiKansa(IAccountable a) {
		// 会計監査
	}
}
