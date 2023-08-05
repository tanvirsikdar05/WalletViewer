
# Blance View

Blance View help you to Show Blance easily like Bkash , Nogod Blance Check.

## Screenshots

![App Screenshot](https://github.com/tanvirsikdar05/BlanceView/assets/35676901/81369361-a5e2-460c-b18e-392151141b6c)




## Gradle

Add this Dependency to your android java/kotlin project

```bash
  dependencies {

	        implementation 'com.github.tanvirsikdar05:BlanceView:1.0.0'
	}
```
## Usage
```
<com.tanvirsikdar05.bkashblance.BlanceView
        android:id="@+id/blanceview"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:layout_margin="20dp"
        app:currencyImage="@drawable/btc"/>
```
For change Currency icon Use `app:currencyImage="Your_Drawable_icon"`

## Java / kotlin

```
val blanceView = findViewById<BlanceView>(R.id.blanceview) 
blanceView.setCurrentBlance("120")    //Set User Blance as String
blanceView.setOnClickListener {
         blanceView.show()            //show Blance
 }     
 ```
 To Set Blance call `blanceView.setCurrentBlance("Your_Blance_here")` Then Show Blance call this `blanceView.show()`                        



    
