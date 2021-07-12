package space.ussrfantom.kotlinlesson2basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variables()
        nullableTypes()
    }
    //Переменные
    fun variables(){
        val name = "Семен"  //переменная без типа, тип определяется автоматически
        var name2 = "Астап"  //константаБ переменная с неизменяемым значением как final  в java
        val name3 = name + " " + "и" + " " + name2
        Log.i("------->>>>>>проверка!", name3)
    }

            //нулабельные типы
    fun nullableTypes(){
        val types: String? = null  //создаем переменную которая хранит в себе null. именно знак ? дает это сделать
        Log.i("------->>>>>>проверка!", types?.length.toString()) //проверка, если вдруг у нас переменная null, чтобы не выпадал эксепшн. проверка на null
        val types2 = types?.length?:0  //проверяем если переменная не имеет значения присваиваем ей 0, если не то присваиваем необходимое число

    }


}