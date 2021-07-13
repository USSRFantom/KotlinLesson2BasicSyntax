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
        conditionalIfOperator()
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
    //условный оператор if
    fun conditionalIfOperator (){
        val a = 50
        //различий нет
        if(a < 40){
            Log.i("------->>>>>>проверка!", a.toString())
        }else{
            Log.i("------->>>>>>проверка!", a.toString())
        }

        val food:String
        val count = 400
        //Разница
        food = if (count > 500){
            "Пицца"
        }else if (count > 300){
            "шаурма"
        }else {
            "доширак"
        }
        Log.i("Сегодня мы сьедим", food)
    }


    //when
    fun methodWhen (){
        val a = "Сентябрь"
        val season : String
        when(a){
            "Октябрь", "Ноябрь", "Декабрь" ->{
               season =  "Осень"
            }
            "Январь", "Февраль", "Март" ->{
               season = "Зима"
            }
            "Апрель", "Май", "Июнь" ->{
               season =  "Весна"
            }
            "Июль", "Август", "Сентябрь" ->{
                season = "Лето"
            }
            else -> {
                season = "Ошибка"
            }
        }
    }
















}