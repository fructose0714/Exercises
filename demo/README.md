# jQueryプラグインを用いたページングの実装例
## 注意
* jQueryなど、どんな手を使ってもよいのなら、参考にしてください。
* tableタグに囲まれたものに対するページングの実装です。
* 「jQuery Datatable (http://holt59.github.io/datatable/ )」というプラグインを今回は使用してみます。
* jQueryとjQuery Datatableプラグインのダウンロードの手順が面倒？だったら、このプロジェクトに入っているものをダウンロードして使ってもいいんじゃないでしょうか。

## 導入の具体的な手順
### 1.jQueryとjQuery Datatableプラグインのダウンロードと配置
自分の開発するWebページでjavascriptのプラグインを利用するためには、それをダウンロードして自分のわかりやすいフォルダに配置したものか、
インターネット上にあるリソースを参照する必要があります。  
今回はダウンロードしてしまいます。
1. jQueryのダウンロード  
[ここ](https://jquery.com/download/)からダウンロードしてきます。2018年6月16日時点で
「Download the compressed, production jQuery 3.3.1」と書かれたリンクをクリックして落ちてくるもの（jquery-3.3.1.min.js）を使用します。
2. jQuery Datatableプラグインのダウンロード  
[ここ](http://holt59.github.io/datatable/)の「Download(.zip)」をクリックします。  
「Datatable-master.zip」というファイルが落ちてくると思いますが、この中にある次のファイルを今回は使用します。
    * css/datatable.min.css
    * js/datatable.js
    * js/datatable.jquery.js  
3. ダウンロードしてきたjavascript, cssのプロジェクトへの配置  
Spring+Thymeleafでは、以下の場所に配置するといい感じですね。存在しないフォルダは作成してください。
<img src="https://raw.github.com/wiki/fructose0714/Exercises/Images/paging/js_css_path.png" width="240">

### 2.配置したjs, cssのインクルード
使用したいhtmlやjspで、配置したjsやcssをインクルードします。(Thymeleafを使っているのなら)head部に以下の記述をすればよいでしょう。
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <link rel="stylesheet" type="text/css" th:href="@{/css/datatable.min.css}" media="screen">
  <script type="text/javascript" th:src="@{/js/jquery-3.3.1.min.js}"></script>
  <script type="text/javascript" th:src="@{/js/datatable.js}"></script>
  <script type="text/javascript" th:src="@{/js/datatable.jquery.js}"></script>
  <meta charset="UTF-8" />
</head>
```
これでプラグインが使えるようになりました。

### 3.実際に使用する
このプロジェクトの[hello.html](https://github.com/fructose0714/Exercises/blob/master/demo/src/main/resources/templates/hello.html)を合せて参照してください。  
例えば以下のように、Thymeleafの構文を用いて要素が繰り返されるtableがあるとします。  
（${members}にコントローラから何が渡されるかは、このプロジェクトの[HelloController.java](https://github.com/fructose0714/Exercises/blob/master/demo/src/main/java/com/example/demo/controller/HelloController.java)を参照してください。）
```html
  <table id="member-table">
    <tHead>
	  <tr>
	    <th>番号</th>
		 <th>名前</th>
	  </tr>
    </tHead>
    <tbody>
	  <tr th:each="m: ${members}">
		<td th:text="${m.number}"></td>
		<td th:text="${m.name}"></td>
	  </tr>
    </tbody>
  </table>
  <div id="paging-first-datatable"></div>
```
最終行にあるdivタグは、ページの番号を表示するやつ、こんなの  
<img src="https://raw.github.com/wiki/fructose0714/Exercises/Images/paging/paging_bar.png" width="160">

の置き場所です。必要に応じてこのdivタグは、自分が表示したいところに移動してください。

このtableにページングを実装しましょう。以下のjavascriptコードを、bodyの ___最下部___ に記述してください。  
最下部に記述しないと、例えばbodyタグより前に記述すると、table要素が構成される前にscriptが動くことになるので、上手くいきません。
```html
<script>
$('#member-table').datatable({
    pageSize: 5,
    sort: [false, false],
    filters: [false, false],
    pagingDivSelector: "#paging-first-datatable"
});
</script>
</body>
```
意味を説明します。
* #member-tableは、ページングを実装したいtableのidの値です。（#をつけると、id名で指定できます。#をつけないと、class名になります。）
* pageSizeは、1ページに何個の要素を表示させるかを表します。
* sortとfiltersは、各カラムについてソートやフィルタリングができるかどうかを設定しています。詳しくは公式ドキュメントを参照してください。
* pagingDivSelectorは、上で述べたページの番号を表示するやつはどれかということを指定します。上で記述したdivタグのid名「#paging-first-datatable」を指定しています。（#をつけるとid名、つけないとclass名になるのは、上で述べたものと同様です。）

### 4.完成
以上の準備の下で、Springプロジェクトを実行してページにアクセスすると、以下のようにページングが実装された形となると思います。  
<img src="https://raw.github.com/wiki/fructose0714/Exercises/Images/paging/paging_result1.png" width="160">
<img src="https://raw.github.com/wiki/fructose0714/Exercises/Images/paging/paging_result2.png" width="160">
<img src="https://raw.github.com/wiki/fructose0714/Exercises/Images/paging/paging_result3.png" width="160">
