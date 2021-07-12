package space.ussrfantom.kotlinlesson2basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variables()
    }
    //Переменные
    fun variables(){
        val name = "Семен"  //переменная без типа, тип определяется автоматически
        var name2 = "Астап"  //константаБ переменная с неизменяемым значением как final  в java
        val name3 = name + " " + "и" + " " + name2
        Log.i("------->>>>>>проверка!", name3)
    }


}