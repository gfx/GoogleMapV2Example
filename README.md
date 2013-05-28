# Google Maps Android API v2

[GoogleのLocationClientを使ってみた](http://qiita.com/items/c6340a51600122033853)の続き。Google Play services library を使ってみたのでついでにGoogle Mapsも。

[Getting Started](https://developers.google.com/maps/documentation/android/start) 通りにやればとりあえずできるけど、時間がかかるのでメモ。

* API keyのために必要なSHA1 fingerprintは以下のコマンドで得る

```sh
# for debug certificate fingerprint
keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android

# for release cerficate fingerprint
keytool -list -v -keystore $your_keystore_name -alias $your_alias_name
```

* プロジェクトは Google Play services をライブラリとして参照する
* [Google apis](https://code.google.com/apis/console/) で設定をする
  * "API Access" で fingerprint を登録して API key を得る
  * "Services" の Google Maps Android API v2 を ON にする

* Android 2.3 もサポートする場合、`MapFragment`ではなく`SupportMapFragment`を使うこと
  * その他のFragment関係の箇所もサポートライブラリのものにする

これで動いた。
実際のコードは [gfx/GoogleMapV2Example](https://github.com/gfx/GoogleMapV2Example) を参照のこと。Android 2.3.4 と Android 4.2.2 で動作確認した。

# SEE ALSO

* https://developers.google.com/maps/documentation/android/
