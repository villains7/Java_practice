# 教材
ネクストドアのJava入門講座（YouTube）講師：菅原智先生
# Javaとは？


## 注意事項
<strong>コンパイル後に修正をした場合は再度コンパイルをすること</strong>
### データ型について
1. 基本データ型　→　整数、小数、真偽、文字、がある。入るものが整数とか文字とかそのもののこと
2. 参照型　→　文字列とか配列とか。　変数宣言する際のイメージとしては箱の中に文字列のアドレスの値（参照値）が入っているイメージ。

## データ型変換について
*　データ型は自動で変換される場合と、明示しなければならない場合がある。値の大きさが小さいものから大きいものは自動。逆はキャストで指示してあげる。


*　なぜか。<br>
ex) int i ; (３２ビットで表現できる)<br>double d ;(64ビットで表現できる)<br>d = i ;　大きい箱の中に小さい箱のものは確実に入るから自動<br>i = (int) d; ←　キャストが必要<br>
                

### 演算子について（優先順位順に記載)
1. インクリメント、デクリメント演算子（++,-- → +1,-1）ex) a++ →　aに１を加える　a= a+1,a+= 1
2. 四則演算子　ex) *,/,%,+,-
3. 比較演算子　ex) >,<,>=,<=,!=,==
4. かつ、または　ex) &&, ||
5. 代入、複合代入 ex) =,+=,-=,*=,/=,%=

