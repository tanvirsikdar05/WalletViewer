
# Wallet Viewer

Wallet Viewer help you to Show Blance easily like Bkash , Nogod Blance Check.

## Screenshots

![App Screenshot](https://github.com/tanvirsikdar05/WalletViewer/assets/35676901/66de03c6-e447-47b0-976c-40abe516b35c)




## Gradle

Add this Dependency to your android java/kotlin project

```bash
  dependencies {

	        implementation 'com.github.tanvirsikdar05:WalletViewer:1.4.0'
	}
```
## Usage
```
<com.tanvirsikdar.walletviewer.WalletViewer
        android:id="@+id/walletview"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:currencyImage="@drawable/btcicon"/>
```
For change Currency icon Use `app:currencyImage="Your_Drawable_icon"`

## Java / kotlin

```
val _walletview = findViewById(R.id.walletview) 
_walletview.setCurrentBlance("120")    //Set User Blance as String
_walletview.setOnClickListener {
         _walletview.show()            //show Blance
 }     
 ```
 To Set Blance call `_walletview.setCurrentBlance("Your_Blance_here")` Then Show Blance call this `_walletview.show()`                        




