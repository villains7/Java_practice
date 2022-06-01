# 教材
ネクストドアのJava入門講座（YouTube）講師：菅原智先生
# Javaとは？


## 注意事項
<strong>コンパイル後に修正をした場合は再度コンパイルをすること</strong>
### データ型について
1. 基本データ型　→　整数、小数、真偽、文字、がある。入るものが整数とか文字とかそのもののこと
2. 参照型　→　文字列とか配列とか。　変数宣言する際のイメージとしては箱の中に文字列のアドレスの値（参照値）が入っているイメージ。

### データ型変換について
*　データ型は自動で変換される場合と、明示しなければならない場合がある。値の大きさが小さいものから大きいものは自動。逆はキャストで指示してあげる。


*　なぜか。<br>
ex) int i ; (３２ビットで表現できる)<br>double d ;(64ビットで表現できる)<br>d = i ;　大きい箱の中に小さい箱のものは確実に入るから自動<br>i = (int) d; ←　キャストが必要<br>
                

### 演算子について（優先順位順に記載)
1. インクリメント、デクリメント演算子（++,-- → +1,-1）ex) a++ →　aに１を加える　a= a+1,a+= 1
2. 四則演算子　ex) *,/,%,+,-
3. 比較演算子　ex) >,<,>=,<=,!=,==
4. かつ、または　ex) &&, ||
5. 代入、複合代入 ex) =,+=,-=,*=,/=,%=

### 構造化プログラミングとは
1. 順次進行 →　処理を順番にしていく
2. 分岐　→　条件によって違う処理結果を出す
3. 繰り返し →　指定した分処理を繰り返す 

#### switchについて
* 式（byte,short,int,char）の値によって処理が変わる場合に使う。基本的には分岐はifで書くが、場合によってはswitchを使うとよい。
#### forについて
for(式１:条件式:式２)…式１はカウンタ変数の準備をすることが多い。式２はカウンタ変数のインクリメント<br>
順番としては式１、処理、条件２、条件式の順番
## オブジェクト指向
* Javaには実行用のクラス（mainメソッド含む）と、設計図のクラスがある。
* 設計図には<strong>属性</strong>と<strong>操作</strong>が含まれる。属性→　<strong>何のデータを持っているか。</strong>　操作→　<strong>何の処理ができるか。</strong>
* 属性→プログラムの世界でいう変数のこと　　　操作→　プログラムの世界でいうメソッドのこと
* 設計図を流用すれば、データが増えても、設計図を基に実体（オブジェクト）が量産できる。→データの管理のしやすさや更新につよくなる

#### クラス
設計図クラスは`class クラス名｛ 変数の定義（データ型　変数名;）、メソッドの定義｝`で作成する

#### メソッドの定義方法
`戻り値の型　メソッド名（自分で決められる）（引数リスト）{}`
呼び出し元に返す値がある場合はreturnで指定する。なにも返さない場合は戻り値の型にvoidを記述する。
#### オブジェクトの使い方
1. 生成　`クラス名　オブジェクト名　= new クラス名();` `Student　stu1 = new Student();`イメージとしては設計図を基にからの入れ物を作る感じ。そして、オブジェクトにはこの入れ物の所在地が入っている。これをインスタンス化という。これにはデフォルト値が設定される。例えばint型なら、０。
2. 変数・メソッドを利用　`オブジェクト名.変数名;`　`オブジェクト名.メソッド名(引数);`で利用できる。例えば、`stu1.name = "佐野";`であればstu1の所在地のnameのなかに"佐野"の所在地を代入する。

コンパイルする場合はメインメソッドの入ったファイルをコンパイルする。

