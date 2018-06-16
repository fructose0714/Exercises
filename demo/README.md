# jQueryプラグインを用いたページングの実装例
## 注意
* jQueryなど、どんな手を使ってもよいのなら、参考にしてください。
* tableタグに囲まれたものに対するページングの実装です。
* 「jQuery Datatable (http://holt59.github.io/datatable/)」というプラグインを今回は使用してみます。

## 導入の具体的な手順
### 1.jQueryとjQuery Datatableプラグインのダウンロードと配置
自分の開発するWebページでjavascriptのプラグインを利用するためには、それをダウンロードして自分のわかりやすいフォルダに配置したものか、
インターネット上にあるリソースを参照する必要があります。  
今回はダウンロードしてしまいます。
1. jQueryのダウンロード  
[ここ](https://jquery.com/download/)からダウンロードしてきます。2018年6月16日時点で
「Download the compressed, production jQuery 3.3.1」と書かれたリンクをクリックして落ちてくるものを使用します。
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
