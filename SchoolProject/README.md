# SchoolProject
## 使い方
Main.javaに、いろいろとその概念の説明が書いてあります。  
一応、Eclipseの上で動きます。

## 言い訳
* クラスなどの命名について、英語をいい感じのが思いつかなかったら、カッコ悪いけど日本語にしています。
* 生徒の入部・退部や、会計・会計監査など、具体的な実装は書いていません。メソッドが存在しているということだけ考えてください。

## 大まかな仕様
* 校内の生徒を管理するシステムを構築する。
* 学校には部活動が存在する。
* 生徒は部活動に所属することがある。
* 生徒が所属できる部活動は一つだけである。
* 部活動には部長・副部長・会計係という役職が存在する。
* 部長・副部長は「管理職」という立場であり、管理職は自身の部活動の年間活動計画を立てる仕事を行う。
* 部長は、副部長が行うことのできる仕事に加えて、自身の所属する部活動のメンバーの入会・退会手続きという仕事を行う。
* 会計は、自身の所属する部活動の決算を報告するという仕事のことである。
* 会計を行うことができるのは、その部活動の部長及び会計係とし、副部長にその権限は割り振らない。
* 会計を行う生徒たちに対して、その生徒たちの会計が妥当であるか評価する、会計監査が行われることがある。
* このシステムは、生徒の委員会活動に関しても拡張する予定である。
* 委員会における役職体制及び役職の仕事は、部活動のそれとほとんど同じであることが期待できる。

## フォルダ構成
- src
    - schoolProject
        - Main.java（Main関数）
    - students
        - Student.java（生徒を表すクラス）
        - KanriShoku.java（管理職を表す抽象クラス）
        - SubCaptain.java（副部長を表すクラス）
        - Captain.java（部長を表すクラス）
        - IAccountable.java（会計という仕事を実装させるインターフェース）
        - Accountant.java（会計係を表すクラス）

## FAQ
* どうして管理職は抽象クラスなの？  
委員会活動にもシステムを拡張予定だからです。  
このシステムにおいて「管理職」は「抽象的な概念」としておくことで、  
「部活動の管理職」「委員会の管理職」と、各活動場所で具体化させることを期待します。  

* 部長も会計係を継承すれば、インターフェースを使わなくてもいいのでは？  
部長はすでに副部長というクラスを継承しています。  
Javaでは多重継承は許されません。

* じゃあ、部長は、「副部長でなく会計係を継承する」という選択肢もあるのでは？  
    * 部長は、副部長を継承する。代わりに、会計係を継承することができなくなる。
    * 部長は、会計係を継承する。代わりに、副部長を継承することができなくなる。  
    のどちらかですね。どっちがいいと思いますか。  
「部長は副部長の仕事に加えて」とあるので、部長であることは副部長であることを含みます。  
言ってしまえば、  
部長は「会計係の進化系」ではなく、「副部長の進化系」であるべきです。  
だから、部長は副部長の仕事をまるまる全部「継承」することが、理にかなっているのです。

* 「IAccountable」について、ひいては「インターフェース」についてもう少し詳しく教えて！  
インターフェースを実装したクラスは、そのインターフェースで宣言されているメソッドの実装を強制される、  
これが「いいところ」なんです。  
そして今回の作業で、「会計作業ができること」は、  
「いろいろある役職の中で、会計係と部長には実装してもらいたいこと」だと考えます。  
今後、会計係と部長以外に、（現実的ではないですが）書記という役職にも  
会計作業を手伝ってもらいたいとしたら、  
書記にIAccountableを実装してあげればよいのですし、  
副部長にも会計作業を手伝ってもらいたかったら、  
管理職という抽象クラスに、IAccountableを実装すればよいのです。  
抽象クラスやクラスの継承は、スーパークラスの純粋な拡張であることを求めます。  
インターフェースの実装は、「スキル（できること）を『カチッと』自分にくっつける」感じです。  
しつこくまとめると、  
「性質・できることを丸々引き継ぐのが『継承(extend)』」であり、  
「できることを強制するのが『実装(implement)』」です。
